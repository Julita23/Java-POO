/*Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
Si necesiten acá tienen más información en clase Date: Documentacion Oracle.*/
package Ejercicio11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author julib
 */
public class DateMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // crear variables e instanciar clase Date
        
        int dia, mes, anio;
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        do{
            System.out.println("Ingrese el dia(dos digitos): ");
            dia = sc.nextInt();
            System.out.println("Ingrese el mes (dos digitos)");
            mes = sc.nextInt();
            System.out.println("Ingrese el año(cuatro digitos)");
            anio = sc.nextInt();
            
        }while(dia<0||dia>31 || mes<0||mes>12||anio<0);
        
        Date fecha = new Date(anio, mes, dia);
        System.out.println(fecha);
        
        Date fechaActual = new Date();
        
        int diferencia = fecha.getYear() - fechaActual.getYear();
        System.out.println("La diferencia entre "+fecha+" y "+fechaActual+ " es igual a: "+diferencia);
        
        
        
        
    }
    
}
