/*Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), deberá recibir por parámetro un carácter
ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no*/
package Ejercicio8;

import java.util.Scanner;

/**
 *
 * @author julib
 */
public class CadenaMain {

    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in).useDelimiter("\n");
         
         Cadena cadena1 = new Cadena(); // cree el objeto cadena
         CadenaServicio cadenaServicio = new CadenaServicio();
         
         //Ingresa frase por teclado.
         System.out.println("Ingrese una frase o palabas separadas con un espacio en blanco: ");
         String frase = sc.nextLine();
         //setteamos los atributos.
         cadena1.setFrase(frase);
         cadena1.setLongitud(frase.length());
         
         //Mostramos la cantidad de vocales y la frase invertida.
         cadenaServicio.mostrarVocales(frase);
         cadenaServicio.invertirFrase(frase);
         
         //El usuario ingresa un caracter y muestra la cantidad de veces que esta repetida 
         //en la frase ingresada.
         System.out.println("Ingrese un caracter: ");
         char letra=sc.nextLine().charAt(0);
         cadenaServicio.vecesRepetido(frase, letra);
         
         //El usuario ingresa una frase para compararla con la ingresada anteriormente.
         System.out.println("Ingrese una nueva frase, para compararla con la anterior: ");
         String frase2=sc.nextLine();
         cadenaServicio.compararFrases(frase, frase2);
         
         //El usuario ingresa una frase para unirla a la frase ingresada anteriormente.
         System.out.println("Ingrese una nueva frase, para uniarla a la anterior: ");
         String frase3=sc.nextLine();
         System.out.println(cadenaServicio.unirFrases(frase, frase3));
         
         //El usuario ingresa un caracter para que remplace en la frase a la letra 'A'.
         System.out.println("Ingrese un caracter para que reemplace la letra A: ");
         char letra2=sc.nextLine().charAt(0);
         cadenaServicio.reemplazar(frase, letra2);
         
         System.out.println("Ingrese un caracter para ver si se encuentra en la frase: ");
         String letra3=sc.nextLine();
         boolean contiene=cadenaServicio.contiene(frase, letra3);
         
         if(contiene==true){
             System.out.println("La frase contiene al caracter: "+letra3);
         }else{
             System.out.println("La frase no contiene al caracter: "+letra3);
         }
    }
    
}
