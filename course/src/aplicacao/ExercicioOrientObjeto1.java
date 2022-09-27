package aplicacao;

import java.util.Scanner;

import entidade.Retangulo;

public class ExercicioOrientObjeto1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		System.out.println("Enter rectangle width and heigth:");
		retangulo.width = sc.nextDouble();
		retangulo.heigth = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", retangulo.area());
		System.out.printf("PERIMETER = %.2f%n", retangulo.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());
		System.out.println();
	}

}
