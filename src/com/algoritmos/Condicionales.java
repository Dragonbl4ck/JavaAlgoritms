package com.algoritmos;

public class Condicionales {
	public boolean acreditar(int asistencia, int calificacion) {
		final int totalAsist = 70;
		
		if(asistencia>=(totalAsist*.8) && calificacion>=60 ) {
			boolean paso = true;
			
			return paso;
		}
		
		return false;
	}
}
