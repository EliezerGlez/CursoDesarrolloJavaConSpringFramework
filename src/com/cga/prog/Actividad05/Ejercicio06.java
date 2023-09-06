//		Pedir dos números por pantalla y realizar la división entre
//		ambos. Formatear la salida con dos decimales.
package com.cga.prog.Actividad05;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el primer número
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        // Solicitar al usuario el segundo número
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        // Realizar la división y formatear la salida con dos decimales
        double resultado = numero1 / numero2;
        String resultadoFormateado = String.format("%.2f", resultado);

        // Mostrar el resultado formateado
        System.out.println("Resultado de la división: " + resultadoFormateado);

        // Cerrar el objeto Scanner
        scanner.close();
		
		

	}

}
