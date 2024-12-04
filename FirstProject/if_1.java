/*Programa que ingrese la edad de una persona y determine si es mayor de edad*/

import java.util.Scanner;

public class if_1 {
	public static void main(String [] args) {
		Scanner teclado = new Scanner(System.in);
		
		int edad;
		System.out.print("Ingrese su edad: ");
		edad = teclado.nextInt();
		
		if(edad>17) {
			System.out.print("La persona es mayor de edad");
		}
		else {
			System.out.print("La persona es menor de edad");
		}
	}
}
