package Lab01Part01.Task07;

import java.util.Scanner;

/**
 * take input an array of 10 length then take input of index and print that value of corresponding index of array
 */

public class Task07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];

		//boolean flag = false;
		for (int a=0; a<arr.length; a++) {
			System.out.println("Enter number: ");
			arr[a] = sc.nextInt();
		}
		
		System.out.println("Enter a number between 0 to 9 (index): ");
		int num = sc.nextInt();

		for (int i=0; i<arr[num]; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
