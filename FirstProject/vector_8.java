/*Ingresar el nombre y la nota de 6 alumnos
 * Ordenar de mayor a menor las notas de los alumnos 
 * y se muestre al final los alumnos con sus notas irdenadas*/

import java.util.Scanner;
public class vector_8 {
	private Scanner input;
	private String[] nombre;
	private float[] notas;
	public void ingreso(){
		input = new Scanner(System.in);
		notas = new float[6];
		nombre = new String[6];
		for(int i=0; i<notas.length;i++) {
			System.out.print("Ingrese su nombre: ");
			nombre[i]=input.next();
			System.out.print("Ingrese su nota: ");
			notas[i]=input.nextFloat();
		}
		
	}
	public void mayorMenor(){
		for(int i=0; i<notas.length;i++) {
			for(int j=0; j<5;j++) {
				if(notas[j]<notas[j+1]) {
					float aux;
					String aux2;
					aux=notas[j];
					notas[j]=notas[j+1];
					notas[j+1]=aux;
					
					aux2=nombre[j];
					nombre[j]=nombre[j+1];
					nombre[j+1]=aux2;
				}
				
			}
		}
	}
	
	
	public void imprimir() {
		for(int i=0; i<notas.length;i++) {
			System.out.println(nombre[i]+" "+notas[i]);
		}
	}
	public static void main(String[] args) {
		vector_8 ordenamiento;
		ordenamiento = new vector_8();
		ordenamiento.ingreso();
		ordenamiento.mayorMenor();
		ordenamiento.imprimir();

	}

}
