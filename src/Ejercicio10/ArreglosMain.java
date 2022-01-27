/*Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20*/
package Ejercicio10;

import java.util.Arrays;

/**
 *
 * @author julib
 */
public class ArreglosMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creo objeto
        Arreglos newarreglo = new Arreglos();
        
        //inicializo ambos
        double arreglo1[]= new double [50];
        double arreglo2[]= new double [20];
        
        //relleno con num aleatorios del 0 al 100 el primer arreglo
        for(int i=0; i<50;i++){
            arreglo1[i]=(Math.random()*100);
        }
        
        System.out.println("Contenido primer arreglo: ");
        System.out.println(Arrays.toString(arreglo1));
        
        //Ordenar de menor a mayor
        Arrays.sort(arreglo1);
        
        //copiar los 10 primeros num del arreglo1 y pasarlos al arreglo2
           for (int i = 0; i < 10; i++) {
           arreglo2[i] = arreglo1[i];
        }
        //relleno los ultimos numeros con 0.5
        for(int i=10; i<20; i++){
            arreglo2[i] = 0.5;
        }
        
        newarreglo.setArregloA(arreglo1);
        newarreglo.setArregloB(arreglo2);
         //mostrar arreglos: el ordenado y el combinado
         System.out.println("Primer arreglo ordenado de menor a mayor: ");
         System.out.println(Arrays.toString(newarreglo.getArregloA()));
         System.out.println("Segundo arreglo combinado: ");
         System.out.println(Arrays.toString(newarreglo.getArregloB()));
    }
    
}
