package com.algoritmos;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

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
		
//		int asistencia = 0;
//		int calificacion = 0;
//		Condicionales condicion = new Condicionales();
//		
//		
//		System.out.println("Cual es tu calificacion?");
//		calificacion = sc.nextInt();
//		System.out.println("Cuantas asistencias tienes?");
//		asistencia = sc.nextInt();
//		System.out.println("Pasaste: "+condicion.acreditar(asistencia,calificacion));
		
		Arreglos arreglo = new Arreglos();
//
//		System.out.println("Cuantos numeros quiere ingresar?");
//        int arr[] = new int[sc.nextInt()];
//
//        System.out.println("Cargar los Valores :");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        
//        // LLAMADA A LA FUNCIÓN PARA SUMAR LOS VALORES DE UN ARRAY DE FORMA RECURSIVA
//        System.out.println(Arreglos.sumarValores(arr, arr.length - 1));
		
//		//serie Fibonacci
//		int n1;
//		System.out.println("Serie fibonaci");
//		System.out.println("Ingresa un numero de terminos a trabajar:");
//		n1 = sc.nextInt();
//		long[] serie = new long[n1];
//		serie = arreglo.fibonacci(n1);
//		for(long num: serie)
//			System.out.println(num);
		
//		//Pilas
//		Stack<String> pila = new Stack<String>();
//		pila.push("Adal");
//		pila.push("Victor");
//		pila.push("Efren");
//		pila.push("La Yadis");
//		System.out.println("El tamano: "+pila.size());
//		System.out.println("Ultimo elemento: "+pila.peek());
//		System.out.println("El tamano: "+pila.size());
//		System.out.println("Ultimo elemento despues de peek: "+pila.pop());
//		System.out.println("El tamano: "+pila.size());
//		System.out.println("Ultimo elemento despues del pop: "+pila.peek());
////		pila.pop();//elemento que esta al borde de la pila pero esta vez si sacas el valor.
////		pila.peek();//elemento que esta al borde de la pila pero sin sacarlo.
//		while(pila.size()>0)
//			System.out.println(pila.pop());
		
//		//Colas
//		PriorityQueue<String> cola = new PriorityQueue<String>();
//		cola.add("Ulises");
//		cola.add("Pacheco");
//		cola.add("Axel");
//		cola.add("Chino");
//		
//		Iterator it = cola.iterator();
//		while(it.hasNext())
//			System.out.println(it.next());
//		
//		//peek nos muestra el primer elemento de la cola
//		System.out.println("\nEl primero: "+cola.peek());
//		//Poll nos muestra el primer elemento de la cola y lo saca de ella
//		System.out.println("El primero: "+cola.poll());
//		System.out.println("El nuevo primero: "+cola.peek());
//		//Contains nos dice si nuestra cola contiene cierto elemento
//		System.out.println("Contiene Ulises? "+cola.contains("Ulises"));
//		System.out.println("Contiene Manu? "+cola.contains("Manu"));
//		//remove saca un elemento especificado de la cola
//		cola.remove("Pacheco");
		
//		//TreeSet. No guarda elementos repetidos, y se ordena automaticamente
//		TreeSet<String> arbol = new TreeSet<String>();
//		arbol.add("Mario");
//		arbol.add("Cesar");
//		arbol.add("Mario");
//		arbol.add("Cesar");
//		
//		System.out.println("Elementos en el arbol: "+arbol.size());
//		Iterator it = arbol.iterator();
//		while(it.hasNext())
//			System.out.println(it.next());
//		System.out.println("Se agrego elemento Marco? "+arbol.add("Marco"));
//		System.out.println("Se agrego elemento Cesar? "+arbol.add("Cesar"));
//		System.out.println("Se agrego elemento cesar? "+arbol.add("cesar"));
//		//remove quita un elemento
//		arbol.remove("Marco");
//		//Clear quita todos los elementos
//		arbol.clear();
		
//		//HashTable. Contiene claves para cada una de sus entradas. No se pueden repetir.
//		Hashtable<Integer,String> hash = new Hashtable<Integer,String>();//Se define el tipo de dato de la clave, y el valor.
//		hash.put(1,"Yareli");
//		hash.put(2,"Alan");
//		//Al repetir una clave se sobreescribe el valor
//		hash.put(2, "Manu");
//		//Hashtable se recorre con Enumeration en lugar de iterator
//		Enumeration en = hash.keys();
//		while(en.hasMoreElements()) {
//			int clave = (int)en.nextElement();
//			System.out.println(clave+" - "+hash.get(clave));
//		}
//		hash.put(5, "Osvaldo");	
//		hash.put(3, "Alan");
//		//Podemos comprobar si nuestra Hashtable ya contiene una clave con:
//		System.out.println("Si existe la clave 3? "+hash.containsKey(3));
//		System.out.println("Si existe la clave 4? "+hash.containsKey(4));
		
//		//TreeMap. Incluye una clave por cada valor, y se ordena automaticamente de acuerdo a las claves
//		TreeMap<String, Integer> tmap = new TreeMap();
//		tmap.put("Michelle", 90);
//		tmap.put("Oscar", 95);
//		tmap.put("Alan",89);
//		tmap.put("Yareli", 89);
//		Iterator it = tmap.keySet().iterator();
//		while(it.hasNext()) {
//			String clave = (String)it.next();
//			System.out.println(clave+"-->"+tmap.get(clave));
//		}
//		//Quitamos un valor con su llave 
//		tmap.remove("Yareli");
		
		//Hacer un algoritmo de arreglos que reciba de entrada TAM[10] enteros y de salida recorra esos 
		//mismos numeros 1 posicion a la derecha o izquierda.
		
//		System.out.println("Arreglo de tamano 10:");
//		int[] arreglo1 = {1,2,3,4,5,6,7,8,9,10};
//		
//		for(int i : arreglo1)
//			System.out.print(i+" ");
//		arreglo1 = arreglo.recorrido(arreglo1);
//		System.out.println();
//		for(int i : arreglo1)
//			System.out.print(i+" ");
		
		
		//Archivos
		Archivos archivo = new Archivos();
		String lorem = "";
		
//		//Leer archivos
//		lorem = archivo.leer("/Users/erickpacheco/Desktop/correo.php");
//		System.out.println(lorem);
		
		//Escribir en un archivo
//		archivo.escribir("/Users/erickpacheco/Desktop/archivonew.txt", "asi es correcto epale");
		
		//Hacer una funcion que lea todos los parrafos y de salida que se tenga el mismo archivo solo 
		//que las vocales las reemplaze con guion bajo _
		lorem = archivo.leer("/Users/erickpacheco/Desktop/correo.php");
		lorem = archivo.vocales(lorem);
		System.out.println(lorem);
		
		//lorem=lorem.replace('a', '_'); Otra forma de hacerlo
		//lorem=lorem.replaceAll("[aeiou]", "_"); Otra forma de hacerlo
		
		
		
	}
}
