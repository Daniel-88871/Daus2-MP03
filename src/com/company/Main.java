package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opcion;
        int opcion2;
        int victorias = 0;
        int derrotas = 0;
        int total = 0;
        boolean a = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("=======Menu=======");
        System.out.println("******************");
        System.out.println("1.Daus");
        System.out.println("2.Parxis");
        System.out.println("3.Tic Tac Toe");
        System.out.println("4.Exit");
        System.out.println("******************");
        opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                while (!a) {
                    JocDaus juego = new JocDaus();
                    total++;
                    if (juego.jugar()) {
                        victorias++;
                        System.out.println("Has ganado!!");
                    } else {
                        derrotas++;
                        System.out.println("Has perdido :(");
                    }

                    System.out.println("Quieres jugar Otra? pulsa 1 para jugar de nuevo o pulsa cualquier otro número para salir");
                    opcion2 = scanner.nextInt();

                    if (opcion2 == 1) {
                    } else {
                        total = victorias + derrotas;
                        System.out.println("Has jugado " + total + ", has ganado " + victorias + " y has perdido " + derrotas);
                        System.exit(0);
                    }
                }
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                System.exit(0);
                break;
        }
    }
}