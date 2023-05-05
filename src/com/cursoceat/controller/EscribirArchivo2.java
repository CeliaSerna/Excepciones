package com.cursoceat.controller;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//actividad resuelta 10.7
		
		try (BufferedWriter out= new BufferedWriter(new FileWriter("C:\\Users\\PROGRAMACION\\Documentos\\quijote2.txt"))) {
		String cadena="En un lugar de la mancha,";
		for (int i=0; i< cadena.length(); i++) {
			out.write(cadena.charAt(i));
		}
		cadena="de cuyo nombre no quiero acordarme,";
		out.newLine();
		out.write(cadena);
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	
	}

}
