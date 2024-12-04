//programa que permita el ingreso
//de 10 numero y los muestre en la pantalla
//con vectores
import java.util.Scanner;
public class vector4 {
        private Scanner teclado;
        private  int[] v1;
        
        public void Ingreso(){
         teclado=new Scanner(System.in);
         v1=new int [10];
         
         for(int i=0; i<10;i++) {
        	 System.out.print("Ingrese el valor"+i+"");
        	 v1[i]=teclado.nextInt();
        	 
          }
       }
    public void Impresion() {
	 
        	for(int i=0; i <10; i++)}
        System.out.println(v1[i]);
 	}	
}
 public static void main(String[]args) {
	 Vectores1 dieznumeros;
	 dieznumeros=new vectores1();
	 dieznumeros.Imgreso();
	 dieznumeros.Impresion();
 }
}
