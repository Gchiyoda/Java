package ExerciciosUdemy;

import java.util.Scanner;

public class ExerciciosEstruturaDeRepeticao4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int x = leia.nextInt();
		int y = leia.nextInt();
		while (x != y) {
			if(x < y) {
				System.out.println("Decrescente");
			} else {
				System.out.println("Crescente");
			}
			x = leia.nextInt();
			y = leia.nextInt();
			
			
		}
		
		

	}

}
