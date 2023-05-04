package com.cursoceat.controller;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
public class EdadAltura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
	try {
	System.out.println("Escribir datos del deportista ");
		//usar puntos en el decimal
	String nombre= entrada.next();
	System.out.println("Nombre: "+nombre);
	int edad= entrada.nextInt();
	System.out.println("Edad "+edad);
	double estatura = entrada.nextDouble();
	System.out.println("Estatura "+estatura);
	
	}catch(InputMismatchException e) {
		System.out.println(e);
	}finally {
		entrada.close();
	}
		
	
}
}
