package ejercicio08;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		/*Registra las variables estaticas en float adultos (precio de la entrada de adulto),
		infantiles (entrada infantil), descuento (numero a multiplicar por el total)
		y cantdesc (si el importe es mayor o igual que 100)*/
		final float adultos=20f, infantiles=15.50f, descuento=0.95f, cantdesc=100f;
		
		/*Registra las variables enteras entraa, que guardara la cantidad de entradas de adultos
		y entran, que guardara la cantidad de entradas para niños*/
		int entraa, entran;
		
		//Registra la variable float total, que sera el coste de todas las entradas
		float total;
		
		//Inicia el Scanner para recopilar datos del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregunta al usuario por entradas de adultos
		System.out.println("¿Cuantas entradas de adultos vas a comprar");
		
		//Registra las entradas de adultos en la variable entraa
		entraa=sc.nextInt();
		
		//Pregunta al usuario por entradas de niños
		System.out.println("¿Cuantas entradas de niños vas a comprar");
	
		//Registra las entradas de niños en la variable entran
		entran=sc.nextInt();
		
		/*Calcula el total de todas las entradas pasando todo a float, 
		multiplicando cada entrada por su valor respectivo y sumando los
		resultados de cada suma de entradas de cada tipo*/
		total=(float)(entraa*adultos)+(entran*infantiles);
		
		/*Revision del descuento: Si el total vale 100 euros o mas, se le
		informara del descuento. De lo contrario, se le informara de que NO recibira el descuento*/
		System.out.println(total>=cantdesc ? "Se aplicara un descuento del 5%" : "No se aplicara ningun descuento");
		
		//Aplica o no el descuento
		total = total>=cantdesc ? total*descuento: total;
		
		//Muestra el resultado en pantalla
		System.out.println("El coste total de las entradas es de " + total + "€");
		
		//Cierra el Scanner
		sc.close();
		
	}

}
