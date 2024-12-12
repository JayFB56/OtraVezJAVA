/*Ingresar una matriz+ n*m
 * 1. intercabiar la primera fila con la segunda fila
 * 2. intercambiar la primera columna con la segunda columna*/


import java.util.Scanner;
public class TareaMatriz6 {
	private Scanner input;
	private int[][] mat;

	public void ingreso(){
		int f,c;
		input = new Scanner(System.in);
		System.out.print("Ingrese el numero de filas que va a ingresar: ");
		f = input.nextInt();
		System.out.print("Ingrese el numero de columnas que va a ingresar: ");
		c = input.nextInt();
		mat = new int[f][c];
		for(int i=0; i<mat.length;i++){
			for(int j=0; j<mat.length;j++){
				System.out.print("Ingrese el valor para llenar la matriz: ");
				mat[i][j]= input.nextInt();
			}
		}
	}

	public void cambio(){
		int intercabio=0;
		//INTERCAMBIAR LAS FILAS
		for(int i=0; i<mat[0].length;i++){
			intercabio=mat[0][i];
			mat[0][i]=mat[1][i];
			mat[1][i]=intercabio;
		}


		//INTERCAMBIAR LAS COLUMNAS
		for(int i=0; i<mat.length;i++){
			intercabio=mat[i][0];
			mat[i][0]=mat[i][1];
			mat[i][1]=intercabio;
		}

	}

	public void impresion(){
		for(int i=0; i<mat.length;i++) {
			for(int j=0; j<mat[i].length;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}	
	}
	public static void main(String[] args) {
		TareaMatriz6 mat = new TareaMatriz6();
		mat.ingreso();
		mat.cambio();
		mat.impresion();

	}

}
