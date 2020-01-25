package Lab01Part02.Task11;

public class ComplexNumber extends RealNumber {

	private double imaginary;

	public ComplexNumber() {
		super(1.0);
		imaginary = 1.0;
	}

	public String toString() {
		String x = "RealPart : " + getRealValue();
		String y = "ImaginaryPart : " + imaginary;
		return x + "\n" + y;
	}

	public ComplexNumber(double x, double y) {
		super(x);
		imaginary = y;
	}

	public void check() {
		System.out.println("I'm in ComplexNumber class");
		ping();
		System.out.println("Checking ended.");
	}

}
