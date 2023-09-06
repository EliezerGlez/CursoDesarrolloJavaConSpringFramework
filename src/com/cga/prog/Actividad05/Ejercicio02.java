//		Crear un programa que pida el radio de un círculo y calcule
//		su área mediante la siguiente fórmula:
//		A = PI * r2
//		Utilizar la constante PI de la clase Math.
package com.cga.prog.Actividad05;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner pedirDatos = new Scanner(System.in);
		
		double area;
		
		System.out.println("Introduce el radio: ");
		double radio = pedirDatos.nextDouble();
		System.out.println("Radio = " + radio);
		
		area = Math.PI * (Math.pow(radio, 2));
		
		System.out.println("El área es: " + Math.round(area) + " --- " + area);
		
	}

}
