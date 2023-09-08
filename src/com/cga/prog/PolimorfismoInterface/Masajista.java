package com.cga.prog.PolimorfismoInterface;

public class Masajista extends Persona{

	private String titulacion;
	private int aniosExperiencia;
	
	public Masajista() {
		super();
	}
	
	
	
	public String getTitulacion() {
		return titulacion;
	}



	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}



	public int getAniosExperiencia() {
		return aniosExperiencia;
	}



	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}



	public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
		super(id, nombre, apellidos, edad);
		this.titulacion = titulacion;
		this.aniosExperiencia = aniosExperiencia;
	}
	
	public void darMasaje() {
		System.out.println("El masajista (persona) está dando masajes");
	}
}
