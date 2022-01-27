/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author julib
 */
public class Metodos {

            String ISBN;
            String Titulo;
            String Autor;
            int Paginas;
            
public Metodos(){
    
}

    public void IngresoDatos() {
        // El usuario ingrese los atributos.
        
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el ISBN");
        ISBN = leer.next();
        System.out.println("Ingrese el Titulo del libro");
        Titulo = leer.next();
        System.out.println("Ingrese el Autor del libro");
         Autor = leer.next();
        System.out.println("Ingrese la cantidad de paginas del libro");
         Paginas = leer.nextInt();
    }
    
    // Crear un metodo que muestre por pantalla los atributos ingresados
    //X el usuario
    
    public void mostrardatos(){
        
        Scanner leer=new Scanner(System.in);
        
        System.out.println("El ISBN del libro es: "+ISBN);
        System.out.println("El Titulo del libro es: "+Titulo);
        System.out.println("El Autor del libro es: "+Autor);
        System.out.println("La cantidad de paginas del libro es: "+Paginas);
    }
}
