package com.cursoceat.controller;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Excepciones2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //para que imprima decimales a o b debe ser double
	int b;
	double a,c;
	Scanner entrada = new Scanner(System.in);
		
		///resolucion de errores
		
	try {
		System.out.print("a= ");
		a=entrada.nextInt();
		System.out.print("b= ");
		b=entrada.nextInt();
		c=a/b;
		System.out.println("c= "+ c);
			
	}catch (ArithmeticException e) {
		System.out.println("Error, division entre 0");
		System.out.println(e);
		
	}catch(InputMismatchException e) {
		System.out.println("Error, entrada de datos no válida");
		System.out.println(e);
	
	}catch (Exception e) {
		System.out.println("Error desconocido");
		System.out.println(e);
	
	}finally {
		
	}
		
		
		
		
		
	entrada.close();
}
}
