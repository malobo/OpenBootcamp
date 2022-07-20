/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworldapp;

/**
 *
 * @author mjlb1
 */
public class Main {

    public static void main(String[] args) {
        // Ejercicio tema 3 - Parte 1
        int resultado;        
        int a=10;
        int b=20;
        int c=30;
        resultado = sumar(a,b,c);        
        System.out.println("El resultado de la función sumar con los parámetros ("+a+","+b+","+c+") es igual a "+resultado);
        
        
        // Ejercicio tema 3 - Parte 2
        Coche miCoche = new Coche();        
        miCoche.sumarPuerta();
        System.out.println("Después de llamar al procedimiento sumarPuerta del objeto miCoche, el objeto miCoche tiene "+miCoche.puertas+" puertas");
        
    }
    
    public static int sumar( int sumando1, int sumando2, int sumando3){
        return sumando1+sumando2+sumando3;
    }
}

    
    class Coche{
        public int puertas=0;
        
        public void sumarPuerta(){
            this.puertas++;
        }
        
    }
