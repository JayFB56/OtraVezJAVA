/*Programa que solicite el ingreso de 5 notas y las muestre en pantalla
 * y haga un priomedio de las 5 notas*/

import java.util.Scanner;
public class for_2 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int i, nota=0,suma=0;
		float prom=0;
		for(i=1;i<=5;i++) {
			System.out.print("Ingrese la nota "+i+": ");
			nota=input.nextInt();
			suma+=nota;
		}
		prom=suma/5;
		System.out.print("El promedio de las notas notas son: "+prom);
	}
	
}
