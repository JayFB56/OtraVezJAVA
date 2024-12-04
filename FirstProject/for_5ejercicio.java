/*Programa que solicite ingresar n cantidad de triangulos por teclado
 * indique cuantos sonb equilateros, escaleons e isoceles*/

import java.util.Scanner;
public class for_5ejercicio {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		int i,n,d1, d2,d3;
		int equi=0, es=0, iso=0;
		System.out.print("Ingrese la cantidad de triangulos: ");
		n=input.nextInt();
		//n*=3;
		for(i=1;i<=n;i++) {
			
			System.out.print("Ingrese el lado 1: ");
			d1=input.nextInt();
			System.out.print("Ingrese el lado 2: ");
			d2=input.nextInt();
			System.out.print("Ingrese el lado 3: ");
			d3=input.nextInt();
			
			if(d1==d2 && d1==d3) {
				//equilatero
				equi++;
				System.out.println("Este trinangulo es equilatero");
			}
			else {
				if(d1==d2||d1==d3||d2==d3) {
					//isoceles
					iso++;
					System.out.println("Este triangulo es isoceles");
				}
				else {
					//escaleno
					es++;
					System.out.println("Este triangulo es escaleno");
				}
			}
		}
		System.out.println("Total de equilateros: "+equi);
		System.out.println("Total de isoceles: "+iso);
		System.out.print("Total de escaleno: "+es);
	}
}
