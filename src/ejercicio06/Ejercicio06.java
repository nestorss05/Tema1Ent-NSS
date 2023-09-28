package ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		//Registra la variable seg, para registrar los segundos
		long seg;
		
		//Inicia el Scanner para registrar datos del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregunta al usuario por una cantidad de segundos
		System.out.println("Introduce una cantidad determinada de segundos");
		
		//Registra lo introducido en la variable seg
		seg = sc.nextLong();
		
		//Muestra en pantalla los segundos
		System.out.println("Segundos: " + seg + " segundos");
		
		//Muestra en pantalla los minutos (segundos*60)
		System.out.println("Minutos: " + seg/60 + " minutos");
		
		//Muestra en pantalla las horas (segundos*3600)
		System.out.println("Horas: " + seg/3600 + " horas");
		
		//Cierra el Scanner
		sc.close();
	
	}

}
