//Programa que genere 10 datos aleatorios y pida adivinar el numero
//tiene 3 intentos
import java.util.Scanner;
import java.util.Random; 

public class TareaAleatprio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        Random random = new Random();
        int intentos = 3, entrada;
        boolean adivinaste = false;

        int num1 = random.nextInt(100) + 1;
        int num2 = random.nextInt(100) + 1;
        int num3 = random.nextInt(100) + 1;
        int num4 = random.nextInt(100) + 1;
        int num5 = random.nextInt(100) + 1;
        int num6 = random.nextInt(100) + 1;
        int num7 = random.nextInt(100) + 1;
        int num8 = random.nextInt(100) + 1;
        int num9 = random.nextInt(100) + 1;
        int num10 = random.nextInt(100) + 1;

        for (int i = 1; i <= 3; i++) {  
            System.out.print("Adivina el numero entre 1-100 (intento " + i + "): ");
            entrada = input.nextInt(); 
            if (entrada == num1 || entrada == num2 || entrada == num3 || entrada == num4 ||entrada == num5 || entrada ==num6 || entrada == num7 || entrada == num8 || entrada == num9 || entrada == num10) {
                adivinaste = true;
                System.out.println("Felicidades Adivinaste uno de los numeros.");
                break; 
            } else {
                intentos--; 
                if (intentos > 0) {
                    System.out.println("Numero incorrecto. Te quedan " + intentos + " intentos.");
                } else {
                    System.out.println("Se acabaron los intentos PERDISTE");
                }
            }
        }

        if (!adivinaste) {
            System.out.println("Lo siento, no adivinaste ninguno de los numeros.");
        }

    }
}
