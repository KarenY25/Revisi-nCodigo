package com.ejercicio4;

import java.util.Scanner; // Importar Scanner

public class Ejercicio4 {

    public static void main(String[] args) { // Se agrega main

        Scanner s = new Scanner(System.in);  //se agrega system.in

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine();

        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String j2 = s.nextLine();

        if (j1.equals(j2)) {
            System.out.println("Empate");
        } else {
            int g = 2; 

            switch (j1) {
                case "piedra":
                    if (j2.equals("tijeras")) {
                        g = 1; 
                    }
                    break;  //se agrega break
                case "papel":
                    if (j2.equals("piedra")) {
                        g = 1; 
                    }
                    break; //se agrega break
                case "tijeras":
                    if (j2.equals("papel")) {
                        g = 1; 
                    }
                    break; //se agrega break
                default:
                    // Imprimir un mensaje de error y terminar el programa
                    System.out.println("Entrada inválida");
                    s.close();
                    return; // Salir del método main
            }
            System.out.println("Gana el jugador " + g);
        }

        // Cerrar el objeto Scanner
        s.close();
    }
}