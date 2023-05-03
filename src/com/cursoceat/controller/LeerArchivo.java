package com.cursoceat.controller;

import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	FileReader archivo= null;
	String texto= "";
	
	try {
	archivo= new FileReader("C:\\Users\\PROGRAMACION\\Documents\\prueba.txt");
	int c=archivo.read();
	while(c!=-1) {
		texto+=(char)c;
		c=archivo.read();
	}
	
	
	
	}catch (IOException e) {
		System.out.println("Error al intentar abrir el archivo");
		
	}finally {
		if(archivo!=null) {
			try {
				archivo.close();
			}catch (IOException e) {
				System.out.println(e);
			}
			
		}
	}
		
System.out.println(texto);		
	}

}
  