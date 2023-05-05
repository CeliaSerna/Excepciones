package com.cursoceat.controller;
import java.util.Scanner;
public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner entrada = new Scanner(System.in);
		
	System.out.println("Escriba un nombre");	
	String nombre= entrada.nextLine();
	//solucion 1 al error de introducir un nombre vacio
	
	while(nombre.isEmpty()) {
		System.out.println("Escriba un nombre");	
		nombre= entrada.nextLine();
		}
	System.out.println(capitalizar(nombre));
	
	//solucion 2
	
	System.out.println("Escriba un apellido");	
	String apellido= entrada.nextLine();
	System.out.println(capitalizar2(apellido));
	
	entrada.close();
	}

	public static String capitalizar(String n) {
	
	n=n.substring(0,1).toUpperCase()+n.substring(1).toLowerCase();
		
	return n;
	}
	
	public static String capitalizar2(String ape) {
		try {
		ape=ape.substring(0,1).toUpperCase()+ape.substring(1).toLowerCase();
			
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println(e);
		
		}catch (Exception e) {
			System.out.println("Error: "+e.getMessage());
			System.out.println("Causa: "+e.getCause());
			ape="";
		}
	return ape;
	
	}
	
	
}
