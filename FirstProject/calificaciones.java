/*Programa que pida la nota de un alumno e indique su resultado:
 * 10-8 sobresaliente
 * 7-5 regular
 * 4-0 insuficiente*/

import java.util.Scanner;

public class calificaciones {
	public static void main(String [] args) {
		Scanner teclado = new Scanner(System.in);
			
		float nota;
		System.out.print("Ingrese su nota: ");
		nota = teclado.nextFloat();
			
		if(nota>=8){
			System.out.print("SOBRESALIENTE!!");
		}
		else{
			if(nota>=5) {
				System.out.print("REGULAR!!");

			}
			else {
				System.out.print("INSUFICIENTE!!");

			}
		}
	}
}
