package testdatabuilder;

import dominio.Persona;

public class PersonaTestDataBuilder {
	
	private String nombre;
	private String apellido;
	
	public PersonaTestDataBuilder() {
		this.nombre = "Ceiba";
		this.apellido = "Software House";
	}
	
	public PersonaTestDataBuilder conNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}
	
	public PersonaTestDataBuilder conApellido(String apellido) {
		this.apellido= apellido;
		return this;
	}
	
	public Persona build() {
		return new Persona(
			this.nombre, this.apellido
		);
	}
}
