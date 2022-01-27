/*Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
20
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número*/
package Ejercicio9;

/**
 *
 * @author julib
 */
public class MatematicaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // crear objeto
        
        Matematica mat = new Matematica();
        MatematicaService servicio = new MatematicaService();
        
        mat.setNum1(Math.random()*10);
        mat.setNum2(Math.random()*10);
        
        System.out.println("El numero mayor entre ambos es: "+servicio.devolverMayor(mat));
        System.out.println("La potencia del mayor numero elevado al menor es igual a: "+servicio.calcularPotencia(mat));
        System.out.println("La raiz cuadrada del numero minimo es igual a: "+servicio.calcularRaiz(mat));
    }
    
}
