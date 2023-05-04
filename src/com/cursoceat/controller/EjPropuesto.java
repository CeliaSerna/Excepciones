package com.cursoceat.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class EjPropuesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//bufereader
//contador
//try
//escaner
//while
	BufferedReader entrada=null;
	int contador =0;
	double sumaEdades=0.;
	double sumaEstaturas=0.;
		
	try {
	entrada = new BufferedReader(new FileReader("C:\\Users\\PROGRAMACION\\OneDrive - CENTRO DE ESTUDIOS CEAT\\Documentos\\jugadores.txt"));

String linea= entrada.readLine();

while(linea!=null) {
	contador++;
	Scanner entrada2 = new Scanner(linea).useLocale(Locale.US);
	String nombre = entrada2.next();
	System.out.println(nombre);
	sumaEdades += entrada2.nextInt();
	sumaEstaturas+= entrada2.nextDouble();
	linea= entrada.readLine();

}
}catch (IOException e) {
	System.out.println(e);
}finally {
	if(entrada!=null) {
		try {
			entrada.close();
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
System.out.println("Media de edades "+sumaEdades/contador +" años");
System.out.println("Media de estaturas "+sumaEstaturas/contador +" metros");
		

	}

}
