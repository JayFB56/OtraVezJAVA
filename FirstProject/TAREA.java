//(((n1 - n2)^2)/n3) + raiz CUBICA n2

import java.util.Scanner;

public class TAREA {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double n1, n2, n3, result;
		System.out.print("Ingrese el primer numero: ");
		n1 = teclado.nextDouble();
		
		System.out.print("Ingrese el segundo numero: ");
		n2 = teclado.nextDouble();
		
		System.out.print("Ingrese el tercer numero: ");
		n3 = teclado.nextDouble();
		
		result = Math.pow((n1-n2),2)/n3 + Math.cbrt(n2);
		
		System.out.print("El resultado de la operacion es: "+result);
		
	}
}



