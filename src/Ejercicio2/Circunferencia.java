/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author julib
 */
public class Circunferencia {
    
    Scanner leer=new Scanner(System.in);
    
    private double radio;
    
   
public Circunferencia(){
    
}

public Circunferencia(double radio1){
   radio=radio1;
}

public void setRadio(double radio){
    this.radio=radio;
}
public double getRadio(){
    return radio;
}

public void crearCircunferencia(){
     
      Scanner leer=new Scanner(System.in);
      System.out.println("Ingrese el radio: ");
      radio= leer.nextDouble();
       System.out.println("El radio es igual a: "+radio);
}
public void areaCircunferencia(){
    
    double Area;
    Area = Math.PI * Math.pow(radio,2);
    System.out.println("El radio es igual a: "+Area);
}
public void perimetroCircunferencia(){
    
    double Perimetro;
    Perimetro = 2*Math.PI*radio;
    System.out.println("El radio es igual a: "+Perimetro);
}

}
