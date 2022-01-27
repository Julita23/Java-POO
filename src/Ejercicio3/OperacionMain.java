package Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author julib
 */
public class OperacionMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner leer=new Scanner(System.in);
        
        Operacion op1=new Operacion();
        
        op1.crearOperacion();
        System.out.println("La suma de ambos numeros es igual a: "+op1.suma());
        System.out.println("La resta de ambos numeros es igual a: "+op1.resta());
        
        if (op1.multiplicar()==0){
            System.out.println("El numero 0 es incorrecto, intente nuevamente");
        }
        else{
        System.out.println("La multiplicacion de ambos numeros es igual a: "+op1.multiplicar());
        }
        
        if (op1.dividir()==0){
            System.out.println("El numero 0 es incorrecto, intente nuevamente"); 
        }
        else{
             System.out.println("La division de ambos numeros es igual a: "+op1.dividir());
        }
        
    }
    
}
