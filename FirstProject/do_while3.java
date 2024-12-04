/*Programa que realixe el calculo del factorial de un numero
 * usando do while*/

import java.util.Scanner;
public class do_while3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num,i=1;
		System.out.print("Ingrese el numero: ");
		num = input.nextInt();
		do {
			if(num!=0) {
				i*=num;
				num--;
			}
		}while(num!=0);
		System.out.print("El factorial de "+num+" es: "+i);


	}

}
