/*Programa que ingrese 10 valores 
 * y muestre cuantos valores son divisibles para 3*/

import java.util.Scanner;
public class for_4ejercicio {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		
		int n=0,s=0;
		for(int i=1; i<=10;i++) {
			System.out.print("Ingrese el valor "+i+": ");
			n=input.nextInt();
			if(n%3==0) {
				s++;
			}
		}			
		System.out.print("La cantidad de valores divisibles para 3 es de: "+s);

	}
}
