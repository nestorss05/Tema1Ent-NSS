package ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		/*Registra las variables dist1, dist2 y dist3, donde se recopilaran las distancias
		y distotal, que sera la suma de las 3 distancias*/
		int dist1, dist2, dist3, distotal;
		
		//Inicia el Scanner para recopilar datos del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregunta al usuario por la primera distancia
		System.out.println("Inserta la primera distancia, en milimetros");
		
		//Registra la primera distancia
		dist1=sc.nextInt();
		
		//Pregunta al usuario por la segunda distancia
		System.out.println("Inserta la segunda distancia, en centimetros");
		
		//Registra la segunda distancia
		dist2=sc.nextInt();
		
		//Pregunta al usuario por la tercera distancia
		System.out.println("Inserta la tercera distancia, en metros");
		
		//Registra la tercera distancia
		dist3=sc.nextInt();
		
		/*Pasamos la primera distancia de milimetros a centimetros, dividiendo esa distancia entre 10
		Despues, pasaremos la tercera distancia de metros a centimetros, multiplicando esa distancia por 100
		Por ultimo, sumaremos todas las distancias*/
		
		distotal=(dist1/10)+dist2+(dist3*100);

		//Se mostrara el resultado en pantalla
		
		System.out.println("La distancia total es de " + distotal + "cm");
		
		//Cierra el Scanner
		sc.close();
		
	}

}
