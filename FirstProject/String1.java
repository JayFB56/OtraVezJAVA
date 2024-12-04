/*Ingresar los nombres de dos personas con su edad*/

import java.util.Scanner;
public class String1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//declaracion de varables
		String nombre1, nombre2;
		int edad1, edad2;
		
		//ingreso de datos
		System.out.println("Ingrese el nombre de la 1ra persona: ");
		nombre1= input.next();
		System.out.println("Ingrese su edad: ");
		edad1= input.nextInt();
		
		System.out.println("Ingrese el nombre de la 2da persona: ");
		nombre2= input.next();
		System.out.println("Ingrese su edad: ");
		edad2= input.nextInt();
		
		//calculos
		if(edad1>edad2) {
			System.out.println("El mayor es: "+nombre1);
		}
		else {
			System.out.println("El mayor es: "+nombre2);
		}
		
	}

}



