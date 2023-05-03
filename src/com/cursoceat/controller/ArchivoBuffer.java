package com.cursoceat.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArchivoBuffer {
	public static void main(String[] args) {

BufferedReader in=null;
String texto="";
try {
	in= new BufferedReader(new FileReader("C:\\Users\\PROGRAMACION\\Documents\\prueba.txt"));
	String linea = in.readLine();
	while(linea!=null) {
		
	 texto+=linea+"\n";
	linea=in.readLine();
	}
	
}catch(IOException e) {
	System.out.println(e);
}finally {
	if(in!=null) {
		try {
			in.close();
		}catch (IOException e) {
			System.out.println(e);
		}
	}
}
System.out.println(texto);


}
}