package Lab01Part01.Task08;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int p = 1;
		System.out.println("Enter coloumn number: ");
		int q = sc.nextInt();

		int[][] a = new int[p][q];
		int[][] b = new int[p][q];
		int[][] c = new int[p][q];

		for (int i=0; i<p; i++) {
			for (int j=0; j<q; j++) {
				System.out.println("Enter a number for the first one: ");
				a[i][j] = sc.nextInt();
			}
		}
		for (int i=0; i<p; i++) {
			for (int j=0; j<q; j++) {
				System.out.println("Enter a number for the second one: ");
				b[i][j] = sc.nextInt();
			}
		}
		for (int i=0; i<p; i++) {
			for (int j=0; j<q; j++) {
				c[i][j] = (5*a[i][j])-b[i][j];
			}
		}
		for (int i=0; i<p; i++) {
			for (int j=0; j<q; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

}
