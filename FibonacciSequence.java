package day6;

import java.util.Scanner;

public class FibonacciSequence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of terms :");
		int terms = scanner.nextInt();
		
		int a = 0, b = 1;
		for (int i = 1; i <= terms; i++) {
			System.out.println(a);
			int next = a + b;
			a = b;
			b = next;
		}

	}

}
