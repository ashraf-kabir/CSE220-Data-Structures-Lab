package Lab01Part02.Task10;

import java.util.Scanner;

public class RotateTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number: ");
		int p = sc.nextInt();

		int[] a = { 1, 4, 8, 16, 25, 36, 49, 64, 81, 100 };
		int[] b = new int[a.length];
		int[] c = new int[a.length];

		Rotate r = new Rotate();

		b = r.rotateLeft(a, p);
		String rLeftStr = "";
		for (int e = 0; e < b.length; e++) {
			rLeftStr += b[e] + " ";
		}
		printResult(rLeftStr);

		c = r.rotateRight(a, p);
		String rRightStr = "";
		for (int e = 0; e < c.length; e++) {
			rRightStr += c[e] + " ";
		}
		printResult(rRightStr);
	}

	private static void printResult(String str) {
		System.out.println(str.substring(0, str.length() - 1));
	}

}
