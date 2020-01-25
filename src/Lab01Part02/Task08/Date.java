package Lab01Part02.Task08;

public class Date {
	int d, m, y; // field

	public Date(int d, int m, int y) { // constructor
		this.d = d;
		this.m = m;
		this.y = y;
	}

	public void setDate(int d) {
		if (d >= 1 && d <= 31) {
			this.d = d;
		}
	}

	public int getDate(int d) {
		return d;
	}

	public void setMonth(int m) {
		if (m >= 1 && m <= 12) {
			this.m = m;
		}
	}

	public int getMonth(int m) {
		return m;
	}

	public void setYear(int y) {
		if (y >= 0) {
			this.y = y;
		}
	}

	public int getYear(int y) {
		return y;
	}

	public void displayDate(int d, int m, int y) {
		System.out.println(d + "/" + m + "/" + y);
	}

}
