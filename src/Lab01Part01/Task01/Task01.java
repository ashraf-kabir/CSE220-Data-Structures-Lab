package Lab01Part01.Task01;

import java.util.Scanner;

// return true when 6 found on either first or last index

public class Task01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the array length: ");
		int r = sc.nextInt();

		int[] n = new int[r];

		for (int i=0; i<n.length; i++) {
			System.out.println("Enter number: ");
			n[i] = sc.nextInt();
		}
		if (n[0]==6 || n[r-1]==6) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
