//		Pedir dos números por pantalla e imprimir el menor de ellos.
//		Utilizar el método min() de la clase Math.
package com.cga.prog.Actividad05;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int num1, num2;
		
		Scanner pedirDatos = new Scanner(System.in);
		
		System.out.println("Introduce el primer número: ");
		num1 = pedirDatos.nextInt();
		System.out.println("Introduce el segundo número: ");
		num2 = pedirDatos.nextInt();
		
		System.out.println("El menor es " + Math.min(num1, num2));
		


	}

}
