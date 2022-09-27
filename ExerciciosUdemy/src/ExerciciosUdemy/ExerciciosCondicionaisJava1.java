package ExerciciosUdemy;

import java.util.Scanner;

public class ExerciciosCondicionaisJava1 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		Scanner leia = new Scanner (System.in);
		int numero;
		System.out.println("Digite um número");
		numero = leia.nextInt();
		
		if (numero < 0) {
			System.out.println("Número Negativo!");
		}
		else {
			System.out.println("Número Positivo!");
		}

	}

}
