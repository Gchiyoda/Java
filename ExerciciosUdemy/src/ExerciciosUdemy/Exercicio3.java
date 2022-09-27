/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
*/
package ExerciciosUdemy;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int A, B, C , D, diferenca;
		System.out.println("Digite o primeiro número: ");
		A = leia.nextInt();
		System.out.println("Digite o segundo número: ");
		B = leia.nextInt();
		System.out.println("Digite o terceiro número: ");
		C = leia.nextInt();
		System.out.println("Digite o quarto número: ");
		D = leia.nextInt();
		
		diferenca = (A * B) - (C * D);
		System.out.println("\nA diferença do produto de A e B com o produto de C e D é de: " + diferenca);
	}

}
