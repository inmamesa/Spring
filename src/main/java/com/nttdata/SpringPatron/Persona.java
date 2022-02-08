package com.nttdata.SpringPatron;

@Getter
@Setter
public class Persona {

	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad)
	{
		super();
		this.nombre= nombre;
		this.edad=edad;
	}
}
