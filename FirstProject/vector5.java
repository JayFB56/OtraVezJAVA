/*Programa que permita ingresar 5 empleados con su edad
 * al final que indique las personas mayores de edad(>=18)*/


import java.util.Scanner;
public class vector5 {
	private Scanner input;
	private String[] nombre;
	private float[] edad;
	
	public void ingreso(){
		input = new Scanner(System.in);
		nombre = new String[5];
		edad = new float[5];
		for(int i=0; i<nombre.length;i++) {
			System.out.print("Ingrese el nombre "+(i+1)+": ");
			nombre[i]= input.next();
			System.out.print("Ingrese su edad: ");
			edad[i]= input.nextFloat();
		}
		
		
	}
	
	public void imprimir(){
		for(int i=0; i<nombre.length;i++) {
			if(edad[i]>=18) {
				System.out.println(nombre[i]+" es mayor de edad");
			}
			else {
				System.out.println(nombre[i]+" es menor de edad");

			}
			//System.out.println(nombre[i]+" "+edad[i]);
		}
		
	}
	public static void main(String[] args) {
		vector5 empleado_edad;
		empleado_edad = new vector5();
		empleado_edad.ingreso();
		empleado_edad.imprimir();

	}

}
