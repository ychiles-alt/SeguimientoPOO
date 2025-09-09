/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto1;

/**
 *
 * @author YESICA CHILES
 */
public class Proyecto1 {

    public static void main(String[] args) {
    double edjuan =9; 
    double edalber, edana, edmama ;
    edalber =calculos.calcular_edalber (edjuan);
    edana= calculos.calcular_edana (edjuan);
    edmama=calculos.calcular_edmama(edjuan, edalber, edana);
    System.out.println (" Juan: " + edjuan);
    System.out.println (" Ana: " + edana);
    System.out.println (" Alberto: " + edalber);
    System.out.println (" Mama: " + edmama);
    }
}
