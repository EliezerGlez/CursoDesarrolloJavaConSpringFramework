//		Pedir dos números por pantalla e imprimir el menor de ellos.
//		Utilizar el método min() de la clase Math.
package com.cga.prog.Actividad05;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el primer número
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        // Solicitar al usuario el segundo número
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        // Utilizar el método min() de la clase Math para encontrar el menor número
        double menor = Math.min(numero1, numero2);

        // Mostrar el resultado
        System.out.println("El menor número es: " + menor);

        // Cerrar el objeto Scanner
        scanner.close();
		


	}

}
