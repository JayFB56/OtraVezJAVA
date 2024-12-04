import java.util.Scanner;

public class vector3 {
    private Scanner input;
    private int[] elementos;  // Array para almacenar los 8 elementos
    private int mayor_50 = 0, mayor_36 = 0;

    // Constructor para inicializar el array
    public vector3() {
        elementos = new int[8]; // Inicializa el array con 8 elementos
    }

    // Método para ingresar los 8 elementos
    public void ingreso() {
        input = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            elementos[i] = input.nextInt();
        }
    }

    // Método para contar los elementos mayores a 36 y 50
    public void mayor() {
        for (int i = 0; i < 8; i++) {
            if (elementos[i] > 50) {
                mayor_50++; // Incrementa si el elemento es mayor a 50
            }
            if (elementos[i] > 36) {
                mayor_36++; // Incrementa si el elemento es mayor a 36
            }
        }
    }

    // Método para imprimir los resultados
    public void imprimir() {
        System.out.println("Los elementos mayores a 36 son:");
        for (int i = 0; i < 8; i++) {
            if (elementos[i] > 36) {
                System.out.print(elementos[i] + " ");
            }
        }
        System.out.println();  // Salto de línea

        System.out.println("Los elementos mayores a 50 son:");
        for (int i = 0; i < 8; i++) {
            if (elementos[i] > 50) {
                System.out.print(elementos[i] + " ");
            }
        }
        System.out.println();  // Salto de línea
    }

    public static void main(String[] args) {
        Vector3 elementos = new Vector3(); // Crea el objeto de la clase Vector3
        elementos.ingreso();  // Llama al método para ingresar los elementos
        elementos.mayor();    // Llama al método para contar los mayores a 36 y 50
        elementos.imprimir(); // Llama al método para imprimir los resultados
    }
}
