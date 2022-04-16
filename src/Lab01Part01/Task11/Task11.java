package Lab01Part01.Task11;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		System.out.println(checkAllDigitsAreOdd(num));
	}

	public static boolean checkAllDigitsAreOdd(int n) {

		boolean check = true;

		for (int i=n; i>0; i/=10) {
			int x=i%10;
			if (x%2==0) {
				check=false;
				break;
			} else {
				check=true;
			}
		}
		return check;
	}

}
