package task01;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the array length: ");
		int r = sc.nextInt();

		int[] n = new int[r];

		for (int a=0; a<n.length; a++) {
			System.out.println("Enter number: ");
			n[a] = sc.nextInt();
		}
		if (n[0]==6 || n[r-1]==6) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
