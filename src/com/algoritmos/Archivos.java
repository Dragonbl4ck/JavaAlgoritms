package com.algoritmos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivos {
	//algoritmo del profesor
	public String vocales(String texto) {
		char[] temp = texto.toCharArray();
		
		for(int i=0; i<temp.length;i++) {
			char letra = temp[i];
			if(letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u') 
			{
				temp[i]='_';
			}
		}
		texto = String.valueOf(temp);
		
		return texto;
	}
	
	//Leer un archivo
	public String leer(String ubicacion) {
		String texto = "";
		
		try {
			File archivo = new File(ubicacion);
			FileReader reader = new FileReader(archivo);
			BufferedReader buffer = new BufferedReader(reader);
			String temp;

			while((temp=buffer.readLine())!=null) {
				texto += temp+"\n";
			}			
		}catch(IOException e) {
			e.printStackTrace();
		}
		return texto;
	}
	
	//Escribir en un archivo
	public void escribir(String ubicacion, String contenido) {
		try {
			//agregar texto al archivo
			FileWriter archivo = new FileWriter(ubicacion,true);
			//sobreescribe el archivo
			PrintWriter writer = new PrintWriter(archivo);
			writer.println(contenido);
			writer.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
