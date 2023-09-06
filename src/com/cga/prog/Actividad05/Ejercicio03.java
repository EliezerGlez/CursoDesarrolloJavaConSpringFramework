//		Pedir dos números por pantalla e imprimir el mayor de ellos.
//		Utilizar el método max() de la clase Math.
package com.cga.prog.Actividad05;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num1, num2;
		
		Scanner pedirDatos = new Scanner(System.in);
		System.out.println("Introduce el primer número: ");
		num1 = pedirDatos.nextInt();
//		System.out.println("Has introducido: " + num1);
		
		System.out.println("Introduce el segundo número: ");
		num2 = pedirDatos.nextInt();
//		System.out.println("Has introducido: " + num2);
		
		if (num1 > num2) {
			System.out.println(num1 + " es mayor.");
		} else if ( num1 < num2) {
			System.out.println(num2 + " es mayor");
		} else {
			System.out.println("Son iguales.");
		}
		
		System.out.println("El mayor es " + Math.max(num1, num2));

	}

}
