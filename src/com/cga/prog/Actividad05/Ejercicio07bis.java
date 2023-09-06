package com.cga.prog.Actividad05;

import java.util.Random;

public class Ejercicio07bis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();

        int jugador1Dado1 = random.nextInt(6) + 1;
        int jugador1Dado2 = random.nextInt(6) + 1;
        int jugador2Dado1 = random.nextInt(6) + 1;
        int jugador2Dado2 = random.nextInt(6) + 1;

        int tiradaJugador1 = jugador1Dado1 + jugador1Dado2;
        int tiradaJugador2 = jugador2Dado1 + jugador2Dado2;

        System.out.println("El jugador 1 hace su lanzamiento:");
        System.out.println("Dado 1: " + jugador1Dado1);
        System.out.println("Dado 2: " + jugador1Dado2);
        System.out.println("El jugador 2 hace su lanzamiento:");
        System.out.println("Dado 1: " + jugador2Dado1);
        System.out.println("Dado 2: " + jugador2Dado2);

        if (tiradaJugador1 > tiradaJugador2) {
            System.out.println("La tirada más alta es " + tiradaJugador1);
            System.out.println("El ganador es el jugador 1.");
        } else if (tiradaJugador2 > tiradaJugador1) {
            System.out.println("La tirada más alta es " + tiradaJugador2);
            System.out.println("El ganador es el jugador 2.");
        } else {
            System.out.println("Ambos jugadores empataron con una tirada de " + tiradaJugador1);
        }

        int mediaDados = (jugador1Dado1 + jugador1Dado2 + jugador2Dado1 + jugador2Dado2) / 4;
        System.out.println("La media de los 4 dados es " + mediaDados);

	}

}
