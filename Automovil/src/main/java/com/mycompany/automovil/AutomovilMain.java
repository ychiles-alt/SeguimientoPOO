/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.automovil;

/**
 *
 * @author YESICA CHILES
 */
public class AutomovilMain {

    // ===== ENUMS =====
    public enum TipoCombustible {
        GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL
    }

    public enum TipoAutomovil {
        CARRO_CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV
    }

    public enum Color {
        BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA
    }

    // ===== CLASE AUTOMOVIL =====
    public static class Automovil {
        private String marca;
        private int modelo;
        private double motor;
        private TipoCombustible tipoCombustible;
        private TipoAutomovil tipoAutomovil;
        private int numeroPuertas;
        private int cantidadAsientos;
        private int velocidadMaxima;
        private Color color;
        private int velocidadActual = 0;
        private boolean esAutomatico;

        // Multas
        private int numeroMultas = 0;
        private double valorMultas = 0.0;
        private static final double VALOR_MULTA = 200000.0;

        // Constructor
        public Automovil(String marca, int modelo, double motor,
                         TipoCombustible tipoCombustible, TipoAutomovil tipoAutomovil,
                         int numeroPuertas, int cantidadAsientos, int velocidadMaxima,
                         Color color, boolean esAutomatico) {
            this.marca = marca;
            this.modelo = modelo;
            this.motor = motor;
            this.tipoCombustible = tipoCombustible;
            this.tipoAutomovil = tipoAutomovil;
            this.numeroPuertas = numeroPuertas;
            this.cantidadAsientos = cantidadAsientos;
            this.velocidadMaxima = velocidadMaxima;
            this.color = color;
            this.esAutomatico = esAutomatico;
            this.velocidadActual = 0;
        }

        // GET / SET automático
        public boolean isAutomatico() {
            return esAutomatico;
        }
        public void setAutomatico(boolean esAutomatico) {
            this.esAutomatico = esAutomatico;
        }

        // Acelerar con multa
        public void acelerar(int incrementoVelocidad) {
            if (velocidadActual + incrementoVelocidad <= velocidadMaxima) {
                velocidadActual += incrementoVelocidad;
                System.out.println("Velocidad actual = " + velocidadActual);
            } else {
                System.out.println("No se puede incrementar a una velocidad superior a la maxima del automovil. Multa generada.");
                numeroMultas++;
                valorMultas += VALOR_MULTA;
            }
        }

        // Desacelerar
        public void desacelerar(int decrementoVelocidad) {
            if (velocidadActual - decrementoVelocidad >= 0) {
                velocidadActual -= decrementoVelocidad;
                System.out.println("Velocidad actual = " + velocidadActual);
            } else {
                System.out.println("No se puede decrementar a una velocidad negativa.");
            }
        }

        // Frenar
        public void frenar() {
            velocidadActual = 0;
            System.out.println("Velocidad actual = " + velocidadActual);
        }

        // Métodos multas
        public boolean tieneMultas() {
            return numeroMultas > 0;
        }
        public double getValorMultas() {
            return valorMultas;
        }

        // Imprimir atributos
        public void imprimir() {
            System.out.println("Marca = " + marca);
            System.out.println("Modelo = " + modelo);
            System.out.println("Motor = " + motor);
            System.out.println("Tipo de combustible = " + tipoCombustible);
            System.out.println("Tipo de automovil = " + tipoAutomovil);
            System.out.println("Numero de puertas = " + numeroPuertas);
            System.out.println("Cantidad de asientos = " + cantidadAsientos);
            System.out.println("Velocidad maxima = " + velocidadMaxima);
            System.out.println("Color = " + color);
            System.out.println("Velocidad actual = " + velocidadActual);
        }
    }

    // ===== MAIN =====
    public static void main(String[] args) {
        Automovil auto1 = new Automovil(
                "Ford", 2018, 3.0,
                TipoCombustible.DIESEL,
                TipoAutomovil.EJECUTIVO,
                5, 6, 250,
                Color.NEGRO,
                true
        );

        auto1.imprimir();

        auto1.acelerar(100);
        auto1.acelerar(20);
        auto1.desacelerar(50);
        auto1.frenar();
        auto1.desacelerar(20);

        if (auto1.tieneMultas()) {
            System.out.println("Valor total de multas = $" + (long) auto1.getValorMultas());
        }
    }
}
  
