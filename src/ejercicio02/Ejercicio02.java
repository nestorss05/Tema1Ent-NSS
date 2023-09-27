package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		//Registra las variables enteras num y resto
		
		int num, resto;
		
		//Inicia el Scanner para registrar datos desde el teclado
		
		Scanner sc = new Scanner(System.in);
		
		//Inserta un numero entero
		
		System.out.println("Inserta un numero entero");
		num = sc.nextInt();
		
		//La variable resto sera 7 menos el resto del numero entre 7
		
		resto = 7-(num%7);
		
		//Con un operador ternario, comprobaremos si el resto es 7. En caso de ser 7, el resto pasara a ser 0
		
		num = resto==7 ? 0 : resto;
		
		//Muestra el resultado por pantalla
		
		System.out.println("Para que sea multiplo de 7, tendras que sumarle "+num);
		
		//Cierra el Scanner
		
		sc.close();
		
	}

}
