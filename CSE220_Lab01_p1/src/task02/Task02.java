package task02;

import java.util.Scanner;

public class Task02 {            // shift between first index and last index

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] n = new int[10];
		int temp;
		for (int a=0; a<n.length; a++) {
			System.out.println("Enter number: ");
			n[a] = sc.nextInt();
		}
		
		int max = n[0], min = n[0];
		int maxLoc = 0, minLoc = 0;
		
		for (int b=0; b<n.length; b++) {
			if (n[b]>max) {
				max = n[b];
				maxLoc = b;
			} else if (n[b]<min) {
				min = n[b];
				minLoc = b;
			}
		}
		temp = n[maxLoc];
		n[maxLoc] = n[minLoc];
		n[minLoc] = temp;

		for (int d=0; d<n.length; d++) {
			System.out.printf(n[d]+" ");
		}

	}

}
