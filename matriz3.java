/*Programam que ingrese una matriz de 4*3 y muestre:
 * a) la primera fila
 * b) la ultima fila
 * c) la primera columna
 * d) la ultima columna
 * 
 * ejemplo:
 * 4 7 9
 * 1 0 7
 * 2 6 9
 * 1 5 7
 * 
 * IMPRIMIR: 
 * 4 7 9 (0,0) (0,1) (0,2)
 * 1 5 7 (3,0) (3,1) (3,2)
 * 4 1 2 1 (0,0) (1,0) (2,0) (3,0)
 * 8 7 9 8 (0,2) (1,2) (2,2) (3,2)*/

import java.util.Scanner;

public class matriz3 {

	private Scanner input;
	private int[][] matriz;
	
	public void ingreso() {
		input = new Scanner(System.in);
		matriz = new int[4][3];
		for(int i=0; i<4;i++) {
			for(int j=0; j<3;j++) {
				System.out.print("Ingrese la componente "+i+", "+j+": ");
				matriz[i][j] = input.nextInt();
			}
		}
	}
	public void impresion() {
		for(int i=0; i<4;i++) {
			for(int j=0; j<3;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();

		}
		//primera fila
		System.out.print("-----------------");
		System.out.println();
		System.out.print("a) ");
		for(int i=0; i<3;i++) {					
			System.out.print(matriz[0][i]+" ");
		}
		
		//ultima fila
		System.out.println();
		System.out.print("b) ");
		for(int j=0; j<3;j++) {					
			System.out.print(matriz[3][j]+" ");
		}
		
		//primera columna
		System.out.println();
		System.out.print("c) ");
		for(int k=0; k<1;k++) {	
			for(int t=0; t<4; t++) {
				System.out.print(matriz[t][0]+" ");
			}
		}
		
		//ultima columna
		System.out.println();
		System.out.print("d) ");
		for(int k=0; k<1;k++) {	
			for(int h=0; h<4; h++) {
				System.out.print(matriz[h][2]+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		matriz3 matriz= new matriz3();
		matriz.ingreso();
		matriz.impresion();

	}

}
