/*Programa que ingrese el nombre y la nota de dos alumnos 
 * y muestre el promedio. usar metodos de la soguiente manera 
 * 1. ingresos
 * 2. calculo
 * 3. impresion */

import java.util.Scanner;

public class prueba2_1 {
	private Scanner input;
	private int n1, n2;
	private String nombre1, nombre2;
	private double r;
	
	public void ingreso() {
		input = new Scanner(System.in);
		System.out.print("Ingrese el nombre del primer alumno: ");
		nombre1=input.next();
		System.out.print("Ingrese la nota del primer alumno: ");
		n1=input.nextInt();
		System.out.print("Ingrese el nombre del segundo alumno: ");
		nombre2=input.next();
		System.out.print("Ingrese la nota del segundo alumno: ");
		n2=input.nextInt();
		
	}
	
	public void calculo() {
		r=(n1+n2)/2;
	}
	
	public void impresion() {
		System.out.print("El promedio de la nota del alumno "+nombre1+" mas la nota del alumno "+nombre2+" es: "+r);
	}
	
	public static void main(String[] args) {
		prueba2_1 promedio;
		promedio = new prueba2_1();
		promedio.ingreso();
		promedio.calculo();
		promedio.impresion();
		

	}

}
