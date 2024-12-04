/*INgresar los nombres y edad de 5 personas
 * Ordenar alfabeticamente los nombres*/

import java.util.Scanner;
public class vector_7 {
	private Scanner input;
	private String[] nombre;
	private int[] edad;
	
	public void ingreso() {
		input = new Scanner(System.in);
		nombre = new String[5];
		edad = new int[5];
		for(int i=0; i<5; i++) {
			System.out.print("Ingrese su nombre: ");
			nombre[i]=input.next();
			System.out.print("Ingrese su edad: ");
			edad[i]=input.nextInt();
		}
	}
	
	public void ordenamiento() {
		String aux;
		int aux2;
		for(int i=0; i<5; i++) {
			for(int j=0; j<4; j++) {
				if(nombre[j].compareTo(nombre[j+1])>0) {
					aux=nombre[j];
					nombre[j]=nombre[j+1];
					nombre[j+1]=aux;
					
					aux2=edad[j];
					edad[j]=edad[j+1];
					edad[j+1]=aux2;
				}
			}
		}
		
	}
	
	
	public void impresion() {
		for(int i=0; i<5; i++) {
				System.out.println(nombre[i]+" "+edad[i]);
		}
	}
	public static void main(String[] args) {
		vector_7 ordenAlfa;
		ordenAlfa = new vector_7();
		ordenAlfa.ingreso();
		ordenAlfa.ordenamiento();
		ordenAlfa.impresion();
	}
	
}
