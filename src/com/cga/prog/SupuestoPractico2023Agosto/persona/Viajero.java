package com.cga.prog.SupuestoPractico2023Agosto.persona;

import java.util.Scanner;

public class Viajero {

	private String DNI;
	private String nombre;
	private String apellidos;
	private String nacionalidad;
	private String direccion;
	private static int contadorInstancias = 0;

    // Constructor que recibe todos los campos como argumentos
    public Viajero(String dni, String nombre, String apellidos, String nacionalidad, String direccion) {
        this.DNI = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nacionalidad = nacionalidad;
        this.direccion = direccion;
        contadorInstancias++;
    }

    // Constructor por defecto que inicializa los valores a un valor por defecto
    public Viajero() {
        this.DNI = "";
        this.nombre = "";
        this.apellidos = "";
        this.nacionalidad = "";
        this.direccion = "";
        contadorInstancias++;
    }

    // Métodos getter y setter para acceder y modificar los campos
    public String getDni() {
        return DNI;
    }

    public void setDni(String dni) {
        this.DNI = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Método estático para obtener el número de instancias creadas de la clase
    public static int getContadorInstancias() {
        return contadorInstancias;
    }

    // Método para obtener información del viajero con formato "pausado" o "normal"
    public String getInfo(String formato) {
        StringBuilder info = new StringBuilder();
        info.append("DNI: ").append(DNI).append("\n");
        info.append("Nombre: ").append(nombre).append("\n");
        info.append("Apellidos: ").append(apellidos).append("\n");
        info.append("Nacionalidad: ").append(nacionalidad).append("\n");
        info.append("Dirección: ").append(direccion).append("\n");

        if ("pausado".equalsIgnoreCase(formato)) {
            System.out.println(info.toString());
            System.out.println("Presione Enter para continuar...");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
        }

        return info.toString();
    }
	
	
	

}
