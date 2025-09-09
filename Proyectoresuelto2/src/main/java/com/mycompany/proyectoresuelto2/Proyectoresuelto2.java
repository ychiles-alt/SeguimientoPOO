/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectoresuelto2;

import java.util.Scanner;

/**
 *
 * @author YESICA CHILES
 */
public class Proyectoresuelto2 {

    public static void main(String[] args) {
        
    double suma, X, Y;
    
    Scanner Scanner = new Scanner (System.in); //lectura de la entrada dle teclado
    
    System.out.println("Ingresa un numero para suma:");
    suma= Scanner.nextDouble();//leer desde el teclado y asigna el valor a la variable suma
    
    System.out.println("Ingresa un numero para X:");
    X=Scanner.nextDouble();//Lee desde el teclado y asigna el valor a la varianle X
    
    System.out.println("Ingresa un numero para Y:");
    Y=Scanner.nextDouble();//Lee desde el teclado y asigna el valor a la variable Y
    
    suma= Calculos.calcular_suma(suma,X);
    X= Calculos.calcular_X(X,Y);
    
    suma=suma+(X/Y);
    
    System.out.println("El valor de la suma es:"+suma);
        
        
    }
}

    

