//		Pedir dos números por pantalla y realizar la división entre
//		ambos. Formatear la salida con dos decimales.
package com.cga.prog.Actividad05;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2;
		double resultado;
		
		Scanner pedirDato = new Scanner(System.in);
		
		System.out.println("Introduce el primer número:");
		num1 = pedirDato.nextInt();
		System.out.println("Introduce el segundo número:");
		num2 = pedirDato.nextInt();
		
		if (num1 < num2) {
			System.out.println(num2 + " : " + num1 + " = " + num2 / num1);
		} else if (num1 > num2) {
			System.out.println(num1 + " : " + num2 + " = " + num1 / num2);
		} else {
			System.out.println("Los número son iguales, por lo que el resultado es: " + num1 / num2);
		}
		
		

	}

}
