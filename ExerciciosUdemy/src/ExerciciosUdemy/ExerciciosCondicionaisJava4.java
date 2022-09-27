package ExerciciosUdemy;

import java.util.Scanner;

public class ExerciciosCondicionaisJava4 {

	public static void main(String[] args) {
		/* Uma operadora de telefonia cobra R$50.00 por um plano básico
		que da direito a 100 minutos de telefone. Cada minnuto que exceder
		a franquia de 100 minutos custa R$2.00. Fazer um programa
		pra ler a quantidade de minutos que uma pessoa consumiu, daí
		mostrar o valor a ser pago*/
		
		
		Scanner leia = new Scanner (System.in);
		int minutos;
		minutos = leia.nextInt();
		double conta = 50.0;
		
		if (minutos > 100) {
			conta += (minutos - 100) * 2;
		}
		
		System.out.printf("O valor da conta = R$ %.2f%n", conta);
		
	}

}
