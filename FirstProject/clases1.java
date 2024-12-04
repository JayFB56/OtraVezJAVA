/*Programa separando cada bloque por objetos*/

import java.util.Scanner;
public class clases1 {
	private Scanner input;
	private String nombre1, nombre2;
	private int edad1, edad2;
	
	public void ingreso() {
		input = new Scanner(System.in);
		System.out.println("Ingrese el nombre de la 1ra persona: ");
		nombre1= input.next();
		System.out.println("Ingrese su edad: ");
		edad1= input.nextInt();
		
		System.out.println("Ingrese el nombre de la 2da persona: ");
		nombre2= input.next();
		System.out.println("Ingrese su edad: ");
		edad2= input.nextInt();
	}
	
	public void calculo() {
		if(edad1>edad2) {
			System.out.println("El mayor es: "+nombre1);
		}
		else if(edad1==edad2) {
			System.out.println("Los dos tienen la misma edad");
		}
		else {
			System.out.println("El mayor es: "+nombre2);
		}
	}
	
	public void impresion() {
		System.out.println("Su nombre es: "+nombre1+" y su edad: "+edad1);
		System.out.println("Su nombre es: "+nombre2+" y su edad: "+edad2);

	}
	
	public static void main(String[] args) {
		clases1 objeto;
		objeto = new clases1();
		objeto.ingreso();
		objeto.calculo();
		objeto.impresion();


	}

}
