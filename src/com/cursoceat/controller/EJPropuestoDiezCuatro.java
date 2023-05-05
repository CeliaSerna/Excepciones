package com.cursoceat.controller;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;
public class EJPropuestoDiezCuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		BufferedWriter out=null;
		String cadena ="";
		
		try {
			//System.out.println("Escribe");
			while (cadena!="fin") {
			
			cadena= entrada.next();
			out= new BufferedWriter(new FileWriter("C:\\Users\\PROGRAMACION\\Documentos\\texto.txt"));

		 out.newLine();
		 out.write(cadena);
		}
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}finally {
			if(out!=null) {
				try {
					out.close();
				}catch(IOException ex) {
					System.out.println(ex);
				}
			}
		}

}
}