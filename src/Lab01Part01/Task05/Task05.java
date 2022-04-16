package Lab01Part01.Task05;

import java.util.Scanner;

/**
 * take input of 15 numbers in array between 0-9 then count frequency of integer
 */

public class Task05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] count = new int[10];

		for (int i=1; i<=15; i++) {
			System.out.println("Enter a number between 0 to 9: ");
			int n = sc.nextInt();
			if (n<=9) {
				count[n]++;
			} else {
				System.out.print("You've entered wrong number. ");
				i--;
			}
		}
		for (int i=0; i<10; i++) {
			System.out.println(i+" was found "+count[i]+" times");
		}
	}

}
