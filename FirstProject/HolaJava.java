/* Programa que calcule el area de un rectángulo y muestre el resultado
 */

import java.util.Scanner;
public class HolaJava {
	public static void main(String [] args){
		int b;
		int h;
		int a;
		
		Scanner ingreso= new Scanner(System.in);
		
		System.out.print("Ingrese la base: ");
		b = ingreso.nextInt();
		
		System.out.print("Ingrese la altura: ");
		h = ingreso.nextInt();
		
		a = b*h;
		
		System.out.print("El area de este rectangulo es de "+a+" metros");
	}

}
