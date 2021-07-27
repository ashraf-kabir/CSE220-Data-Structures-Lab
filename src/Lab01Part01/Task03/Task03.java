package Lab01Part01.Task03;

import java.util.Scanner;

// print max to min of array and even numbers

public class Task03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] n = new int[5];
		int temp;
		for (int i=0; i<n.length; i++) {
			System.out.println("Enter number " + i + ":");
			n[i] = sc.nextInt();
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

		System.out.print("Max to min: ");
		for (int d=0; d<n.length; d++) {
			System.out.print(n[d]+", ");
		}

		System.out.println();
		System.out.print("Even numbers: ");
		for (int k=0; k<n.length; k++) {
			if (n[k]%2==0) {
				System.out.print(n[k]+" ");
			}
		}
		System.out.println();
	}

}
