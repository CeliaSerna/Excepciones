package com.cursoceat.controller;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Excepciones3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int entrada;
	while(true) {
		try {
			System.out.println("Escribe el nº entero");
			entrada= new Scanner(System.in).nextInt();
			break;
		
		}catch	(InputMismatchException e) {
			System.out.println("Error de entrada de datos");
			System.out.println(e);
		}
		}
		System.out.println("tu número entero es " + entrada);
		
		
	}

}
