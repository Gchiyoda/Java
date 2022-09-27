package arrays;

import java.util.Scanner;

public class ExerciciosArrays2 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia N números reais e armazene-os em um vetor. Em
		 * seguida: - Imprimir todos os elementos do vetor - Mostrar na tela a soma e a
		 * média dos elementos do vetor
		 */
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos números vc vai digitar?");
		
		int n = sc.nextInt();
		double soma = 0.0;
		double [] vect = new double [n];
		
		for(int i=0;i<vect.length;i++) {
			System.out.println("Digite um número: ");
			vect[i] = sc.nextDouble();
			soma += vect[i];
			
		}
		
		System.out.print("VALORES = ");

	    for (int i=0; i<n; i++) {
	    	System.out.printf("%.1f  ", vect[i]);
	    }
	    
	    double media = soma/n;
	    System.out.printf("\nSoma = %.2f%n", soma);
	    System.out.printf("\nMedia = %.2f%n", media);
	    
	    sc.close();
		
		
		
	}

}
