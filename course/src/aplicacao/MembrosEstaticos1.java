package aplicacao;

import java.util.Scanner;

import util.Calculator;


public class MembrosEstaticos1 {
	public static final double PI = 3.1415;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com raio: ");
		
		double raio = sc.nextDouble();
		
		double c = Calculator.circunferencia (raio);
		double v = Calculator.volume(raio);
		
		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Circunferencia: %.2f%n", v);
		System.out.printf("Valor de PI %.2f%n", Calculator.PI );
		sc.close();
		
	}
	

}
