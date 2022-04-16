package Lab01Part01.Task06;

import java.util.*;

/**
 * take input of 5 numbers in array and check palindrome-> 1 2 3 2 1
 */

public class Task06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];

		boolean flag = false;
		for (int i=0; i<arr.length; i++) {
			System.out.println("Enter number: ");
			arr[i] = sc.nextInt();
		}
		for (int i=0; i<arr.length; i++) {
			if (arr[i]==arr[arr.length-1-i]) {
				flag = true;
			} else {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome");
		}
	}

}
