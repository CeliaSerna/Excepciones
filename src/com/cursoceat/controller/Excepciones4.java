package com.cursoceat.controller;

import java.util.Scanner;

public class Excepciones4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int edad;
	try {
		System.out.println("Escriba su edad");
	 edad=new Scanner(System.in).nextInt();
	 if(edad<0) {
		 throw new ExcepcionesClass();
	 }	else {
		 System.out.println("Edad correcta: " + edad);
	 }
	
	}catch (ExcepcionesClass e) {
		System.out.println(e);
	}
		
	}

}
