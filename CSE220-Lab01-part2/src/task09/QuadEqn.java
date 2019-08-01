package task09;

public class QuadEqn {

	public double root(int a, int b, int c) {

		double root = (-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
		return root;
	}

}
