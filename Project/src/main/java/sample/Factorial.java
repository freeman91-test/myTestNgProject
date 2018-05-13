package sample;

public class Factorial {

	public static void main(String[] args) {

		System.out.println(getFactorialOf(5));
	}

	private static int getFactorialOf(int i) {
		int fact = 1;
		while (i != 0) {
			fact = fact * i;
			i--;
		}

		return fact;
	}

}
