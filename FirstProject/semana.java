/** Programa que dtecte si estamos en la primera semana del mes
 * NOTA: no se puede ingresar un valor fuera del rango (1-30)*/
import java.util.Scanner;

public class semana {
	public static void main(String [] args) {
		Scanner teclado = new Scanner(System.in);
		
		int dias;
		System.out.print("Ingrese el dia del mes: ");
		dias = teclado.nextInt();
		
		while(dias>30||dias<1) {		
			System.out.println("El valor esta fuera de rango ");
			System.out.print("Vuelva a ingresar el dia del mes: ");
			dias = teclado.nextInt();
		}
		
		
		if(dias<=7) {
			System.out.print("Estamos en la primera semana del mes");
		}
		else {
			System.out.print("No estamos en la primera semana del mes");
		}
	}
}
