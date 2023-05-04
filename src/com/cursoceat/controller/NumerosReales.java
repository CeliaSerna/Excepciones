package com.cursoceat.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumerosReales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//declaramos el bufferReader
		
	BufferedReader in = null;
	try {
		in=new BufferedReader (new FileReader("C:\\Users\\PROGRAMACION\\Documents\\NumerosReales.txt"));
	String texto= in.readLine();
	//convertimos el texto en un array y como separador
	//una coma o tambien podria ser un espacio
	String[] subcadena= texto.split(",");

	double suma=0;
	for(int i=0; i<subcadena.length; i++) {
		suma+=Double.valueOf(subcadena[i]);
	}
	System.out.println("El resultado es: "+ suma 
	+ ", la media es: "+ suma/subcadena.length);
	
	
	}catch(IOException e) {
		System.out.println(e);
	}finally {
		if(in!=null) {
			try {
			in.close();
			}catch(IOException e) {
			System.out.println(e);
		}
	}
	}
	
	
}
}
