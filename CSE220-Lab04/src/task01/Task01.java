package task01;

import java.util.Scanner;

public class Task01 {
	
	public static int factorial(int n) {
		if (n<2) {
			return 1;
		} else {
			return n*factorial(n-1);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		System.out.println("The factorial is: "+factorial(num));
	}

}
