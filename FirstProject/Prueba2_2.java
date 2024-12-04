/*Programa que ingrese el nombre de 4 personas con sus apellidos
 * 1. ordenar en orden alfabetico por nombre
 * 2. ordenar en orden alfabetico por apillido*/

import java.util.Scanner;
public class Prueba2_2 {
	private Scanner input;
	private String[] nombres;
	private String[] apellidos;
	
	public void ingreso() {
		input = new Scanner(System.in);
		nombres = new String[4];
		apellidos = new String[4];

		for(int i=0; i<4; i++) {
			System.out.print("Ingrese su nombre: ");
			nombres[i]= input.next();
			System.out.print("Ingrese su apellido: ");
			apellidos[i]= input.next();
		}
		
	}
	
	public void ordenarNombres() {
		for(int i=0; i<nombres.length-1;i++) {
			for(int j=0; j<nombres.length-1;j++) {
				if(nombres[j].compareTo(nombres[j+1])>0) {
					String aux;
					aux = nombres[j];
					nombres[j] = nombres[j+1];
					nombres[j+1] = aux;
				}
			}
		}
	}
	
	public void ordenarApellidos() {
		for(int i=0; i<apellidos.length-1;i++) {
			for(int j=0; j<apellidos.length-1;j++) {
				if(apellidos[j].compareTo(apellidos[j+1])>0) {
					String aux;
					aux = apellidos[j];
					apellidos[j] = apellidos[j+1];
					apellidos[j+1] = aux;
				}
			}
		}
	}
	
	
	public void imprimir() {
		System.out.println("**Nombres Ordenados:**");
		for (int i = 0; i < 4; i++) {
            System.out.println(nombres[i]);
        }		
		System.out.println(" ");
		System.out.println("**Apellidos Ordenados:**");
		for (int i = 0; i < 4; i++) {
            System.out.println(apellidos[i]);
        }	}
	
	public static void main(String[] args) {
		Prueba2_2 ordenar;
		ordenar = new Prueba2_2();
		ordenar.ingreso();
		ordenar.ordenarNombres();
		ordenar.ordenarApellidos();
		ordenar.imprimir();

	}

}
