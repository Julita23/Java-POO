/*Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos: 
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
18
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada*/
package Ejercicio6;

import java.util.Scanner;

/**
 *
 * @author julib
 */
public class Cafetera {
    
    //la cantidad máxima de café que puede contener la cafetera
    //(la cantidad actual de café que hay en la cafetera
    private int CapacidadMax, CantActual;
    
    public Cafetera(){}
    
    public Cafetera(int CapacidadMax, int CantActual){
        
        this.CapacidadMax=CapacidadMax;
        this.CantActual=CantActual;
    }
    
    public int getCapacidadMax(){
    return CapacidadMax;
    }
    
    public void setCapacidadMax(int CapacidadMax){
        
        this.CapacidadMax = CapacidadMax;
    }

    public int getCantActual() {
        return CantActual;
    }

    public void setCantActual(int CantActual) {
        this.CantActual = CantActual;
    }
    
    public void crearCafetera(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
        System.out.println("Por favor ingrese la capacidad maxima de la cafetera: ");
        CapacidadMax= leer.nextInt();
        System.out.println("Ingrese la cantidad actual de cafe: ");
        CantActual= leer.nextInt();
    }
    
    public void vaciarCafetera(){
       
        if(CantActual==0){
            System.out.println("No podra llenarse la taza");
        }
    }
    
    public void agregarCafe(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int agregarCafe;
        
        if(CantActual<CapacidadMax){
            
        System.out.println("Por favor ingrese la cantidad de cafe a agregar: ");
        agregarCafe= leer.nextInt();
        CantActual=CantActual+agregarCafe;
        System.out.println("la cantidad anadida es: "+agregarCafe+" La cafetera tiene "+CantActual);
        
        }
    }
    
    public void llenarCafetera(){
        
        if(CapacidadMax==CantActual){
            
            System.out.println("La cafetera esta llena ");
        }
    }
    
    public void servirTaza(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int taza;
        
        System.out.println("Ingrese el tamanio de la taza vacia: ");
        taza=leer.nextInt();
        
        if (taza>CantActual){
            
            System.out.println("La taza no se lleno, se servira "+CantActual+" cm cubicos de cafe");
        }else{
            System.out.println("La taza se lleno de cafe");
        }
        
    }
    

}

