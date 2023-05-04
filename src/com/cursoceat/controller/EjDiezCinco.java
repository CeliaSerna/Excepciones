package com.cursoceat.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class EjDiezCinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	BufferedReader in= null;
	try {
	in= new BufferedReader(new FileReader("C:\\Users\\PROGRAMACION\\OneDrive - CENTRO DE ESTUDIOS CEAT\\Documentos\\numerosRealesFilas.txt"));
	Scanner entrada;
	double numero;
	double suma=0;
	String linea=in.readLine();
	while(linea != null) {
		entrada= new Scanner(linea).useLocale(Locale.US);
		if(entrada.hasNextDouble()) {
			numero= entrada.nextDouble();
			suma+= numero;
	}
	linea = in.readLine();
	
	}
	System.out.println("Suma "+ suma);
	
	}catch(IOException e) {
	
	System.out.println(e.getMessage());
	
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
