

import java.util.Scanner;
public class do_while2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int nota,suma=0, cont=0;
		double prom=1;
		do {
			System.out.print("Ingrese la nota: ");
			nota = input.nextInt();
			if(nota!=0) {
				suma+=nota;
				cont++;
			}
			
		}while(nota!=0);
		System.out.println("La suma es: "+suma);
		System.out.println("Contador: "+cont); 
		prom=suma/cont;
		System.out.println("El promedio de las notas es: "+prom);

	}

}
