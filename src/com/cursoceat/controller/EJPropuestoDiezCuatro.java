package com.cursoceat.controller;

import java.io.FileWriter;

import java.io.PrintWriter;
import java.util.Scanner;

public class EJPropuestoDiezCuatro {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String cadena;
		
	try (FileWriter fw= new FileWriter("C:\\Users\\PROGRAMACION\\Documentos\\texto.txt",true);
		PrintWriter salida = new PrintWriter(fw)){
		System.out.println("Escribe y para acabar escribe 'FIN' ");
		cadena = entrada.nextLine();
		while (!cadena.equalsIgnoreCase("FIN")) {
			salida.println(cadena);
			cadena=entrada.nextLine();
		}
		
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		entrada.close();
}
}