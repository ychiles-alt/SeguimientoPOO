/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto05;

/**
 *
 * @author YESICA CHILES
 */
public class Calculos {
    static double calcular_longitud(double radio){
        double longitud_circunferencia= 2*Math.PI *radio;
        return longitud_circunferencia;
    }
    
    static double calcular_area_circulo(double radio){
        double area_circulo =Math.PI * Math.pow(radio,2);
        return area_circulo;
    }

    }
