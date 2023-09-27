package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		//Registra las variables enteras num (un numero cualquiera), num2 (numero que queremos ser multiplo) y resto
		
		int num, num2, resto;
		
		//Inicia el Scanner para registrar datos desde el teclado
		
		Scanner sc = new Scanner(System.in);
		
		//Inserta un numero entero cualquiera
		
		System.out.println("Inserta un numero entero");
		num = sc.nextInt();
		
		//Inserta un numero entero
		
		System.out.println("Inserta el numero que quieras que sea multiplo");
		num2 = sc.nextInt();
		
		//La variable resto sera la variable num2 menos el resto de num1 entre num2
		
		resto = num2-(num%num2);
		
		//Con un operador ternario, comprobaremos si el resto es num2. En caso de ser num2, el resto pasara a ser 0
		
		num = resto==num2 ? 0 : resto;
		
		//Muestra el resultado por pantalla
		
		System.out.println("Para que sea multiplo de " + num2 + ", tendras que sumarle "+num);
		
		//Cierra el Scanner
		
		sc.close();
		
	}

}
