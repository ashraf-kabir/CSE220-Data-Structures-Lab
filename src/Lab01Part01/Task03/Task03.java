package Lab01Part01.Task03;

import java.util.Scanner;

public class Task03 {       // reverse array and even number print

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] n = new int[5];
		int temp;
		for (int a=0; a<n.length; a++) {
			System.out.println("Enter number: ");
			n[a] = sc.nextInt();
		}

		for (int a=0; a<n.length; a++) {
			for (int b=0; b<n.length; b++) {
				if (n[a] > n[b]) {
					temp = n[a];
					n[a] = n[b];
					n[b] = temp;
				}
			}
		}

		for (int d=0; d<n.length; d++) {
			System.out.printf(n[d]+", ");
		}

		for (int k=0; k<n.length; k++) {
			if (n[k]%2==0) {
				System.out.print(n[k]+" ");
			}
		}
		System.out.println();
	}

}
