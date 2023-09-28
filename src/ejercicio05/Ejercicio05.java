package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		//Registra las variables de la ecuacion (a, b, c, x e y)
		double a, b ,c, x, y;
		
		//Inicia el Scanner para registrar datos de la consola
		Scanner sc = new Scanner(System.in);
		
		//Muestra en pantalla lo que se hara (en este caso, una ecuacion de segundo grado)
		System.out.println("Vamos a hacer una ecuacion de segundo grado");
		System.out.println("    2");
		System.out.println("y=ax+bx+c");
		
		//Pregunta al usuario por el valor de a
		System.out.println("Introduce el valor de a");
		
		//Se asigna el valor de a
		a=sc.nextDouble();
		
		//Pregunta al usuario por el valor de b
		System.out.println("Introduce el valor de b");
		
		//Se asigna el valor de b
		b=sc.nextDouble();
		
		//Pregunta al usuario por el valor de c
		System.out.println("Introduce el valor de c");
		
		//Se asigna el valor de c
		c=sc.nextDouble();
		
		//Pregunta al usuario por el valor de x
		System.out.println("Introduce el valor de x");
		
		//Se asigna el valor de x
		x=sc.nextDouble();
		
		//Para el valor de y, se hara la ecuacion mencionada antes. a se multiplicara por x elevado al cuadrado, b se multiplicara por x, c mantiene su valor y se sumara todo
		y=(a*(Math.pow(x, 2))+(b*x)+c);
		
		//Muestra en pantalla el resultado de y
		System.out.println("El valor de y es " + y);
		
		//Cierra el Scanner
		sc.close();
	
	}

}
