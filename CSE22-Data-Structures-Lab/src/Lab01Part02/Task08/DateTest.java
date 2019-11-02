package Lab01Part02.Task08;

import java.util.Scanner;

public class DateTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter month(mm):");
		int d = sc.nextInt();

		System.out.println("Enter day(dd):");
		int m = sc.nextInt();

		System.out.println("Enter year(yyyy):");
		int y = sc.nextInt();

		Date mmddyyyy = new Date(d, m, y);

		mmddyyyy.setDate(d);
		mmddyyyy.setMonth(m);
		mmddyyyy.setYear(y);
		mmddyyyy.displayDate(d, m, y);
	}

}
