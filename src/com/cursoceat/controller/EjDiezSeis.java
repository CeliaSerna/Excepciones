package com.cursoceat.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjDiezSeis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

FileInputStream flujo = null;
try {
	flujo= new FileInputStream("C:\\Users\\PROGRAMACION\\OneDrive - CENTRO DE ESTUDIOS CEAT\\Documentos\\numerosRealesFilas.txt");
}catch(FileNotFoundException ex) {
	System.out.println(ex.getMessage());
}
Scanner entrada = new Scanner(flujo);
		int contador=0;
		int suma=0;
		while(entrada.hasNext()) {
			int n=entrada.nextInt();
			System.out.println(n+" ");
			suma+=n;
			contador++;
		}
		double media = (double)suma/contador;
		System.out.println("\nsuma: "+suma +" media: "+ media);
		
		entrada.close();
	}

}
