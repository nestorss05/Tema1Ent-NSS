package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		//Registra las variables para la base, altura y area del triangulo
		
		float base, altura, area;
		
		//Inicia el Scanner para registrar datos del teclado
		
		Scanner sc = new Scanner(System.in);
		
		//Registrar la base del triangulo
		
		System.out.println("Vamos a calcular el area de un triangulo");
		System.out.println("Inserta la base del triangulo");
		base = sc.nextFloat();
		
		//Registrar la altura del triangulo
		
		System.out.println("Inserta la altura del triangulo");
		altura = sc.nextFloat();
		
		//Area del cuadrado: (BASE*ALTURA)/2 (y se guarda en la variable area)
		
		area=(base*altura)/2;
		
		//Muestra el resultado en pantalla
		
		System.out.println("El area del triangulo es " + area);
		
		//Cierra el Scanner
		
		sc.close();
		
	}

}
