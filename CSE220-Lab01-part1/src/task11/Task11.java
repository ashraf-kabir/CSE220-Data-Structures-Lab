package task11;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number/s: ");
		int num = sc.nextInt();

		System.out.println(allDigitsOdd(num));
	}

	public static boolean allDigitsOdd(int n) {

		boolean test = true;

		for (int i=n; i>0; i/=10) {
			int x=i%10;
			if (x%2==0) {
				test=false;
				break;
			} else {
				test=true;
			}
		}
		return test;
	}

}
