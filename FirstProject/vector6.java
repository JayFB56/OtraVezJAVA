/*Crear un programa que permita el ingreso de 5 empleados con su suesldo
 * con su nombre y sueldo
 * al final indique el empleado con el sueldo mas alto
 * y su vector posicion */

import java.util.Scanner;

public class vector6 {
	private Scanner input;
	private String[] nombre;
	private float[] sueldo;
	private int position;
	
	public void ingreso(){
		input = new Scanner(System.in);
		nombre = new String[5];
		sueldo = new float[5];
		for(int i=0; i<nombre.length;i++) {
			System.out.print("Ingrese el nombre "+(i+1)+": ");
			nombre[i]= input.next();
			System.out.print("Ingrese su sueldo: ");
			sueldo[i]= input.nextFloat();
		}
		
		
	}
	public void mayor() {
		float aux=sueldo[0];
		position = 0;
		for(int i=1; i<nombre.length;i++) {
			if(sueldo[i]>aux) {
				aux=sueldo[i];
				position=i;
			}
		}
	}
	
	public void imprimir() {
		System.out.println("El empleado con el mayor sueldo es "+nombre[position]);
		System.out.println("Su vector posicion es: "+position);
	}
	public static void main(String[] args) {
		vector6 empleado_edad;
		empleado_edad = new vector6();
		empleado_edad.ingreso();
		empleado_edad.mayor();
		empleado_edad.imprimir();
	}

}
