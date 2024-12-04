/*Programa que detecte si estamos en el primer trimestre del año*/

import java.util.Scanner;
public class or {
	public static void main(String [] args) {
		Scanner teclado = new Scanner(System.in);
		
		int mes;
		System.out.print("Ingrese el mes en formato de numero: ");
		mes = teclado.nextInt();
		
		while(mes>12||mes<1) {		
			System.out.println("El valor esta fuera de rango: ");
			System.out.print("Ingrese el mes en formato de numero: ");
			mes = teclado.nextInt();
		}
		
		
		if(mes==1 || mes==2 || mes==3) {
			System.out.print("Estamos en el primer trimestre");
		}
		else {
			System.out.print("No estamos en el primer trimestre del año");
		}
	}

}
