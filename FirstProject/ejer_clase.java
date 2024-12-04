/*Programa que pida 2 numeros y realice la siguiente ecuacion:
 * (((n1 + n2)^2)/(n1*n2)) - raiz caudrada n1 */

import java.util.Scanner;

public class ejer_clase {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double n1, n2, result;
		
		System.out.print("Ingrese el primer numero: ");
		n1 = teclado.nextDouble();
		
		System.out.print("Ingrese el segundo numero: ");
		n2 = teclado.nextDouble();
		
		result = ((Math.pow((n1+n2), 2))/(n1*n2))-(Math.sqrt(n1));
		
		System.out.print("El resultado de la operacion es: "+result);
		 
		}
}
