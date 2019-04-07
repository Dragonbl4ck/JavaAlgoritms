package com.algoritmos;

public class Arreglos {
	
	public int[] recorrido(int[] arreglo) 
	{
		int[] nuevoArr = new int[arreglo.length];
		
		for(int i=1; i<arreglo.length;i++)
			nuevoArr[i]=arreglo[i-1];
		nuevoArr[0]=arreglo[arreglo.length-1];
		return nuevoArr;
	}
	
//	public long[] fibonacci(int limite)
//	{
//		long[] serie = new long[limite];
//		//En caso de que nos pida mas de un termino.
//		if(limite>1)
//		{
//			//Definimos los dos primeros terminos
//			serie[0]=0;
//			serie[1]=1;
//			//Cada termino es igual a la suma de los dos anteriores
//			for(int i=2; i<limite; i++)
//				serie[i] = serie[i-1]+serie[i-2];
//		}else if(limite==1) //Cuando solo pide un termino
//			serie[0]=0;
//		
//		return serie;
//	}
	
//	public static int sumarValores(int array[], int posArray) {
//        // INICIALIZAMOS UNA VARIABLE CON LA POSICIÓN DEL ARRAY ((NO ES NECESARIO)) 
//        int tam = posArray;
//        int rta;
//        /* COMPROBAMOS QUE ÉL TAMAÑO DEL NO SEA CERO, YA QUE SI EL TAMAÑO
//        ES CERO INTENTARÁ EN LA SIGUIENTE LLAMADA ENTRAR EN LA POSICIÓN -1
//        DEL ARRAY DANDO UN ERROR */
//        if (tam == 0) {
//            return array[tam];
//        } else {
//            /* SI EL TAMAÑO NO ES IGUAL A CERO, AÑADIMOS AL RESULTADO
//            LA SUMA DEL VALOR PASADO POR PARÁMETRO MÁS EL VALOR DE LA 
//            POSICIÓN ANTERIOR */
//            rta = (array[tam]) + sumarValores(array, tam - 1);
//
//        }
//        return rta;
//    }
	
//	public int[] meses(int[] num) {
//		
//		switch(num) {
//		
//		
//		}
//		
//		String[] arreglo1 = new String[12];
//		arreglo1[1] = "Enero";
//		arreglo1[2] = "Febrero";
//		arreglo1[3] = "Marzo";
//		arreglo1[4] = "Abril";
//		arreglo1[5] = "Marzo";
//		arreglo1[6] = "Junio";
//		arreglo1[7] = "Julio";
//		arreglo1[8] = "Agosto";
//		arreglo1[9] = "Septiembre";
//		arreglo1[10] = "Octubre";
//		arreglo1[11] = "Noviembre";
//		arreglo1[12] = "Diciembre";
//			
//		
//		return arreglo1;
//	}

}
