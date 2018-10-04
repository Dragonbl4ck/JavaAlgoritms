package com.algoritmos;

import java.util.Scanner;

public class AlgoritmosApp {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int base = 0;
//		int exp = 0;
//		Ciclos cl  = new Ciclos();
		
//		System.out.println("Dame la base");
//		base = sc.nextInt();
//		System.out.println("Dame el exponente");
//		exp = sc.nextInt();
//		System.out.println("El resultado es: "+cl.potencia(base, exp));
		
		
		int asistencia = 0;
		int calificacion = 0;
		Condicionales condicion = new Condicionales();
		
		
		System.out.println("Cual es tu calificacion?");
		calificacion = sc.nextInt();
		System.out.println("Cuantas asistencias tienes?");
		asistencia = sc.nextInt();
		System.out.println("Pasaste: "+condicion.acreditar(asistencia,calificacion));
		
	}
}
