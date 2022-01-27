/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8;

/**
 *
 * @author julib
 */
public class CadenaServicio {
    
    public void mostrarVocales(String frase){
        
        int contador=0;
        frase = frase.toUpperCase();
        
        for(int i=0; i<frase.length(); i++){
            
            if(frase.charAt(i)=='A'||frase.charAt(i)=='E'|| frase.charAt(i)=='I'|| frase.charAt(i)=='O'|| frase.charAt(i)=='U'){
                contador++;
            }
        }
        System.out.println("La frase tiene "+contador+" vocales en total.");
    }
    
    public void invertirFrase(String frase){
        
        for(int i= frase.length()-1; i>0; i--){
            System.out.print(frase.charAt(i));
        }
        
        System.out.println("");
    }
    
    public void vecesRepetido(String frase, char letra){
        
        frase = frase.toLowerCase();
        int contador=0;
        
        for(int i=0; i<frase.length(); i++){
            
            if(frase.charAt(i)==letra){
                contador++;
            }
        }
        System.out.println("La letra "+letra+", esta repetida "+contador+" veces.");
    }
    
    public void compararFrases(String frase, String frase2){
        
        if(frase.length()<frase2.length()){
            System.out.println("La frase ingresada "+frase2+" tiene mas caracteres que la frase inicial "+frase);
        }else{
            System.out.println("La frase ingresada "+frase2+" tiene menos caracteres que la frase inicial "+frase);
        }
    }
    
    public String unirFrases(String frase, String frase3){
        
        String frases= frase+" "+frase3;
        return frases;
    }
    
    public void reemplazar(String frase, char letra2){
        
       System.out.println(frase.replace('a',letra2));
    }
    
    public boolean contiene(String frase, String letra3){
        
        if(frase.contains(letra3)){
            return true;
        }else{
            return false;
        }
    }
    
}
