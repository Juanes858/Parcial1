/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_1;

import Clases.Catalogo;
import Clases.Empleado;
import Clases.Vehiculo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Parcial1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        ArrayList<Catalogo> catalogos = new ArrayList<>();
        ArrayList<Vehiculo> vehiculos  = new ArrayList<>();
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        
        int opcion = 0, opcion2 = 0;
        
        while (opcion != 5) {
            System.out.println("Seleccione la opcion que desea realizar:"
                    + "\n1. Login"
                    + "\n2. Register"
                    + "\n3. mostrar empleados"
                    + "\n4. Catalogo");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    String nombreEmpleado, cedulaEmpleado;
                    System.out.println("Digite su nombre: ");
                    nombreEmpleado = sc.next();
                    System.out.println("Digite su cedula: ");
                    cedulaEmpleado = sc.next();
                    
                    for (int iteracionEMpleados = 0; iteracionEMpleados < empleados.size(); iteracionEMpleados++) {
                        
                        if(empleados.get(iteracionEMpleados).getNombre().equalsIgnoreCase(nombreEmpleado) && empleados.get(iteracionEMpleados).getCedula().equalsIgnoreCase(cedulaEmpleado)){
                            System.out.println("==============================");
                            System.out.println("ACABA DE INGRESAR AL SISTEMA");
                            System.out.println("==============================");
                            System.out.println("Seleccione la opcion de desea realizar:"
                                    + "\n1. Registrar una venta"
                                    + "\n2. Catalogo");
                            opcion2 = sc.nextInt();
                            switch(opcion2){
                                case 1:
                                    System.out.println("Esta registrando una venta");
                                    break;
                                case 2:
                                    int opcion3 = 0;
                                    while (opcion3 != 4){
                                        System.out.println("CATALOGO"
                                            + "\n1. Mostrar Catalogo"
                                            + "\n2. Insertar Catalogo"
                                            + "\n3. Insertar vehiculo"
                                            + "\n4. Salir");
                                    
                                    opcion3 = sc.nextInt();
                                    switch(opcion3){
                                        case 1:
                                            for(Catalogo cat:catalogos){
                                                cat.mostrarCatalogo();
                                            }
                                            break;
                                        case 2:
                                            Catalogo cat = new Catalogo();
                                            ArrayList<Vehiculo> vehiculosVacio = new ArrayList<>();
                                            cat.insertarCatalogo();
                                            cat.setVehiculo(vehiculosVacio);
                                            catalogos.add(cat);
                                            break;
                                        case 3:
                                            String Añopublicacion;
                                            System.out.println("Ingrese el año del catalogo donde quiere insertar el vehiculo: ");
                                            Añopublicacion = sc.next();
                                            
                                            for (int iteracionCatalogos = 0; iteracionCatalogos < catalogos.size(); iteracionCatalogos++) {
                                                if(catalogos.get(iteracionCatalogos).getFechaPublicacion().equalsIgnoreCase(Añopublicacion)){
                                                    Vehiculo veh = new Vehiculo();
                                                    veh.insertarVehiculo();
                                                    vehiculos.add(veh);
                                                }
                                            }
                                            break;
                                        }
                                    }
                                    break;
                            }
                        }
                        
                    }
                    break;
                case 2:
                    Empleado empleado = new Empleado();
                    empleado.registrarEmpleado();
                    empleados.add(empleado);
                    break;
                case 3:
                    System.out.println("EMPLEADOS");
                    for (Empleado empleadoO: empleados){
                        empleadoO.mostrarEmpleado();
                    }
                    break;
                case 4:
                    
                    break;
                default:
                    break;
            }   
        }
    }
    
}


