/*Programa que ingrese 4 valores y los ordene de mayor a menor
 * DEBER: ordenar de menor a mayor*/


import java.util.Scanner;
public class vector7 {
	private Scanner input;
	private int[] valor;
	
	public void ingreso(){
		input = new Scanner(System.in);
		valor = new int[4];
		for(int i=0; i<valor.length;i++) {
			System.out.print("Ingrese el valor "+(i+1)+": ");
			valor[i]= input.nextInt();
		}
		
	}
	public void menorMayor(){
		for(int i=0; i<valor.length;i++) {
			for(int j=0; j<valor.length-1;j++) {
				if(valor[j]>valor[j+1]) {
					int aux;
					aux=valor[j];
					valor[j]=valor[j+1];
					valor[j+1]=aux;
				}
				
			}
		}
	}
	
	
	public void imprimir() {
		for(int i=0; i<valor.length;i++) {
			System.out.println(valor[i]);
		}
	}
	
	
	public static void main(String[] args) {
		vector7 ordenamiento;
		ordenamiento = new vector7();
		ordenamiento.ingreso();
		ordenamiento.menorMayor();
		ordenamiento.imprimir();

	}

}
