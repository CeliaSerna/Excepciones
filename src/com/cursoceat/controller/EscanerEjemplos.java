package com.cursoceat.controller;

import java.util.Scanner;

public class EscanerEjemplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String mensaje= "Hola;Estamos en clase  de programación;mi nombre es Celia";
		
	Scanner entrada = new Scanner(mensaje);
	
	System.out.println("Resultado booleano "+ entrada.hasNextBoolean());
		
	entrada.useDelimiter(";");
	System.out.println("--Tokens de la cadena--");
	while(entrada.hasNext()) {
		System.out.println(entrada.next());
	}
	System.out.println("Delimitador utilizado "+entrada.delimiter());
	entrada.close();
	
	}

}
