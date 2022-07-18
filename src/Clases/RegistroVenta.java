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
public class RegistroVenta {
    private Empleado empleado;
    private int valor;
    private Items items;

    public RegistroVenta() {
    }

    public RegistroVenta(Empleado empleado, int valor, Items items) {
        this.empleado = empleado;
        this.valor = valor;
        this.items = items;
    }
    /**
     * @return the empleado
     */
    public Empleado getEmpleado() {
        return empleado;
    }

    /**
     * @param empleado the empleado to set
     */
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * @return the items
     */
    public Items getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(Items items) {
        this.items = items;
    }
    
    public void registrarVenta(){
        int valor;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de la venta ");
    }
}
