package aplicacao;

import java.util.Scanner;

import entidade.Funcionario;

public class ExercicioOrientObjeto2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario func = new Funcionario();
		
		System.out.println("Name: ");
		func.name = sc.nextLine();
		System.out.println("Gross salary: ");
		func.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		func.grossSalary = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Funcionario: " + func.name + ", $" + func.netSalary() );
	}
}