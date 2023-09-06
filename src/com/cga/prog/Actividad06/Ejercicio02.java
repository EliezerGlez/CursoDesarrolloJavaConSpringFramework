//Diseñar un programa que muestre, para cada número
//introducido por teclado, si es par, si es positivo y su cuadrado. El
//proceso se repetirá hasta que el número introducido sea 0.

package com.cga.prog.Actividad06;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dato, cuadrado;
		boolean positivo;
		String resultado = "El resultado es ";
		
		Scanner pedirDato = new Scanner(System.in);
		System.out.println("Introduce un número o '0' para salir:");
		dato = pedirDato.nextInt();
		
		
		while (dato != 0) {
			
			if (dato >= 0) {
				resultado = resultado + "Positivo";
			} else {
				resultado = resultado + "Negativo";
			}
			
			if (dato % 2 == 0) {
				resultado = resultado + " y par";				
			} else {
				resultado = resultado + " e Impar";
			}
			
			System.out.println(resultado + " y su cuadrado es: " + (Math.pow(dato, 2)));
			
			resultado = "El resultado es ";

			System.out.println();
			System.out.println("Introduce otro número o '0' para salir:");
			
			dato = pedirDato.nextInt();
		}	
		
	}

}
