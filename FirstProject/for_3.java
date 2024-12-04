/*Programa que pida ingresar 7 notas y muestre 
 * cuantos cuantos alumnos pasan u cuantod reprueban
 * pasan con nota mayor a 6*/

import java.util.Scanner;
public class for_3 {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		
		int nota=0,contif=0,contelse=0;
		
		for(int i=1; i<8;i++) {
			System.out.print("Ingrese la nota "+i+": ");
			nota=input.nextInt();
			if(nota>6) {
				contif++;
			}
			else {
				contelse++;
			}
			
		}
		System.out.println("Aprobraron: "+contif+" alumnos");
		System.out.print("Reprobraron: "+contelse+" alumnos");

		
	}

}
