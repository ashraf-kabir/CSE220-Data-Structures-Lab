package Lab01Part01.Task08;

import java.util.Scanner;

public class Task08 {

	private static String formatResultStr(String str) {
		String formattedStr = str.substring(0, str.length() - 2) + ".";
		formattedStr = formattedStr.replaceFirst(",(?=[^,]+$)", " &");
		return formattedStr;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int p = 1;
		System.out.println("Enter column number: ");
		int q = sc.nextInt();

		int[][] a = new int[p][q];
		int[][] b = new int[p][q];
		int[][] c = new int[p][q];

		for (int i=0; i<p; i++) {
			for (int j=0; j<q; j++) {
				System.out.println("Enter a number for the first one: ");
				a[i][j] = sc.nextInt();
			}
		}
		for (int i=0; i<p; i++) {
			for (int j=0; j<q; j++) {
				System.out.println("Enter a number for the second one: ");
				b[i][j] = sc.nextInt();
			}
		}
		for (int i=0; i<p; i++) {
			for (int j=0; j<q; j++) {
				c[i][j] = (5*a[i][j])-b[i][j];
			}
		}
		String str = "";
		for (int i=0; i<p; i++) {
			for (int j=0; j<q; j++) {
				str += c[i][j] + ", ";
//				System.out.print(c[i][j] + " ");
			}
		}
		System.out.println(formatResultStr(str));
		// if column number = 5
		// a = 1 2 3 4 5
		// b = 1 2 3 4 5
		// 5 * (1*1) - (1*1) = 5 - 1 = 4
		// 5 * (1*2) - (1*2) = 10 - 2 = 8
		// 5 * (1*3) - (1*3) = 15 - 3 = 12
		// 5 * (1*4) - (1*4) = 20 - 4 = 16
		// 5 * (1*5) - (1*5) = 25 - 5 = 20
	}

}
