/*Programa que ingrese la nota de 5 alumnos
 * y muestre el promedio , ademas de cuantos superan el promedio
 * y cuanto estan debajo del promedio*/

import java.util.Scanner;
public class vector2 {
	private Scanner input;
	private float[] notas;
	private float promedio;
	
	public void ingreso() {
		input= new Scanner(System.in);
		notas= new float[5];
		
		for(int i=0; i<5; i++) {
			System.out.print("Ingrese la nota "+(i+1)+": ");
			notas[i]=input.nextFloat();
		}
	}
	
	public void promedio() {
		float suma=0;
		for(int i=0; i<5; i++) {
			suma+=notas[i];
		}
		promedio = suma/5;
		System.out.println("El promedio es: "+promedio);
	}
	
	public void mayor_menor() {
		int mayor=0, menor=0;
		for(int i=0; i<5; i++) {
			if(notas[i]>=promedio) {
				mayor++;
			}
			else {
				menor++;
			}
		}
		System.out.println("La cantidad de alumnos mayor al promedio fue de: "+mayor);
		System.out.println("La cantidad de alumnos menor al promedio fue de: "+menor);

	}
	
	public static void main(String[] args) {
		vector2 maymen;
		maymen = new vector2();
		maymen.ingreso();
		maymen.promedio();
		maymen.mayor_menor();

	}

}
