//Realizar un juego para adivinar un número. Para ello generar un
//número entero entre 1 y 100 de manera aleatoria, y luego ir pidiendo
//números indicando “mayor” o “menor” según sea mayor o menor con
//respecto al número generado de manera aleatoria. El proceso
//termina cuando el usuario acierta el número.
//Una vez acertado el número, debe imprimirse un mensaje indicando
//que el usuario ha acertado el número y debemos imprimir también el
//número de intentos que hemos hecho.
//Ejemplo de salida del programa si el número secreto generado de
//manera aleatorio fuera el 75:

package com.cga.prog.Actividad06;

import java.util.Scanner;

import javax.swing.Spring;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aleatorio, jugada, contador;
		
		contador = 0;
		
		Scanner pedirDato = new Scanner(System.in);
		System.out.println("Introduce un número entre 0 y 100:");
		jugada = pedirDato.nextInt();
		
		aleatorio = (int) (Math. random()*100+1);
		System.out.println("El número aleatorio es: " + aleatorio);
		
		while (aleatorio != jugada) {
			System.out.println("Has introducido: " + jugada);
			System.out.println();
			if (jugada > aleatorio) {
				System.out.println("Tu número es más alto.");
				System.out.println("Inténtalo otra vez: ");
				jugada = pedirDato.nextInt();				
			} else if (jugada < aleatorio) {
				System.out.println("Tu número es más bajo.");
				System.out.println("Inténtalo otra vez: ");
				jugada = pedirDato.nextInt();
			} else {
				System.out.println("Has ganado.");
			}
			contador ++;
		}
		
		System.out.println("Has acertado en " + contador + " intentos.");

	}

}
