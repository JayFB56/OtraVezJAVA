/*Progrma que ingrese 3 numeros 
 * calcule la potencia al cuadrado del primero
 * la raiz cubica del segundo
 * reste el primer numero del segundo*/

import java.util.Scanner;
public class operacion_3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double n1, n2, n3, potencia, raiz, resta;
		
		System.out.print("Ingrese el primer valor: ");
		n1 = teclado.nextDouble();
		
		System.out.print("Ingrese el segundo valor: ");
		n2 = teclado.nextDouble();
		
		System.out.print("Ingrese el tercer valor: ");
		n3 = teclado.nextDouble();
		
		potencia = Math.pow(n1,2);
		raiz = Math.cbrt(n2);
		resta = potencia - raiz;
		
		System.out.println("EL cuadrado de "+n1+" es: "+potencia);
		System.out.println("La raiz cubica de "+n2+" es: "+raiz);
		System.out.print("La resta entre "+potencia+" menos "+raiz+" es: "+resta);
	}
}
