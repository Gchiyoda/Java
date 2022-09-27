package arrays;

import java.util.Scanner;

public class ExerciciosArrays {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme
		 * exemplo. Depois, mostrar na tela a altura média das pessoas, e mostrar também
		 * a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas
		 * pessoas caso houver.
		 */
		Scanner sc = new Scanner (System.in);
		
		int n, nmenores;
	    double alturatotal, alturamedia, percentualMenores;

	    System.out.print("Quantas pessoas serao digitadas? ");
	    n = sc.nextInt();

	    String[] nomes = new String[n];
	    int[] idades = new int[n];
	    double[] alturas = new double[n];

	    for (int i=0; i<n; i++) {
	    	System.out.printf("Dados da %da pessoa:\n", i + 1);
	    	System.out.print("Nome: ");
	        nomes[i] = sc.next();
	        System.out.print("Idade: ");
	        idades[i] = sc.nextInt();
	        System.out.print("Altura: ");
	        alturas[i] = sc.nextDouble();
	    }

		nmenores = 0;
		alturatotal = 0;
	    for (int i=0; i<n; i++) {
	        if (idades[i] < 16) {
	            nmenores++;
	        }
	        alturatotal = alturatotal + alturas[i];
	    }

	    alturamedia = alturatotal / n;
	    percentualMenores = ((double)nmenores / n) * 100.0;

	    System.out.printf("\nAltura media = %.2f\n", alturamedia);
	    System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

	    for(int i=0; i<n; i++) {
	        if (idades[i] < 16) {
	        	System.out.printf("%s\n", nomes[i]);
	        }
	    }

		sc.close();
	}
}

