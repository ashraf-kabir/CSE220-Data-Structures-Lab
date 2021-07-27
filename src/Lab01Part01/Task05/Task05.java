package Lab01Part01.Task05;

import java.util.Scanner;

// take input 0-9 then count frequency of integer in array

public class Task05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] count = new int[10];

		for (int a=1; a<=15; a++) {
			System.out.println("Enter a number between 0 to 9: ");
			int n = sc.nextInt();
			if (n<=9) {
				count[n]++;
			} else {
				System.out.print("You've entered wrong number. ");
				a--;
			}
		}
		for (int d=0; d<10; d++) {
			System.out.println(d+" was found "+count[d]+" times");
		}
	}

}
