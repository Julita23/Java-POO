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
public class Rectangulo {
    
    private int base,altura;
    
    public Rectangulo(){}
    
    public Rectangulo(int base, int altura){
        this.base=base;
        this.altura=altura;
    }
    
    public void setBase (int base){
        this.base=base;
    }
    
    public int getBase(){
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la base y la altura del rectangulo: ");
        base= leer.nextInt();
        altura= leer.nextInt();
    }
    
    public int superficie(){
        int superficie=base*altura;
        return superficie;
    }
    
    public int perimetro(){
        int perimetro=(base+altura)*2;
        return perimetro;
    }
    
    public void dibujoRectangulo(){
        System.out.println("Rectangulo: ");
        System.out.println("");
        
        for(int i=0; i<altura; i++){
            for(int j=0; j<base; j++){
                
                System.out.print("*"+" ");
                
            }
            System.out.println("");   
        }
    }
}
