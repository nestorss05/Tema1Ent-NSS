package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		//Registra la variable float num
		
		float num;
		
		//Registra la variable int numredondeado
		
		int numredondeado;
		
		//Inicia el Scanner para escribir en teclado
		
		Scanner sc = new Scanner(System.in);
		
		//Pregunta al usuario un numero con decimales
		
		System.out.println("Inserta un numero con decimales a redondear");
		num = sc.nextFloat();
		
		//Con la variable numredondeado, pasamos la variable num a entero, pero sumando 0.5 a la vez
		
		numredondeado = (int) (num+0.5);
		
		//Muestra el numero en pantalla
		
		System.out.println(numredondeado);
		
		//Cierra el Scanner
		
		sc.close();
		
	}

}
