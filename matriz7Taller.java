/*Vectores y Matrices Paralelos
 * Se tienen los siguientes datos:
 * Nombre de 3 estudiantes
 * Notas de cada estudiante de los ultimos 4 meses 
 * Id de los estudiantes
 * Se necesita:
 * 1. Ingresar los datos
 * 2. Calcular el promedio de notas de cada estudiante
 * 3. Mostrar el empleado que gano mas en los 3 meses
 * 
 * Ejemplo: 
 * Vector[3] Matriz[3][4]            vector[3]			id[3]
 * 
 * 									notaPromedio
 * Andres 	20 30 40 50               	35				080557487
 * Jose   	10 15 25 15					23				086587874
 * Pablo 	10 10 10 10					10				080688454
 * 
 * El mayor promedio es: Andres con 35 puntos y su id 080557487*/




import java.util.Scanner;
public class matriz7Taller {
	private Scanner input;
	private String[] nombre;
	private int[][] nota;
	private int[] id;
	private float[] notaPromedio;
	
	public void ingreso() {
		input = new Scanner(System.in);
		nombre = new String[3];
		nota = new int[3][4];
		id = new int [3];
		for(int i=0; i<nota.length;i++) {
			System.out.print("Ingrese el nombre: ");
			nombre[i] = input.next();
			System.out.println("Ingrese su cedula: ");
			id[i] = input.nextInt();
			
			for(int j=0; j<nota[i].length;j++) {
				System.out.print("Ingrese la nota "+(j+1)+": ");
				nota[i][j] = input.nextInt();
			}
			
		}
	}
	
	public void promedio() {
		notaPromedio = new float[4];
		for(int i=0; i<nota.length;i++) {
			float suma = 0, promedio=0;
			for(int j=0; j<nota[i].length;j++) {
				suma+=nota[i][j];
			}
			promedio = suma/4;
			notaPromedio[i] = promedio; 
		}

	}

	public void mayor() {
		float proMayor = notaPromedio[0];
		String nombreMayor = nombre[0];
		int idMayor = id[0];
		for(int i=1; i<notaPromedio.length; i++) {
			if(notaPromedio[i]>proMayor) {
				proMayor = notaPromedio[i];
				nombreMayor = nombre[i];
				idMayor = id[i];
			}
		}
		System.out.println("El estudiante con la nota mayor es "+nombreMayor+" con un promedio de: "+proMayor+" y su id es "+idMayor);
	}
	
	public void impresion() {
		for(int i=0; i<nota.length;i++) {
			System.out.print(nombre[i]+" ");
			
			for(int j=0; j<nota[i].length;j++) {
				System.out.print(nota[i][j]+" ");
			}
			System.out.println("	Promedio: "+notaPromedio[i]);
			System.out.println();
		}
		/*System.out.println();
		System.out.println("El sueldo total");
		for(int i=0; i<nombre.length;i++) {
			System.out.println(nombre[i]+" "+notaPromedio[i]);
		}*/
	}
	
	public static void main(String[] args) {
		matriz7Taller sueldo = new matriz7Taller();
		sueldo.ingreso();
		sueldo.promedio();
		sueldo.impresion();
		sueldo.mayor();

	}

}
