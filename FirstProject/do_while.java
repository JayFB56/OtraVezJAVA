

import java.util.Scanner;
public class do_while {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cont = 0;
		boolean i = true;
		
		do{
			System.out.println(cont);
			cont++;
			if(cont>40) {
				i = false;
			}
			
			
		}while(i);
		

	}

}
