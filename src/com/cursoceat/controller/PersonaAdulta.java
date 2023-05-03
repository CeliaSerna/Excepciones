package com.cursoceat.controller;

public class PersonaAdulta {

	protected String nombre;
	protected int edad;

public PersonaAdulta(String nombre, int edad) throws Exception{
		
		this.nombre = nombre;
		if(edad<18)
			throw new Exception(nombre+ " no es adulto porque tiene " +edad + " años" );
		    this.edad = edad;
	}
public void fijarEdad(int edad) throws Exception{
	if(edad <18)
			throw new Exception(nombre+ " no es adulto porque tiene " +edad + " años" );
	    	this.edad = edad;


}
public void imprimir() {
	System.out.println(nombre+" - "+edad);
}
	public static void main(String[]ar) {
		try {
		PersonaAdulta persona1= new PersonaAdulta("Ana", 50);
		persona1.imprimir();
		PersonaAdulta persona3= new PersonaAdulta("José", 25);
		persona3.imprimir();
		PersonaAdulta persona2= new PersonaAdulta("Luis", 13);
		persona2.imprimir();
		PersonaAdulta persona4= new PersonaAdulta("Vera", 12);
		persona4.imprimir();
		
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	
}
