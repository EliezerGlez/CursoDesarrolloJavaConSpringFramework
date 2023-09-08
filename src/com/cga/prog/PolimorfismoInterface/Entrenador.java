package com.cga.prog.PolimorfismoInterface;

public class Entrenador extends Persona{
	private String idFederacion;
	
	public Entrenador() {
		super();
	}
	
	
	
	public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
		super(id, nombre, apellidos, edad);
		this.idFederacion = idFederacion;
	}



	public String getIdFederacion() {
		return idFederacion;
	}



	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}



	public void dirigirPartido() {
		System.out.println("El entrenador (persona) está dirigiendo el Partido");
	}
	
	public void dirigirEntreno() {
		System.out.println("El entrenador (persona) está dirigiendo el Entreno");
	}

}
