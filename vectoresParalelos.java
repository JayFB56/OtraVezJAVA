/*Vectores y Matrices Paralelos
 * Se tienen los siguientes datos:
 * Nombre de 4 empleados
 * Sueldos de cada empleado de los ultimos 3 meses 
 * Se necesita:
 * 1. Ingresar los datos
 * 2. Calcular la suma del sueldo de cada empleado
 * 3. Mostrar el empleado que gano mas en los 3 meses
 * 
 * Ejemplo: 
 * Vector[4] Matriz[4][3]                   vector[4]
 * 									sueldoTotal
 * Andres 20 30 40                	90
 * Jose   10 15 25					50
 * Pablo 10 10 10					30
 * EL MAYOR ES ANDRES CON 90*/


import java.util.Scanner;
public class vectoresParalelos {
	private Scanner input;
	private String[] nombre;
	private int[][] sueldo;
	private int[] sueldoTotal;
	
	public void ingreso() {
		input = new Scanner(System.in);
		nombre = new String[4];
		sueldo = new int[4][3];
		for(int i=0; i<sueldo.length;i++) {
			System.out.print("Ingrese el nombre: ");
			nombre[i] = input.next();
			
			for(int j=0; j<sueldo[i].length;j++) {
				System.out.print("Ingrese el sueldo "+(j+1)+": ");
				sueldo[i][j] = input.nextInt();
			}
			
		}
	}
	
	public void suma() {
		sueldoTotal = new int [4];
		for(int i=0; i<sueldo.length;i++) {
			int suma = 0;
			for(int j=0; j<sueldo[i].length;j++) {
				suma+=sueldo[i][j];
			}
			sueldoTotal[i] = suma; 
		}

	}
	
	public void mayor() {
		int sueldoMayor = sueldoTotal[0];
		String nombreMayor = nombre[0];
		for(int i=1; i<sueldoTotal.length; i++) {
			if(sueldoTotal[i]>sueldoMayor) {
				sueldoMayor = sueldoTotal[i];
				nombreMayor = nombre[i];
			}
		}
		System.out.println("El empleado con el mayor sueldo es "+nombreMayor+" con un sueldo de: "+sueldoMayor);
	}
	
	public void impresion() {
		for(int i=0; i<sueldo.length;i++) {
			System.out.print(nombre[i]+" ");
			
			for(int j=0; j<sueldo[i].length;j++) {
				System.out.print(sueldo[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("El sueldo total");
		for(int i=0; i<nombre.length;i++) {
			System.out.println(nombre[i]+" "+sueldoTotal[i]);
		}
	}
	
	public static void main(String[] args) {
		vectoresParalelos sueldo = new vectoresParalelos();
		sueldo.ingreso();
		sueldo.suma();
		sueldo.impresion();
		sueldo.mayor();

	}

}
