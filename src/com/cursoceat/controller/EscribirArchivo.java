package com.cursoceat.controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	BufferedWriter out=null;
	
	try {
	out= new BufferedWriter(new FileWriter("C:\\Users\\PROGRAMACION\\OneDrive - CENTRO DE ESTUDIOS CEAT\\Documentos\\quijote.txt",true));
	String cadena= "En un lugar de la mancha, ";
	
	for(int i=0; i<cadena.length(); i++) {
		out.write(cadena.charAt(i));
	}
	cadena="de cuyo nombre no quiero acordarme.";
	out.newLine();
	out.write(cadena);
	
	cadena="No ha mucho tiempo que vivía un hidalgo de los de lanza en astillero,";
	out.newLine();
	out.write(cadena);
	
	cadena="adarga antigua, rocín flaco y galgo corredor.";
	out.newLine();
	out.write(cadena);
	
	
	}catch(IOException ex) {
		System.out.println(ex.getMessage());
	}finally {
		if(out!=null) {
			try {
				out.close();
			}catch(IOException ex) {
				System.out.println(ex);
			}
		}
	}
		
		
}
}
