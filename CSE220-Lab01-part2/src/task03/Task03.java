package task03;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x, n = sc.nextInt();

		try {
			int a[] = new int[n];
			a[5] = 99;
			x = n / 0;
			// System.out.println("Nothing will print");
		} catch (ArithmeticException e) {
			// System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			// System.out.println(e);
		}
		finally {
			System.out.println("THE END");
		}
	}

}
