//		Generar un número aleatorio entre 1 y 10.
//		Utilizar el método random() de la clase Math.
//		
package com.cga.prog.Actividad05;

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Generar un número aleatorio entre 1 y 10 (ambos inclusive)
        int numeroAleatorio = (int) (Math.random() * 10) + 1;

        // Mostrar el número aleatorio
        System.out.println("Número aleatorio entre 1 y 10: " + numeroAleatorio);

	}

}
