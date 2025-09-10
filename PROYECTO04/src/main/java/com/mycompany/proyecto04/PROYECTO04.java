/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto04;

import java.util.Scanner;

/**
 *
 * @author YESICA CHILES
 */
public class PROYECTO04 {

    public static void main(String[] args) {
     double numero, cuadrado, cubo;
     
    Scanner scanner= new Scanner(System.in);//lectura de la entrada del teclado
     
    System.out.println("Ingresa un numero:");
    numero= scanner.nextDouble();
     
    cuadrado=Calculos.calcular_cuadrado(numero);
    cubo=Calculos.calcular_cubo(numero);
    
    System.out.println("Numero: "+ numero);
    System.out.println("Cuadrado: "+ cuadrado);
    System.out.println("Cubo: "+ cubo);
    }
}
