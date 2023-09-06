package com.cga.prog.Actividad06;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int contadorOperacionesCorrectas = 0;

        System.out.println("¡Bienvenido al juego de sumas!");
        System.out.println("Resuelva la suma de dos números aleatorios entre 1 y 100.");

        do {
            int numero1 = random.nextInt(100) + 1;
            int numero2 = random.nextInt(100) + 1;

            int resultadoEsperado = numero1 + numero2;

            System.out.print("Suma de " + numero1 + " + " + numero2 + " = ");
            int respuesta = scanner.nextInt();

            if (respuesta == resultadoEsperado) {
                System.out.println("¡Respuesta correcta!");
                contadorOperacionesCorrectas++;
            } else {
                System.out.println("Respuesta incorrecta. El juego ha terminado.");
                break;
            }
        } while (true);

        System.out.println("Número de operaciones realizadas correctamente: " + contadorOperacionesCorrectas);
        scanner.close();
		

	}

}
