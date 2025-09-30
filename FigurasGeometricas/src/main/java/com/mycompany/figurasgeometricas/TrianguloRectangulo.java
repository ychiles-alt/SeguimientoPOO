/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas;

/**
 *
 * @author YESICA CHILES
 */
class TrianguloRectangulo {
    int base;
    int altura;

    // Constructor
    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularArea() {
        return (base * altura) / 2.0;
    }

    double calcularHipotenusa() {
        return Math.pow((base * base + altura * altura), 0.5);
    }

    double calcularPerimetro() {
        return base + altura + calcularHipotenusa();
    }

    void determinarTipoTriangulo() {
        double hipotenusa = calcularHipotenusa();

        if (base == altura && base == hipotenusa) {
            System.out.println("Es un triángulo equilátero");
        } else if (base != altura && base != hipotenusa && altura != hipotenusa) {
            System.out.println("Es un triangulo escaleno");
        } else {
            System.out.println("Es un triangulo isosceles");
        }
    }
}
 

