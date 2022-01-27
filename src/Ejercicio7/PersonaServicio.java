package Ejercicio7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author julib
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private final int IMC_BAJO = -1;
    private final int IMC_IDEAL = 0;
    private final int IMC_ALTO = 1;

    @SuppressWarnings("empty-statement")
    public Persona crearPersona() {

        System.out.println("Ingrese el nombre: ");
        String nombre = leer.next();

        try {
            nombre = null;

        } catch (NullPointerException e) {

            System.out.println(e.toString());
        }

        System.out.println("Ingrese la edad: ");
        int edad = 0;

        try {
            
            edad = leer.nextInt();
            
        } catch (InputMismatchException e) {

            System.out.print("Debe ingresar un numero");
        }
        
        System.out.println("Ingrese el sexo = 'H' Hombre, 'M' Mujer, 'O' Otro:");
        char sexo = Character.toUpperCase(leer.next().charAt(0));

        System.out.println("Ingrese el peso (kg): ");
        double peso = leer.nextDouble();
        
        System.out.println("Ingrese la altura (cm): ");
        double altura = leer.nextDouble();

        while (peso < 1) {
            System.out.println("Ingrese un superior a 0: ");
            peso = leer.nextDouble();
        }

        return new Persona(nombre, edad, sexo, peso, altura);

    }

    public int calcularIMC(Persona p) {

        double altura = p.getAltura();
        double peso = p.getPeso();
        double imc = peso / (Math.pow(altura, 2)); //Math.pow para usar la potencia

        if (imc < 20) {
            return IMC_BAJO;
        } else if (imc > 25) {
            return IMC_ALTO;
        } else {
            return IMC_IDEAL;
        }
    }

    public boolean esMayorDeEdad(Persona p)  {
        
        boolean mayor = p.getEdad() >= 18;
        try{
            p = null;
        }catch(NullPointerException e){
            
        }
        return mayor;
    }

    public Persona[] crearPersonas(int cant) throws ExceptionPropia, InputMismatchException {

        Persona[] personas = new Persona[cant];

        for (int i = 0; i < personas.length; i++) {

            personas[i] = crearPersona();
        }

        return personas;
    }

    public void porcentajePeso(Persona[] personas) {

        int ContadorAlto = 0;
        int ContadorBajo = 0;
        int ContadorIdeal = 0;
        int cantidadPersonas = personas.length;

        for (Persona persona : personas) {//FOR EACH: SIGNIFICA 'PARA CADA..'

            switch (calcularIMC(persona)) {

                case -1:
                    System.out.println(persona.getNombre() + " Esta por debajo del peso ideal");
                    ContadorBajo++;
                    break;
                case 0:
                    System.out.println(persona.getNombre() + " Esta en su peso ideal");
                    ContadorIdeal++;
                    break;
                case 1:
                    System.out.println(persona.getNombre() + " Esta por encima del peso ideal");
                    ContadorAlto++;
                    break;
            }
        }// en vez de 4, se puede usar el vector cantidadPersonas
        System.out.println("Hay" + (ContadorBajo * 100 / 4) + " % de personas que estan por debajo de su peso ideal");
        System.out.println("Hay" + (ContadorIdeal * 100 / 4) + " % de personas que estan en su peso ideal");
        System.out.println("Hay" + (ContadorAlto * 100 / 4) + " % de personas que estan por encima de su peso ideal");
    }

    public void porcentajeMayores(Persona[] personas) throws NullPointerException, ExceptionPropia {

        int cantidadPersonas = personas.length;
        int contadorMayor = 0;

        for (Persona persona : personas) {
            if (esMayorDeEdad(persona)) {
                contadorMayor++;
                System.out.println(persona.getNombre() + " es mayor de edad");
            }
        }

        System.out.println("Hay un " + (contadorMayor * 100 / 4) + "% de personas que son mayores de edad. ");
        System.out.println("Hay un " + (4 - contadorMayor * 100 / 4) + "% de personas que son menores de edad. ");

    }

}
