/*Operadores logicos 
 * Ingrese 3 numeros y muestre el numero mayor*/

//package HolaJava;
import java.util.Scanner;

public class and_or {
	public static void main(String [] args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.print("Ingrese el primer numero: ");
		num1 = teclado.nextInt();
		
		System.out.print("Ingrese el segundo numero: ");
		num2 = teclado.nextInt();
		
		System.out.print("Ingrese el tercer numero: ");
		num3 = teclado.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.print("El numero: "+num1+" es el mayor");
		}
		else {
			if(num2>num3) {
				System.out.print("El numero: "+num2+" es el mayor");
			}
			else {
			System.out.print("El numero: "+num3+" es el mayor");
			}
		}
	}	
}
