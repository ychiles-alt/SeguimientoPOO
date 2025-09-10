/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto03;

import java.util.Scanner;

/**
 *
 * @author YESICA CHILES
 */
public class PROYECTO03 {

    public static void main(String[] args) {
       double horas_trabajadas, valor_hora, retencion, salario_bruto, salario_neto;
    
    Scanner Scanner= new Scanner(System.in);//lectura de la entrada del teclado
    
    System.out.println("Ingrese un numero para las horas_trabajadas:");
    horas_trabajadas= Scanner.nextDouble();
    
    
    System.out.println("Ingrese un numero para el valor_hora:");
    valor_hora= Scanner.nextDouble();
    
    
    System.out.println("Ingrese un numero para la retencion:");
    retencion= Scanner.nextDouble();
    
    
    salario_bruto = Calculos.calcular_salario_bruto (horas_trabajadas, valor_hora);
    retencion = Calculos.calcular_porcentaje_retencion(retencion);
    
    double valor_retencion_fuente = Calculos.calcular_valor_retencion_fuente(retencion, salario_bruto);
    
    salario_neto= Calculos.calcular_salario_neto(salario_bruto, valor_retencion_fuente);
    
    System.out.println("Salario Bruto:" + salario_bruto);
    System.out.println("Valor retencion en la fuente:" + valor_retencion_fuente);
    System.out.println("Salario Neto:" + salario_neto);
    
    }
   
}