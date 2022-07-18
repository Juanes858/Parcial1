/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Juan Esteban Acosta
 */
public class Items {
    private Pieza piezas;
    private ArrayList Vehiculo;

    public Items() {
    }

    public Items(Pieza piezas, ArrayList Vehiculo ) {
        this.piezas = piezas;
        this.Vehiculo = Vehiculo;
    }
    /**
     * @return the piezas
     */
    public Pieza getPiezas() {
        return piezas;
    }

    /**
     * @param piezas the piezas to set
     */
    public void setPiezas(Pieza piezas) {
        this.piezas = piezas;
    }

    /**
     * @return the Vehiculo
     */
    public ArrayList getVehiculo() {
        return Vehiculo;
    }

    /**
     * @param Vehiculo the Vehiculo to set
     */
    public void setVehiculo(ArrayList Vehiculo) {
        this.Vehiculo = Vehiculo;
    }
}
