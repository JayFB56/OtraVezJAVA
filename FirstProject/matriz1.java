/*Programa que use matrices para el ingreso de datos
 * Ejemplo de vectores
 * variable[4]={1,3,2,4}
 * 
 * MATRICES
 * variabe_bidimensional[filas][columnas]
 * matriz= new int[2][3];
 * 2 6 7
 * 3 1 9
 * 
 * (0,0) (0,1) (0,2)
 * (1,0) (1,1) (1,2)*/

import java.util.Scanner;
public class matriz1 {
	private Scanner input;
	private int[][] matriz;
	
	public void ingreso() {
		input = new Scanner(System.in);
		matriz = new int[2][3];
		
		for(int i=0; i<2;i++) {
			for(int j=0; j<3;j++) {
				System.out.print("Ingrese la componente "+i+", "+j+": ");
				matriz[i][j] = input.nextInt();
			}
		}
	}
	
	public void impresion() {
		for(int i=0; i<2;i++) {
			for(int j=0; j<3;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		matriz1 matriz= new matriz1();
		matriz.ingreso();
		matriz.impresion();

	}

}












