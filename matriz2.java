/*Crear matriz de 4*4
 * muestre unicamente la diagonal principal
 * 
 * ejemplo:
 * 3 4 5 6
 * 1 2 8 9
 * 2 3 4 7
 * 1 3 4 0
 * 
 * (0,0) (0,1) (0,2) (0,3)
 * (1,0) (1,1) (1,2) (1,3)
 * (2,0) (2,1) (2,2) (2,3)
 * (3,0) (3,1) (3,2) (3,3)*/

import java.util.Scanner;
public class matriz2 {
	private Scanner input;
	private int[][] mat;
	
	public void ingreso() {
		input = new Scanner(System.in);
		mat = new int[4][4];
		for(int i=0; i<4;i++) {
			for(int j=0; j<4;j++) {
				System.out.print("Ingrese la componente "+i+", "+j+": ");
				mat[i][j] = input.nextInt();
			}
		}
	}
	public void impresion() {
		for(int i=0; i<4;i++) {				
			System.out.print(mat[i][i]+" ");

		}
	}
	
	public static void main(String[] args) {
		matriz2 mat= new matriz2();
		mat.ingreso();
		mat.impresion();

	}

}
