//programa que ingrese 8 elementos e indique
//1. los 8 elementos
//2. los elementos mayores a 36
//3. los que sean mayores a 50

import java.util.Scanner;

public class mayor36y50 {
    private Scanner input;
    private int[] n = new int[8]; 
    private int cont36 = 0, cont50 = 0;

    public void ingreso() {
        input = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {  
            System.out.print("Ingrese el valor " + (i + 1) + ": ");
            n[i] = input.nextInt();
        }
    }

    public void mayortal() {
        for (int i = 0; i < 8; i++) { 
            if (n[i] > 36) {
                cont36++;
                if (n[i] > 50) {
                    cont50++;
                }
            }
        }
    }

    public void impresion() {
        System.out.println("Los valores mayores a 36 son: " + cont36);
        System.out.println("Los valores mayores a 50 son: " + cont50);
    }

    public static void main(String[] args) {
        mayor36y50 mayor;
        mayor = new mayor36y50();  
        mayor.ingreso();  
        mayor.mayortal();  
        mayor.impresion();  
    }
}
