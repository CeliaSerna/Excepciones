package com.cursoceat.controller;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Escaner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int[] numeros=new int[5];
Scanner entrada = new Scanner(System.in);

try {
for(int i=0; i<numeros.length; i++) {
		int n= entrada.nextInt();
		numeros[i]=n;
	
	}
	System.out.println(Arrays.toString(numeros));
	}catch (InputMismatchException e) {
	
	System.out.println("Error. Tipo de dato no válido");


	}catch(Exception e) {
	System.out.println("Error desconocido "+e);
}


}
}
