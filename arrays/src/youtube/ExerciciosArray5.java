package youtube;

import java.util.Scanner;

public class ExerciciosArray5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um número: ");
			vetorA[i] = sc.nextInt();
		
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um número: ");
			vetorB[i] = sc.nextInt();
			vetorC[i] = vetorA[i] + vetorB[i];
		}

		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + "");
		}

		System.out.println();
		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + "");

		}
		System.out.println();
		System.out.print("Vetor C = ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + "");

		}
	}

}
