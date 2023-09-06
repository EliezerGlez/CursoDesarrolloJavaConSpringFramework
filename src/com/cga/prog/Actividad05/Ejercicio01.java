//		Crear un programa que, dado el peso en Kilogramos y la
//		altura en metros de una persona, calcule y muestre por pantalla su
//		Índice de Masa Corporal (IMC). Este índice pretende determinar el
//		intervalo de peso más saludable que puede tener una persona. El valor
//		de este índice se calcula mediante la siguiente expresión:
//		IMC = peso / altura2
//		Se suele establecer un intervalo de 18 a 25 como saludable en personas adultas.
//		Utilizar el método pow() de la clase Math.
package com.cga.prog.Actividad05;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario su peso en kilogramos
        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();

        // Solicitar al usuario su altura en metros
        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        // Calcular el IMC utilizando la fórmula IMC = peso / (altura^2)
        double imc = peso / Math.pow(altura, 2);

        // Mostrar el resultado
        System.out.println("Su Índice de Masa Corporal (IMC) es: " + imc);

        // Determinar el intervalo de peso saludable
        if (imc >= 18 && imc <= 25) {
            System.out.println("Su peso está dentro del intervalo saludable.");
        } else {
            System.out.println("Su peso está fuera del intervalo saludable.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
		



	}

}
