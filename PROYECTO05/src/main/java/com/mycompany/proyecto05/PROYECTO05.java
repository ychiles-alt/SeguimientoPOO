/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto05;

import java.util.Scanner;

/**
 *
 * @author YESICA CHILES
 */
public class PROYECTO05 {

    public static void main(String[] args) {
    
    double radio, longitud_circunferencia , area_circulo;
    
    Scanner scanner = new Scanner(System.in);//lectura de la entrada del teclado
    
    System.out.println("Ingresa un numero para el radio:");
    radio= scanner.nextDouble();
    
    
    longitud_circunferencia= Calculos.calcular_longitud(radio);
    area_circulo = Calculos.calcular_area_circulo(radio);
    
    
    System.out.println("Longitud de la circunferencia:"+ longitud_circunferencia);
    System.out.println("Area del circulo:" + area_circulo);
    
  }
}
