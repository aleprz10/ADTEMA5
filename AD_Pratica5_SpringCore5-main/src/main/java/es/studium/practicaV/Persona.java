package es.studium.practicaV;

import org.springframework.beans.factory.annotation.Value;

public class Persona {
	
	@Value ("Maolo")
	private String nombre;

	public Persona() {
	}

	public Persona(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}
}
