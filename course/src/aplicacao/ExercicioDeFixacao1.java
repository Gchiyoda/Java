package aplicacao;

import java.util.Scanner;

import util.CurrencyConverter;

public class ExercicioDeFixacao1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Qual é o valor o dolar? ");
		double dolar = sc.nextDouble();
		System.out.println("Quantidade de dolares a ser comprado?");
		double quantidade = sc.nextDouble();
		double valorConvertido = CurrencyConverter.conversor(dolar, quantidade);
		System.out.printf("O valor deverá ser pago é de %.2f%n", valorConvertido);

	}

}
