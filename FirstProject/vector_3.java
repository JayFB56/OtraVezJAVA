/*Programa que permita ingresar n cantidad de sueldos
 * usando vectores*/


import java.util.Scanner;
public class vector_3 {
	private Scanner input;
	private float[] sueldos;
	
	public void ingreso() {
		input = new Scanner(System.in);
		int longitud;
		System.out.print("Ingrese la cantidad de empleados: ");
		longitud=input.nextInt();
		sueldos = new float[longitud];
		
		for(int i=0; i<sueldos.length;i++) {
			System.out.print("Ingrese el sueldo "+(i+1)+": ");
			sueldos[i]=input.nextFloat();
		}
		
	}
	
	public void imprimir() {
		for(int i=0; i<sueldos.length;i++) {
			System.out.println(sueldos[i]);
			
		}
	}
	
	public static void main(String[] arg) {
		vector_3 sueldo;
		sueldo = new vector_3();
		sueldo.ingreso();
		sueldo.imprimir();
		
	}
}
