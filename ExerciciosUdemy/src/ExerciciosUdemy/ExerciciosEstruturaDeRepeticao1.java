package ExerciciosUdemy;

import java.util.Scanner;

public class ExerciciosEstruturaDeRepeticao1 {

	public static void main(String[] args) {
		/*Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
		incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
		impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.*/
		Scanner leia = new Scanner(System.in);
		int senha;
		System.out.println("Insira sua senha: ");
		senha = leia.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Incorreta!!!");
			senha = leia.nextInt();
		}
		System.out.println("Acesso permitido!");
		
	}

}
