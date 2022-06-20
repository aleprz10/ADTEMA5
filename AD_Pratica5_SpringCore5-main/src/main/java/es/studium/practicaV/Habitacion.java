package es.studium.practicaV;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Habitacion {
	
	
	private String nombreHabitacion;
	
	private Integer pisoHabitacion;
	
	private boolean tieneVentana;
	
	private Persona persona;
	
	public Habitacion() {
		
	}
	public Habitacion(String nombreHabitacion, Integer pisoHabitacion, boolean tieneVentana, Persona persona) {
		
		this.nombreHabitacion = nombreHabitacion;
		this.pisoHabitacion = pisoHabitacion;
		this.tieneVentana = tieneVentana;
		this.persona = persona;
	}
	public String getNombreHabitacion() {
		return nombreHabitacion;
	}
	public void setNombreHabitacion(String nombreHabitacion) {
		this.nombreHabitacion = nombreHabitacion;
	}
	public Integer getPisoHabitacion() {
		return pisoHabitacion;
	}
	public void setPisoHabitacion(Integer pisoHabitacion) {
		this.pisoHabitacion = pisoHabitacion;
	}
	public boolean isTieneVentana() {
		return tieneVentana;
	}
	public void setTieneVentana(boolean tieneVentana) {
		this.tieneVentana = tieneVentana;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	@Override
	public String toString() {
		return "Habitacion [nombreHabitacion=" + nombreHabitacion + ", pisoHabitacion=" + pisoHabitacion
				+ ", tieneVentana=" + tieneVentana + ", persona=" + persona + "]";
	}
	
}
