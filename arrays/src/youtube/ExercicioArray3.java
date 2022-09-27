package youtube;

import java.util.Scanner;

public class ExercicioArray3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int [] vetorA = new int [15];
		int [] vetorB = new int [vetorA.length];
		
		for (int i=0; i<15;i++) {
			System.out.println("Digite um número: ");
			vetorA [i] = sc.nextInt();
			vetorB[i] = vetorA[i] * vetorA[i];
		}
		
		System.out.println("Vetor A = ");
		for(int i=0; i<vetorA.length;i++) {
			System.out.println(vetorA[i] + "");
		}
		
		System.out.println();
		System.out.println("Vetor B = ");
		for(int i=0; i<vetorB.length;i++) {
			System.out.println(vetorB[i] + "");
		
		}
		
	}

}
