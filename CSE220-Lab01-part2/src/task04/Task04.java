package task04;

import java.util.*;

public class Task04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			int x, n = sc.nextInt();
			int a[] = new int[n];
			a[5] = 99;
			x = n / 0;
			// System.out.println("Nothing will print");
		} catch (Exception e) {
			// System.out.println(e);
		}

		finally {
			System.out.println("THE END");
		}

	}

}
