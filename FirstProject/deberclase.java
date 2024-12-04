/*Realizar un prgrama que clacule el area y perimetro del hexagono
 * usando conceptros de objetos de la siguiente manera:
 * 1. ingreso
 * 2. perimetro
 * 3. area
 * 4. impresion */

import java.util.Scanner;
import java.lang.Math;
public class deberclase {
	private Scanner input;
	private int lado, apotema, perimetro;
	private double area;
	
	public void ingreso() {
		input = new Scanner(System.in);
		System.out.print("Ingrese uno de los lados del hexagono: ");
		lado=input.nextInt();
		System.out.print("Ingrese el apotema del hexagono (si no el tiene apotema escriba 0): ");
		apotema=input.nextInt();
	}
	
	public void perimetro() {
		perimetro=lado*6;

	}

	public void area() {
		if(apotema!=0){
			area=(apotema*perimetro)/2;
		}
		else{
			area = (3 * Math.sqrt(3) / 2) * Math.pow(lado, 2);
		}

		

	}
	public void impresion() {
		System.out.println("El perimetro del hexagono es: "+perimetro);
		System.out.println("El area del hexagono es: "+area);
	}
	
	public static void main(String[] args) {
		deberclase hexagono;
		hexagono = new deberclase();
		hexagono.ingreso();
		hexagono.perimetro();
		hexagono.area();
		hexagono.impresion();

	}

}