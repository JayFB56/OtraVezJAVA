/*Programa que ingrese una matriz n*m
 * 1. Muestre la matriz
 * 2. Muestre la ultima fila*/

import java.util.Scanner;
public class matriz4 {
	private Scanner input;
	private int[][] mat;
	
	public void ingreso() {
		int f, c;
		input = new Scanner(System.in);
		System.out.print("Ingrese el numero de filas que va a ingresar: ");
		f = input.nextInt();
		System.out.print("Ingrese el numero de columnas que va a ingresar: ");
		c = input.nextInt();
		mat = new int[f][c];
		
		//mat.lenght---para saber la longitud las FILAS
		System.out.println("Numero de filas a ingresar: "+mat.length);
		
		//mat[0].lenght---para saber la longitud de una columna en especifico
		System.out.println("Numero de columnas a ingresar: "+mat[0].length);
		
		//mat.lenght---para saber
		for(int i=0; i<mat.length;i++) {
			for(int j=0; j<mat[i].length;j++) {
				System.out.print("Ingrese la matriz: ");
				mat[i][j]= input.nextInt();
			}
		}

	}
	
	public void impresion() {
		for(int i=0; i<mat.length;i++) {
			for(int j=0; j<mat[i].length;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void ultFila() {
		int ultFila = mat.length;
		System.out.println();
		for(int i=0; i<ultFila; i++) {
			System.out.print(mat[ultFila-1][i]+" ");
		}
	}
	
	
	public static void main(String[] args) {
		matriz4 mat = new matriz4();
		mat.ingreso();
		mat.impresion();
		mat.ultFila();

	}

}
