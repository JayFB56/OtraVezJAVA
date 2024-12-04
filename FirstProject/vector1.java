/*Ingrese 10 valores por teclado usando vectores*/


import java.util.Scanner;
public class vector1 {
	private Scanner input;
	private int[] alturas;
	
	public void ingreso() {
		input = new Scanner(System.in);
		alturas = new int[10];
		
		for(int i=0; i<10; i++) {
			System.out.print("Ingrese el valor "+i+": ");
			alturas[i]= input.nextInt();
		}
	}
	
	public void imprimir() {
		for(int i=0; i<10; i++) {
			System.out.println("Altura: "+i+" "+alturas[i]);
		}
	}
	
	public static void main(String[] args) {
		vector1 altura;
		altura = new vector1();
		altura.ingreso();
		altura.imprimir();

	}

}
