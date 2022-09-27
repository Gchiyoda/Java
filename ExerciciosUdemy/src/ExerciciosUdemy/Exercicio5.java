package ExerciciosUdemy;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		/* Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
		* valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
		* o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/	
		Scanner leia = new Scanner(System.in);
		int codigo, numero, codigo1, numero1;
		double valor1, valor2, preco1, preco2, valorpago;
		System.out.println("Digite o código da peça: ");
		codigo = leia.nextInt();
		System.out.println("Digite o número de peças: ");
		numero = leia.nextInt();
		System.out.println("Digite o preço de cada peça:");
		valor1 = leia.nextDouble();
		System.out.println("Digite o código da peça: ");
		codigo1 = leia.nextInt();
		System.out.println("Digite o número de peças: ");
		numero1 = leia.nextInt();
		System.out.println("Digite o preço de cada peça:");
		valor2 = leia.nextDouble();
		preco1 = valor1 * numero;
		preco2 = valor2 * numero1;
		valorpago = preco1 + preco2;
		
		System.out.println("Valor a ser pago = " + valorpago);
		
	}

}
