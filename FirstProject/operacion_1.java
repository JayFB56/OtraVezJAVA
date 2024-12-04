/*Programa que ingrese 3 notas y calcule la suma y el promedio*/

import java.util.Scanner;
public class operacion_1 {
	public static void main(String[] arg) {
		Scanner teclado = new Scanner(System.in);
		
		double n1, n2, n3, suma, prom;
		
		System.out.print("Ingrese la primera nota: ");
		n1 = teclado.nextDouble();
		
		System.out.print("Ingrese la segunda nota: ");
		n2 = teclado.nextDouble();
		
		System.out.print("Ingrese la tercera nota: ");
		n3 = teclado.nextDouble();
		
		suma = n1 + n2 + n3;
		prom = suma/3;
		
		System.out.println("La suma de sus notas es: "+suma+" puntos");
		System.out.print("El promedio de sus notas es: "+prom+" puntos");


		
	}
}
