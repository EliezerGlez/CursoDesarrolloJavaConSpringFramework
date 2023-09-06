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
		
		
		// Declaramos las variables.
		double IMC;
		float peso, altura;
		String estado;		
		
		// Asignamos los valores a las variables.
		Scanner pedirDatos = new Scanner(System.in);
		
		System.out.println("Introduce el peso en 'Kg': ");
		peso = pedirDatos.nextFloat();
		System.out.println("Introduce la altura en 'cm': ");
		altura = pedirDatos.nextFloat();
		estado = "Tu estado de salud es ";
		
		// Se utiliza Math.pow para la operación exponencial.
		IMC = peso / (Math.pow((altura / 100), 2));
		
		// Se utiliza Math.round para el redondeo.
		IMC =  Math.round(IMC);
		
		System.out.println("Tu IMC es: " + Math.round(IMC));
		System.out.println(IMC);
		
		if (IMC >= 25) {
			System.out.println(estado + "bajo.");
		} else if (IMC <= 18 ){
			System.out.println(estado + "alto.");
		} else {
			System.out.println(estado + "óptimo");
		}
		



	}

}
