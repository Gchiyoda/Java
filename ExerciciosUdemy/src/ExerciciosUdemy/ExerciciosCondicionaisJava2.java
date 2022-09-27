package ExerciciosUdemy;

import java.util.Scanner;

public class ExerciciosCondicionaisJava2 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		Scanner leia = new Scanner (System.in);
		int numero;
		System.out.println("Digite um número:");
		numero = leia.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("Esse número é par");
		}
		else {
			System.out.println("Esse número é ímpar");
		}
		
		}

}
