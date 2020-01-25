package Lab01Part01.Task09;

import java.util.*;

public class Task09 {

	public static void squareMethod(int[] b) {
		for (int i=0; i<b.length; i++) {
			b[i]=b[i]*b[i];
		}
	}

	public static void printMethod(int[] a) {
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + ", ");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];

		for (int i=0; i<arr.length; i++) {
			System.out.println("Enter a number: ");
			arr[i] = sc.nextInt();
		}

		Task09.squareMethod(arr);
		System.out.printf("\n");
		Task09.printMethod(arr);
		System.out.printf("\n");
	}

}
