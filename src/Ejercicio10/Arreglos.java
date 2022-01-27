/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio10;

/**
 *
 * @author julib
 */
public class Arreglos {
    
    private double [] arregloA;
    private double [] arregloB;

    public Arreglos() {}

    public Arreglos(double[] arregloA, double[] arregloB) {
        this.arregloA = arregloA;
        this.arregloB = arregloB;
    }

    public double[] getArregloA() {
        return arregloA;
    }

    public void setArregloA(double[] arregloA) {
        this.arregloA = arregloA;
    }

    public double[] getArregloB() {
        return arregloB;
    }

    public void setArregloB(double[] arregloB) {
        this.arregloB = arregloB;
    }

    @Override
    public String toString() {
        return "Arreglos{" + "arregloA=" + arregloA + ", arregloB=" + arregloB + '}';
    }
    
    
    
}
