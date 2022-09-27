package ExerciciosUdemy;

import java.util.Scanner;

import Entidade.Triangulo;

public class ExercicioComOrientacaoObjeto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Entre com os lados do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Entre com os lados do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangulo x area: %.4f%n", areaX);
		System.out.printf("Triangulo Y area: %.4f%n", areaY);
		
		if (areaX>areaY) {
			System.out.println("A maior área é do: X");
		} else {
			System.out.println("A maior área é do: Y");
		}
		
	}

}
