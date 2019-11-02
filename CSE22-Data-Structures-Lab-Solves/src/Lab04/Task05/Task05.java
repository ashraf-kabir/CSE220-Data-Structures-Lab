package Lab04.Task05;

import java.util.Scanner;

public class Task05 {

	public static int mul(int m, int n) {
		if (m == 0) {
			return 0;
		} else {
			if (n > 0) {
				n--;
				return m*mul(m, n);
			} else {
				return 1;
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		System.out.println("Enter a power: ");
		int pow = sc.nextInt();
		
		System.out.println("The result is: " + mul(num, pow));
	}

}
