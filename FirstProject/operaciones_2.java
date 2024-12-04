/*Programa que ingrese 4 numeros. Realice la suma de los dos primeros 
 * luego realice la multipplicacion de los segundos
 * promedio de lso dos resultados*/

import java.util.Scanner;
public class operaciones_2 {
	public static void main(String[] arg) {
		Scanner teclado = new Scanner(System.in);
		
		double n1, n2, n3, n4;
		double suma, mult, prom;
		
		System.out.print("Ingrese el primer valor: ");
		n1 = teclado.nextDouble();
		
		System.out.print("Ingrese el segundo valor: ");
		n2 = teclado.nextDouble();
		
		System.out.print("Ingrese el tercer valor: ");
		n3 = teclado.nextDouble();
		
		System.out.print("Ingrese el cuarto valor: ");
		n4 = teclado.nextDouble();
		
		suma = n1 + n2;
		mult = n3*n4;
		prom = (suma+mult)/2;
		
		System.out.println("La suma de los 2 primeros valores es: "+suma);
		System.out.println("La multiplicacion de los 2 ultimos valores es: "+mult);
		System.out.print("El promedio de las operaciones anteriores es: "+prom);

		
	}
}
