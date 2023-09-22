package ejercicio1;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		double kilos, manzanas, peras;
		Scanner sc= new Scanner (System.in);
		System.out.println("¿Cuantos kilos de manzanas se han vendido?");
		kilos=sc.nextDouble();
		manzanas=kilos*2.35;
		System.out.println("¿Cuantos kilos de peras se han vendido?");
		kilos=sc.nextDouble();
		sc.close();
		peras=kilos*1.95;
		System.out.println("Hay "+manzanas+"kg de manzanas");
		System.out.println("Hay "+peras+"kg de peras");
	}

}
