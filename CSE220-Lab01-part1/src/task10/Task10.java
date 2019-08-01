package task10;

import java.util.*;

public class Task10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a serial of a month: ");
		int month = sc.nextInt();

		System.out.println("Enter a serial of a day: ");
		int day = sc.nextInt();

		for (int i=0; i<1; i++) {
			if (month<1 || month>12 || day<1 || day>31 || (month==2 && day>29)
					|| ((month==4 || month==6 || month==9 || month==11) && day>30)) {
				System.out.println("Invalid! Try again!");
				System.out.println("Enter a month: ");
				month = sc.nextInt();
				System.out.println("Enter a day: ");
				day = sc.nextInt();
				i--;
			}
		}

		System.out.println(season(month, day));
	}

	public static String season(int month, int day) {

		if (month<3 || (month==3 && day<=15)) {
			return "Winter";
		} else if (month<6 || (month==6 && day<=15)) {
			return "Spring";
		} else if (month<9 || (month==9 && day<=15)) {
			return "Summer";
		} else if (month<12 || (month==12 && day<=15)) {
			return "Fall";
		} else {
			return "Winter";
		}
	}

}
