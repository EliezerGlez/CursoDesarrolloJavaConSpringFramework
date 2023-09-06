package com.cga.prog.Actividad06;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingrese un número n: ");
        int n = scanner.nextInt();

        System.out.println("Los números del 1 al " + n + " son:");

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        scanner.close();

	}

}
