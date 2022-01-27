/*Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2*/
package Ejercicio4;

import java.util.Scanner;

/**
 *
 * @author julib
 */
public class RectanguloMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        Rectangulo rect1= new Rectangulo();
        
        rect1.crearRectangulo();
        System.out.println("La superficie del rectangulo es: "+rect1.superficie());
        System.out.println("El perimetro del rectangulo es: "+rect1.perimetro());
        
        rect1.dibujoRectangulo();
        
    }
    
}
