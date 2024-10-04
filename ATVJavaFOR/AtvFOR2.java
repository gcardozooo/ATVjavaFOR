/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atvfor2;

import java.util.Scanner;

public class AtvFOR2 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Informe um número de 1 a 10: ");
            int numero = scanner.nextInt();
            
            if (numero < 1 || numero > 10) {
                System.out.println("Por favor, informe um número válido entre 1 e 10.");
            } else {
                System.out.println("Tabuada de " + numero + ":");
                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero + " x " + i + " = " + (numero * i));
                }
            }
        }
    }
}
