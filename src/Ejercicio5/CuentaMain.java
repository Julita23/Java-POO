/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import java.util.Scanner;

/**
 *
 * @author julib
 */
public class CuentaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CuentaBancaria c1=new CuentaBancaria();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        c1.crearCuenta();
        
        int opc;
        String verificacion = "";
        do {
             System.out.println("______________________________________");
              
        System.out.println("MENU");
        System.out.println("1-Ingresar dinero");
        System.out.println("2-Retirar dinero");
        System.out.println("3.Extraccion Rapida");
        System.out.println("4-Consultar Saldo");
        System.out.println("5-Consultar Mis Datos");
        System.out.println("6-Salir");
        
        System.out.println("elija una de las opciones del  menu: ");
        opc = leer.nextInt();
            
            switch (opc) {
                case 1:
                    
                    c1.Ingreso();
                    break;
                case 2:
                    
                    c1.Retiro();
                    break;
                case 3:
                   
                    c1.ExtraccionRapida();
                    break;
                case 4:
                    c1.ConsultarSaldo();
                    break;
                case 5:
                    c1.MostrarDatos();
                    break;
                case 6:
                    System.out.println("¿Desea terminar la operacion (S/N)?");
                    verificacion = leer.next();
                default:
                    if (!verificacion.equalsIgnoreCase("S")) {
                        System.out.println("La opccion elegida es incorrecta.");
                    }
            }
        } while (opc < 6 || !verificacion.equalsIgnoreCase("S"));
        
     
    }
    
}

