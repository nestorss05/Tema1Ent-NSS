package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		/*Registra las variables double metros, que sera la variable introducida por el usuario
		y centdouble, que sera lo mismo que valga centimetros, pero sin ser entero*/
		double metros, centdouble;
		
		//Registra la variable entera centimetros, que sera el resultado de la variable metros pasada a cm y entera
		int centimetros;

		//Inicia el Scanner para introducir datos por el teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregunta al usuario por los metros de un lanzamiento
		System.out.println("¿De cuantos metros ha sido un lanzamiento?");
		
		//Registra la respuesta en la variable metros
		metros = sc.nextDouble();
		
		//Se pasaran los metros a centimetros multiplicando por 100 en centdouble
		centdouble = metros*100;
		
		//Se pasara la cantidad de cm de centdouble a entero en al variable centimetros
		centimetros = (int) centdouble;
		
		//Muestra el resultado en pantalla
		System.out.println("El lanzamiento ha sido de " + centimetros + "cm");
		
		//Cierra el Scanner
		sc.close();
		
	}

}
