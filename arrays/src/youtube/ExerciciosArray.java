package youtube;

import java.util.Scanner;

public class ExerciciosArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vamos começar!");
		
		int [] a = new int [5];
		int [] b = new int [5];
		
		for (int i=0; i<a.length; i++) {
			System.out.println("Digite um número: ");
			a[i] = sc.nextInt(); 
			b[i] = a[i];
			
		}
		
		System.out.print("Vetor A= ");
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");	
		}
		System.out.println();

		System.out.print("Vetor B= ");
		for (int i=0; i<b.length; i++) {
			System.out.print(b[i] + " ");	
		}

	}

}
