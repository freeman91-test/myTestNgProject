package sample;

public class Varargs {

	// Example of var args
	public static void main(String[] args) {
		methodint(1);
		methodint(1, 2, 9);
	}

	private static void methodint(int... a) {
		int sum = 0;
		System.out.println("Started int method");
		if (a.length > 1) {
			for (int i = 0; i < a.length; i++) {
				sum = sum + a[i];
			}
		} else {
			sum = a[0];
		}
		System.out.println("Total sum:  " + sum);
		System.out.println("Ended int method");
		System.out.println("===============================");
	}
}
