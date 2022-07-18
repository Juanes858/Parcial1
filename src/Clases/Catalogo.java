/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan Esteban Acosta
 */
public class Catalogo {
    private ArrayList<Vehiculo> vehiculos;
    private String fechaPublicacion;

    public Catalogo() {
    }

    public Catalogo(ArrayList Vehiculo, String fechaPublicacion) {
        this.vehiculos = Vehiculo;
        this.fechaPublicacion = fechaPublicacion;
    }

    /**
     * @return the Vehiculo
     */
    public ArrayList getVehiculo() {
        return vehiculos;
    }

    /**
     * @param Vehiculo the Vehiculo to set
     */
    public void setVehiculo(ArrayList Vehiculo) {
        this.vehiculos = Vehiculo;
    }

    /**
     * @return the fechaPublicacion
     */
    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    /**
     * @param fechaPublicacion the fechaPublicacion to set
     */
    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    
    public void insertarCatalogo(){
        String fechaPublicacion;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escriba la fecha de´publicacion: ");
        fechaPublicacion = sc.next();
        
        this.fechaPublicacion = fechaPublicacion;
    }
    public void mostrarCatalogo(){
        
        System.out.println("Año de pulicacion del catalogo: "+getFechaPublicacion());
        for (Vehiculo vehiculo: this.vehiculos){
            vehiculo.mostrarDatos();
        }
    }
    
}
