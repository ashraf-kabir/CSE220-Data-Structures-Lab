package Lab01Part02.Task10;

public class Rotate {

	public static int[] rotateLeft(int[] s, int p) {
		int[] a = new int[s.length];
		int count = p;
		for (int e = 0; e < a.length; e++) {
			if (count == s.length) {
				count = 0;
			}
			a[e] = s[count];
			count++;
		}
		return a;
	}

	public static int[] rotateRight(int[] s, int p) {
		int[] a = new int[s.length];
		int count = 0;
		int counter = s.length - p;
		for (int e = 0; e < a.length; e++) {
			if (count == p) {
				counter = 0;
			}
			a[e] = s[counter];
			counter++;
			count++;
		}
		return a;
	}

}
