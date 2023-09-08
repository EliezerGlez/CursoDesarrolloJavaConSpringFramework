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
		
		System.out.println("Todas las personas comienzan una concentración.");
		for (Persona integrante : integrantes) {
			System.out.println(integrante.getNombre() + " " + integrante.getApellidos() + " --> ");
			integrante.Concentrarse();
			
		}
		
	}

}
