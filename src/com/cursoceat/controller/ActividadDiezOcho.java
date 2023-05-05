package com.cursoceat.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ActividadDiezOcho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("Nombre del fichero: ");
	
	String ficherOriginal = new Scanner(System.in).nextLine();
	String ficheroCopia = "C:\\Users\\PROGRAMACION\\Documentos\\copia.txt";
	
	try (BufferedReader in= new BufferedReader(
			new FileReader(ficherOriginal));
		
		BufferedWriter out= new BufferedWriter(
			new FileWriter(ficheroCopia))) {
			
			int c= in.read();
			while(c!=-1) {
				out.write(c);
				c = in.read();
			}
		}catch (IOException e) {
			System.out.println(e.getMessage());	
		}
	
	

	}
	}


