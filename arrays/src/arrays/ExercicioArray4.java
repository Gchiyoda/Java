package arrays;

import java.util.Scanner;

public class ExercicioArray4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, maiorValor;
		double maior;
		
		System.out.println("Quantos números vc vai digitar?");
		n = sc.nextInt();
		
		int [] vect = new int [n];
		for (int i=0; i<n; i++) {
			System.out.println("Digite um número: ");
			vect[i] = sc.nextInt();
			
		}
		
		maior = vect [0];
		maiorValor = 0;
		
		for (int i=0; i<n; i++) {
			if (vect[i]> vect[0]) {
				maior = vect[1];
				maiorValor=i;
			}
		}
		
		System.out.printf("MAIOR VALOR = %.1f\n", maior);
	    System.out.printf("POSICAO DO MAIOR VALOR = %d\n", maiorValor);

	}

}
