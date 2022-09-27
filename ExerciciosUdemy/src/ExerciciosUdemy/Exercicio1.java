package ExerciciosUdemy;

import java.util.Scanner;

/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.*/
public class Exercicio1 {

	public static void main(String[] args) {
		int num1, num2, soma;
		Scanner leia = new Scanner(System.in);
		System.out.println("\nInforme seu primeiro número: ");
		num1 = leia.nextInt();
		System.out.println("\nInforme seu segundo número: ");
		num2 = leia.nextInt();
		soma = num1 + num2;
		System.out.println("\nA soma dos números é: " + soma);
		
				
		
	}

}