//https://jarroba.com/herencia-en-la-programacion-orientada-a-objetos-ejemplo-en-java/
//https://dam.org.es/
//https://ellibrodepython.com/introduccion-python
//https://ns2.elhacker.net/descargas/manuales/Lenguajes%20de%20Programacion/Java/Ejercicios-de-Programacion-en-Java.pdf
	
package com.cga.prog.PolimorfismoInterface;

import java.util.ArrayList;

public class Main {
	
	public static ArrayList<Persona> integrantes = new ArrayList<Persona>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Entrenador delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, "2k2kk24");
		Futbolista iniesta = new Futbolista(2, "Andrés", "Iniesta", 29, 6, "Interior Derecho");
		Masajista raulMartinez = new Masajista(3, "Raul", "Martínez", 41, "Licenciado en Fisioterapia", 18);
		
		integrantes.add(delBosque);
		integrantes.add(iniesta);
		integrantes.add(raulMartinez);
		
//		Concentración
		System.out.println("Todas las personas comienzan una concentración."
				+ "(Todos ejecutan el mismo método.)");
		for (Persona integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " --> ");
			integrante.Concentrarse();
			
		}
		
//		Viaje
		System.out.println("\nTodos los integrantes viajan para jugar un partido."
				+ "(Todos ejecutan el mismo método).");
		for (Persona integrante: integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " --> ");
			integrante.Viajar();
		}
		
//		Entrenamiento
		System.out.println("\nEntrenamiento: Solo el entrenador y el futbolista "
				+ "tienen métodos para entrentar:");
		System.out.print(delBosque.getNombre() + " " + delBosque.getApellidos() + " --> ");
		delBosque.dirigirEntreno();
		System.out.print(iniesta.getNombre() + " " + iniesta.getApellidos() + " --> ");
		iniesta.entrenar();
		
//		Masaje
		System.out.println("\nMasaje: Solo el masajista tiene el método para dar un masaje:");
		System.out.print(raulMartinez.getNombre() + " " + raulMartinez.getApellidos() + " --> ");
		raulMartinez.darMasaje();
		
//		Partido de fútbol
		System.out.println("\nPartido: Solo el entrenador y el futbolista tienen métodos para el partido");
		System.out.print(delBosque.getNombre() + " " + delBosque.getApellidos() + " --> ");
		delBosque.dirigirPartido();
		System.out.print(iniesta.getNombre() + " " + iniesta.getApellidos() + " --> ");
		iniesta.jugarPartido();
		
	}

}
