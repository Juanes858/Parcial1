/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Juan Esteban Acosta
 */
public class Pieza {

    /**
     * @return the codigoRef
     */
    private int codigoRef;
    private String descrp;
    private int valor;

    public Pieza() {
    }

    public Pieza(int codigoRef, String descrp, int valor) {
        this.codigoRef = codigoRef;
        this.descrp = descrp;
        this.valor = valor;
    }
    public int getCodigoRef() {
        return codigoRef;
    }

    /**
     * @param codigoRef the codigoRef to set
     */
    public void setCodigoRef(int codigoRef) {
        this.codigoRef = codigoRef;
    }

    /**
     * @return the descrp
     */
    public String getDescrp() {
        return descrp;
    }

    /**
     * @param descrp the descrp to set
     */
    public void setDescrp(String descrp) {
        this.descrp = descrp;
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
   
    
}
