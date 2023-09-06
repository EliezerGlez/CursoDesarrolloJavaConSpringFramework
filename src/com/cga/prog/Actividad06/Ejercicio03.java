package com.cga.prog.Actividad06;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        int sumaEdades = 0;
        int contadorAlumnos = 0;
        int contadorMayoresDeEdad = 0;

        System.out.println("Introduzca las edades de los alumnos (ingrese una edad negativa para terminar):");

        while (true) {
            System.out.print("Edad del alumno (ingrese una edad negativa para terminar): ");
            int edad = scanner.nextInt();

            if (edad < 0) {
                break; // Salir del bucle si se ingresa una edad negativa
            }

            sumaEdades += edad;
            contadorAlumnos++;

            if (edad >= 18) {
                contadorMayoresDeEdad++;
            }
        }

        if (contadorAlumnos > 0) {
            double mediaEdades = (double) sumaEdades / contadorAlumnos;
            System.out.println("Suma de edades: " + sumaEdades);
            System.out.println("Media de edades: " + mediaEdades);
            System.out.println("Número de alumnos: " + contadorAlumnos);
            System.out.println("Número de alumnos mayores de edad: " + contadorMayoresDeEdad);
        } else {
            System.out.println("No se ingresaron edades.");
        }

        scanner.close();

	}

}
