package Lab01Part01.Task09;

import java.util.Scanner;

/**
 * take 10 integers in array and square them individually and print
 */

public class Task09 {

	public static void squareMethod(int[] b) {
		for (int i=0; i<b.length; i++) {
			b[i]=b[i]*b[i];
		}
	}

	public static void printMethod(int[] a) {
		String str = "";
		for (int i=0; i<a.length; i++) {
			str += a[i] + ", ";
//			System.out.print(a[i] + ", ");
		}
		System.out.println(formatResultStr(str));
	}

	private static String formatResultStr(String str) {
		String formattedStr = str.substring(0, str.length() - 2) + ".";
		formattedStr = formattedStr.replaceFirst(",(?=[^,]+$)", " &");
		return formattedStr;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];

		for (int i=0; i<arr.length; i++) {
			System.out.println("Enter a number: ");
			arr[i] = sc.nextInt();
		}

		Task09.squareMethod(arr);
		System.out.print("\n");
		Task09.printMethod(arr);
		System.out.print("\n");
	}

}
