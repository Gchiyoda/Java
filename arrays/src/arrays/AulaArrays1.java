package arrays;

import java.util.Scanner;

public class AulaArrays1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		double [] vect = new double [n];
		double sum = 0.0;
		
		for (int i=0; 1<n; i++) {
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		
		double avg = sum/n;
		System.out.printf("Avarage heith = %.2f%n" + avg);
		sc.close();
	}

}
