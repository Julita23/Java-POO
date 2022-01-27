/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio9;

/**
 *
 * @author julib
 */
public class MatematicaService {
    
    public double devolverMayor(Matematica mats){
        
        if(mats.getNum1()>mats.getNum2()){
            return mats.getNum1();
        }else{
            return mats.getNum2();
        }
    }
    
    public double calcularPotencia(Matematica pot){
        
        double maximo = Math.max(pot.getNum1(), pot.getNum2());
        double minimo = Math.min(pot.getNum1(), pot.getNum2());
        return Math.pow(Math.round(maximo), Math.round(minimo));
    }
    
    public double calcularRaiz(Matematica raiz){
        
        double minimo = Math.min(raiz.getNum1(), raiz.getNum2());
        return Math.sqrt(Math.abs(minimo));
    }
}
