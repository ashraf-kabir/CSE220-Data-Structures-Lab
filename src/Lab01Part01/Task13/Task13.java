package Lab01Part01.Task13;

public class Task13 {

	public static int[] removeOdd(int[] input) {
		int j = 0;
		int count = 0;
		for (int i=0; i<input.length; i++) {
			if (input[i]%2==0) {
				count++;
			}
		}
		int[] noOdd = new int[count];
		for (int i=0; i<input.length; i++) {
			if (input[i]%2==0) {
				noOdd[j]=input[i];
				j++;
			}
		}
		return noOdd;
	}

	private static String formatResultStr(String str) {
		String formattedStr = str.substring(0, str.length() - 2) + ".";
		formattedStr = formattedStr.replaceFirst(",(?=[^,]+$)", " &");
		return formattedStr;
	}

	public static void main(String[] args) {
		int[] mixedArray = { 21, 33, 44, 66, 11, 1, 88, 45, 10, 9 };
		String arrStr = "";
		for (int i=0; i<mixedArray.length; i++) {
//			System.out.print(mixedArray[i] + " ");
			arrStr += mixedArray[i] + ", ";
		}
		System.out.println(formatResultStr(arrStr));

		int[] noOdd = removeOdd(mixedArray);
		String resString = "";
		for (int i=0; i<noOdd.length; i++) {
//			System.out.print(noOdd[i] + " ");
			resString += noOdd[i] + ", ";
		}
		System.out.println(formatResultStr(resString));
	}

}
