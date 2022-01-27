/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio12;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author julib
 */
public class PersonaServicio {
    
    public Persona crearPersona(){
        
        Persona NewPersona = new Persona();
        
        int dia, mes, anio;
        Scanner sc = new Scanner(System.in).useDelimiter("/n");
        
        System.out.println("Ingrese su nombre: ");
        NewPersona.setNombre(sc.nextLine());
        
        do{
        System.out.println("Ingrese su dia de nacimiento con dos digitos: ");
        dia= sc.nextInt();
        System.out.println("Ingrese su mes de nacimiento con dos digitos: ");
        mes= sc.nextInt();
        System.out.println("Ingrese su anio de nacimiento: ");
        anio=sc.nextInt();
        }while(dia<0 || dia>31 || mes<0 || mes>12 || anio<0);
        
        Date Fecha = new Date(anio-1900, mes-1,dia);
        return NewPersona;
    }
    
    public int calcularEdad(Persona persona){
        
        Date FechaActual = new Date();
        return (FechaActual.getYear()-persona.getFechaNac().getYear());
    }
    
    public boolean menorQue(int edad, int edad1){
        
        if(edad<edad1){
            return true;
        }else{
            return false;
        }
    }
    
    public void mostrarPersona(Persona persona){
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Fecha de Nacimiento: "+persona.getFechaNac().getDate()+"/"+(persona.getFechaNac().getMonth()+1)+"/"+(persona.getFechaNac().getYear()+1900));
    
    
}
}