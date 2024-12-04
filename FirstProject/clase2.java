


import java.util.Scanner;
public class clase2 {
	private Scanner input;
	private int base,altura, area, perimetro;
	
	
	public void ingresos() {
		input = new Scanner(System.in);
		System.out.print("Ingrese la base del rectangulo: ");
		base=input.nextInt();
		System.out.print("Ingrese la altura del rectangulo: ");
		altura=input.nextInt();
	}
	public void perimetro() {
		perimetro=(base*2)+(altura*2);
	}
	public void area() {
		area=base*altura;
	}
	public void impresion() {
		System.out.println("El perimetro es: "+perimetro);
		System.out.println("El area es: "+area);
	}

	
	
	public static void main(String[] args) {
		clase2 rectangulo;
		rectangulo = new clase2();
		rectangulo.ingresos();
		rectangulo.perimetro();
		rectangulo.area();
		rectangulo.impresion();

	}

}
