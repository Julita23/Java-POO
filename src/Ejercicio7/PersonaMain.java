package Ejercicio7;

import java.util.InputMismatchException;

/**
 *
 * @author julib
 */
public class PersonaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ExceptionPropia, NullPointerException, InputMismatchException {
       
        PersonaServicio servicio = new PersonaServicio();
        
//        Persona[] listaPersonas = servicio.crearPersonas(4);
//        servicio.porcentajePeso(listaPersonas);
//        servicio.porcentajeMayores(listaPersonas);
        
//        Persona p1 = new Persona();
//        Persona p1 = servicio.crearPersona();
        Persona p = null;
        
        try{
        servicio.esMayorDeEdad(p);
        }catch(NullPointerException e){
            System.out.println("Debe ingresar los valores antes de conocer la edad");
        }

    }
    
}
