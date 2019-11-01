package task12;

import java.util.Scanner;

public class Task12 {

	public static boolean Check(int m1, int d1, int m2, int d2) {

		if (m2>m1) {
			return false;
		} else if (m2==m1) {
			if (d2>d1) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int month1 = sc.nextInt();
		int date1 = sc.nextInt();
		int month2 = sc.nextInt();
		int date2 = sc.nextInt();
		System.out.println(Check(month1, date1, month2, date2));
	}

}
