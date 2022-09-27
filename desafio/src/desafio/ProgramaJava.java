package desafio;

import java.util.Scanner;

import entities.Rent;

public class ProgramaJava {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent [10];
		
		System.out.println("How many rooms will be rented?");
		int n = sc.nextInt();
		
		for (int i = 0; i<= 9; i++) {
			System.out.println();
			System.out.printf("Rent #", i, ": " );
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.next();
			System.out.println("Room: ");
			int roomNumber = sc.nextInt();
			
			vect[roomNumber] = new Rent(name, email);
			
		} 
		
		System.out.println();
		System.out.println("Busy room: ");
		for (int i=0; i<10; i++) {
			if (vect[i] != null) {
			System.out.println( i + ": " + vect[i]);
		}
			
		}
		
		sc.close();
		
		
		
		
	}

}