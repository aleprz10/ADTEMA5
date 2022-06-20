package es.studium.practicaV;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Casa {
	
	@Value("Castillo")
	private String nombreCasa;
	@Autowired
	
	private List<Habitacion> habitaciones;
	@Autowired
	@Qualifier("persona3")
	private Persona propietario;
	
	public Casa () {
		
	}

	public Casa(String nombreCasa, List<Habitacion> habitaciones, Persona propietario) {
		this.nombreCasa = nombreCasa;
		this.habitaciones = habitaciones;
		this.propietario = propietario;
	}

	public String getNombreCasa() {
		return nombreCasa;
	}

	public void setNombreCasa(String nombreCasa) {
		this.nombreCasa = nombreCasa;
	}

	public List<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(List<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	public Persona getPropietario() {
		return propietario;
	}

	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}

	@Override
	public String toString() {
		return "Casa [nombreCasa=" + nombreCasa + ", habitaciones=" + habitaciones + ", propietario=" + propietario
				+ "]";
	}	
}
