package Lab01Part01.Task04;

import java.util.Scanner;

// find duplicate

public class Task04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] n = new int[10];

		for (int a=0; a<n.length; a++) {
			System.out.println("Enter number " + a + ":");
			int num = sc.nextInt();

			int c=0;
			for (int b=0; b<a; b++) {
				if (n[b]==num) {
					System.out.println("Duplicate found!");
					c++;
					break;
				}
			}
			if (c==0) {
				n[a]=num;
			} else {
				a--;
			}
		}
	}

}
