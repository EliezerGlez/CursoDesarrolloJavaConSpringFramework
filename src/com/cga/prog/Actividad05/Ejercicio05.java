//		Generar un número aleatorio entre 1 y 10.
//		Utilizar el método random() de la clase Math.
//		
package com.cga.prog.Actividad05;

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = (int)(Math. random()*10+1);
		
		System.out.println(numero);
		
		for (int i = 0; i < 5; i++) {
			
			numero = (int)(Math. random()*10+1);
			
			System.out.println("Con bucle for: " + numero);
		}

	}

}
