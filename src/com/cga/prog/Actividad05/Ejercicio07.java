//		Tenemos dos jugadores y dos dados. El primer jugador
//		realiza su tirada y lanza los dados. Posteriormente, el segundo jugador
//		realiza su tirada y lanza de nuevo los dados. Mostrar la tirada más alta
//		(suma de los dos dados) de las dos.
//		Cada dado puede tomar valores enteros comprendidos entre 1 y 6. El
//		valor de cada uno de los dados ha de calcularse de manera aleatoria
//		utilizando el método Math.random().

//		El jugador 1 hace su lanzamiento:
//			Dado 1: 5
//			Dado 2: 6
//			El jugador 2 hace su lanzamiento:
//			Dado 1: 3
//			Dado 2: 4
//			La tirada más alta es 11.

package com.cga.prog.Actividad05;

public class Ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ganador;
				
		int jugadorA = 0;
		int jugadorB = 0;
		int jugador;
		
		
		System.out.println("El jugador A hace su lanzamiento:");
		System.out.println("=================================");
		
		for (int i = 0; i < 2; i++) {
			jugador = (int) (Math. random()*6+1);			
			jugadorA = jugadorA + jugador;
			System.out.println("Jugador A - Dado " + (i + 1) + " = " + jugador);					
		}
		System.out.println("Total jugador A = " + jugadorA);
		
		System.out.println();
		
		System.out.println("El jugador B hace su lanzamiento:");
		System.out.println("=================================");
		
		for (int i = 0; i < 2; i++) {
			jugador = (int) (Math. random()*6+1);			
			jugadorB = jugadorB + jugador;
			System.out.println("Jugador B - Dado " + (i + 1) + " = " + jugador);					
		}
		System.out.println("Total jugador B = " + jugadorB);
				
		ganador = (jugadorA > jugadorB) ?
				"Gana el jugador A" : jugadorB > jugadorA ?
						"Gana el jugador B" : "Empate";
		
				
		System.out.println();
		
		System.out.println(ganador);
		System.out.println("=================================");
		
	}

}
