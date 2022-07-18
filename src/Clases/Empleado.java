/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author Juan Esteban Acosta
 */
public class Empleado {
    private String cedula;
    private String nombre;
    private String telefono;
    private String fechaNacimiento;

    public Empleado() {
    }

    public Empleado(String cedula, String nombre, String telefono, String fechaNacimiento ) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }
    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the fechaNacimiento
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public void registrarEmpleado(){
        String cedula, nombre, telefono, fechaNacimiento;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("REGISTRANDO EMPLEADO..");
        System.out.println("Ingrese su cedula: ");
        cedula = sc.next();
        System.out.println("Ingrese su nombre: ");
        nombre = sc.next();
        System.out.println("Ingrese su telefono: ");
        telefono = sc.next();
        System.out.println("Ingrese su fecha de nacimiento en dd/mm/aa: ");
        fechaNacimiento = sc.next();
        
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    public void mostrarEmpleado(){
        System.out.println("\nEMPLEADO"
                + "\nnombre: "+getNombre()
                + "\nCedula: "+getCedula()
                + "\nTelefono: "+getTelefono()
                + "\nFecha de nacimiento: "+getFechaNacimiento());
    }
    
}
