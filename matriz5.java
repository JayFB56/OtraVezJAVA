/*Programa que ingrese una matriz n*m
 * 1. indique el elemento mayor
 * 2. indique las coordenandas de ese elemento
 * 
 * ejemplo:
 * 3 5 6
 * 2 8 9
 * 0 1 4
 * 
 * 1. 9
 * 2. (fila 1, columna2)*/

import java.util.Scanner;
public class matriz5 {
	private Scanner input;
	private int[][] mat;
	private int fila=0, columna=0;

	
	public void ingreso() {
		int f, c;
		input = new Scanner(System.in);
		System.out.print("Ingrese el numero de filas que va a ingresar: ");
		f = input.nextInt();
		System.out.print("Ingrese el numero de columnas que va a ingresar: ");
		c = input.nextInt();
		mat = new int[f][c];
		for(int i=0; i<mat.length;i++) {
			for(int j=0; j<mat[i].length;j++) {
				System.out.print("Ingrese la matriz: ");
				mat[i][j]= input.nextInt();
			}
		}

	}
	public int mayor() {
		int mayor = mat[0][0];
		for(int i=0; i<mat.length;i++) {
			for(int j=0; j<mat[i].length;j++) {
				if(mat[i][j]>mayor) {
					mayor = mat[i][j];
					fila = i;
					columna = j;
				}
			}
		}
		return mayor;

	}
	public void impresion(int mayor) {
		for(int i=0; i<mat.length;i++) {
			for(int j=0; j<mat[i].length;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}	
		System.out.println("El elemento mayor es: "+mayor);
		System.out.println("Su cordenana es ("+fila+","+columna+")");
	}
	
	
	
	
	
	public static void main(String[] args) {
		matriz5 mat = new matriz5();
		mat.ingreso();
		mat.mayor();
		mat.impresion(mat.mayor());

	}

}
