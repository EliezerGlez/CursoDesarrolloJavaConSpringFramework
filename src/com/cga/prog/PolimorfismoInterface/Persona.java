package com.cga.prog.PolimorfismoInterface;

public class Persona {

	private int id;
	private String Nombre;
	private String Apellidos;
	private int Edad;
	
	public Persona() {
		System.out.println("Soy una persona");
	}
		
	public Persona(int id, String nombre, String apellidos, int edad) {

		this.id = id;
		this.Nombre = nombre;
		this.Apellidos = apellidos;
		this.Edad = edad;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public void Concentrarse(){
		System.out.println("La persona se concentra.");
	}
	
	public void Viajar(){
		System.out.println("La persona viaja.");
	}

}
