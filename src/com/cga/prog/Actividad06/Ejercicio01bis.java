package com.cga.prog.Actividad06;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio01bis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int intentos = 0;
        int intento;

        System.out.println("¡Bienvenido al juego de adivinar el número secreto!");
        System.out.println("Se ha generado un número entre 1 y 100.");

        do {
            System.out.print("Por favor introduzca un número: ");
            intento = scanner.nextInt();
            intentos++;

            if (intento < numeroSecreto) {
                System.out.println("El número generado es mayor que " + intento);
            } else if (intento > numeroSecreto) {
                System.out.println("El número generado es menor que " + intento);
            } else {
                System.out.println("¡Perfecto! Ha adivinado el número secreto.");
                System.out.println("El número de intentos para adivinar el número secreto ha sido de " + intentos + ".");
            }
        } while (intento != numeroSecreto);

        scanner.close();

	}

}
