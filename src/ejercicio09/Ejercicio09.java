package ejercicio09;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		
		//Registra las variables enteras num1 y num2, para registrar los dos numeros a comparar
		int num1, num2;
		
		//Inicia el Scanner para registrar los datos en pantalla
		Scanner sc = new Scanner(System.in);
		
		//Pide al usuario el primer numero
		System.out.println("Inserta un numero");
		
		//Registra el primer numero en la variable num1
		num1=sc.nextInt();
		
		//Pide al usuario el segundo numero
		System.out.println("Inserta otro numero");
		
		//Registra el segundo numero en la variable num2
		num2=sc.nextInt();
		
		/*En el mismo mensaje que se mostrara, comprueba si num1 es igual a num2.
		Si num1 es igual a num2, se mostrara true. De lo contrario, se mostrara false.*/
		System.out.println(num1==num2);
		
		//Cierra el Scanner
		sc.close();
		
	}

}
