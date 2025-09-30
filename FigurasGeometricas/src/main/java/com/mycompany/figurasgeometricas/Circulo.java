/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas;

/**
 *
 * @author YESICA CHILES
 */
class Circulo{
    int radio; // Atributo que define el radio de un círculo

    // Constructor
    public Circulo(int radio) {
        this.radio = radio;
    }

    // Método que calcula el área
    double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    // Método que calcula el perímetro
    double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

    

