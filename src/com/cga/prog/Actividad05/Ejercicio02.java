//		Crear un programa que pida el radio de un círculo y calcule
//		su área mediante la siguiente fórmula:
//		A = PI * r2
//		Utilizar la constante PI de la clase Math.
package com.cga.prog.Actividad05;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		// Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el radio del círculo
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        // Calcular el área del círculo utilizando la fórmula A = PI * r^2
        double area = Math.PI * Math.pow(radio, 2);

        // Mostrar el resultado
        System.out.println("El área del círculo con radio " + radio + " es: " + area);

        // Cerrar el objeto Scanner
        scanner.close();
		
	}

}
