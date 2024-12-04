/* pregunta 1 D
 * pregunta 2 B
 * pregunta 3 C
 * pregunta 4 D
 * pregunta 5 REALIZAR UN PROGRAMA QUE CALCULE LA POTENCIA n DE UN NUMERO. 
 * POR EJEMPLO 2 POTENCIA 3 SU RESPUESTA SERIA 8
 *  */



import java.util.Scanner;
public class Prueba_Parcial {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double n, p, r;
		
		System.out.print("Ingrese el numero que quiere ser elevado: ");
		n = input.nextInt();
		
		System.out.print("Ingrese la potencia: ");
		p = input.nextInt();
		
		
		if(n==0 && p==0) {
			System.out.print("No hay solucion");
		}
		else {
			r = Math.pow(n,p);
			System.out.print("El numero "+n+" elevado a la potencia "+p+" es: "+r);
		}
		
	}

}
