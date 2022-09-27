package ExerciciosUdemy;

import java.util.Scanner;

public class ExerciciosPara2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n = leia.nextInt();
		
		for (int i=1; i<=10; i++) {
			int produto = i*n;
			System.out.println(i + " x " + n + " = " + produto);
		}
		leia.close();	
	}

}
