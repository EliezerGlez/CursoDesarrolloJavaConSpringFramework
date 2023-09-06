package com.cga.prog.Actividad06;

import java.util.Scanner;

public class Ejercicio02bis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        
        int numero;
        
        while (true) {
            System.out.print("Introduce un número (0 para salir): ");
            numero = scanner.nextInt();
            
            if (numero == 0) {
                System.out.println("Fin del programa.");
                break;
            }
            
            if (numero % 2 == 0) {
                System.out.println(numero + " es un número par.");
            } else {
                System.out.println(numero + " es un número impar.");
            }
            
            if (numero > 0) {
                System.out.println(numero + " es un número positivo.");
            } else if (numero < 0) {
                System.out.println(numero + " es un número negativo.");
            } else {
                System.out.println(numero + " es igual a 0.");
            }
            
            int cuadrado = numero * numero;
            System.out.println("El cuadrado de " + numero + " es " + cuadrado);
        }
        
        scanner.close();

	}

}
