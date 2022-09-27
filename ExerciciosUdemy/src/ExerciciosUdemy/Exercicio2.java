/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.*/
package ExerciciosUdemy;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double raio, area, pi = 3.14159;
		System.out.println("\nDigite o valor do raio: ");
		raio = leia.nextDouble();
		area = pi * (raio * raio);
		
		System.out.printf("A área do seu círculo é: " + "area=%.4f%n", area);
		
		
	}	

}
