package Lab01Part01.Task02;

import java.util.Scanner;

// shift of array position between max & min number

public class Task02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] n = new int[5];
		int temp;
		for (int i=0; i<n.length; i++) {
			System.out.println("Enter number " + i + ":");
			n[i] = sc.nextInt();
		}
		
		int max = n[0], min = n[0];
		int maxLoc = 0, minLoc = 0;
		
		for (int i=0; i<n.length; i++) {
			if (n[i]>max) {
				max = n[i];
				maxLoc = i;
			} else if (n[i]<min) {
				min = n[i];
				minLoc = i;
			}
		}
		temp = n[maxLoc];
		n[maxLoc] = n[minLoc];
		n[minLoc] = temp;

		for (int j=0; j<n.length; j++) {
			System.out.print(n[j]+" ");
		}

	}

}
