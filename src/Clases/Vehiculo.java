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
public class Vehiculo {
    private String marca;
    private String modelo;
    private int referencia;
    private int valor;
    private Pieza piezasDiseñada;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int referencia, int valor, Pieza piezasDiseñada ) {
        this.marca = marca;
        this.modelo = modelo;
        this.referencia = referencia;
        this.valor = valor;
        this.piezasDiseñada = piezasDiseñada;
    }
    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the referencia
     */
    public int getReferencia() {
        return referencia;
    }

    /**
     * @param referencia the referencia to set
     */
    public void setReferencia(int referencia) {
        this.referencia = referencia;
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
     * @return the piezasDiseñada
     */
    public Pieza getPiezasDiseñada() {
        return piezasDiseñada;
    }

    /**
     * @param piezasDiseñada the piezasDiseñada to set
     */
    public void setPiezasDiseñada(Pieza piezasDiseñada) {
        this.piezasDiseñada = piezasDiseñada;
    }
    
    public void insertarVehiculo(){
        String marca, modelo;
        int referencia, valor;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la marca del vehiculo: ");
        marca = sc.next();
        System.out.println("Ingrese el modelo del vehiculo: ");
        modelo = sc.next();
        System.out.println("Ingrese el valor del vehiculo: ");
        valor = sc.nextInt();
        System.out.println("Ingrese la referencia del vehiculo: ");
        referencia = sc.nextInt();
        
        this.marca = marca;
        this.modelo = modelo;
        this.referencia = referencia;
        this.valor = valor;
    }
    
    public void mostrarDatos(){
        System.out.println("\nVEHICULO"
                + "\nMarca: "+getMarca()
                + "\nModelo: "+getModelo()
                + "\nReferencia: "+getReferencia()
                + "\nValor: "+getValor());
    }
}
