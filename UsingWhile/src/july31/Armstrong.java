package july31;

public class Armstrong {

	public static void main(String[] args) {

		int num = 92727;
		int b;
		int c = 0;
		int res = num;

		while (num > 0) {
			b = num % 10;
			c = c + b * b * b * b * b;
			num = num / 10;
		}
		if (res == c) {
			System.out.println("Armstrong num");
		} else {
			System.out.println("Not a Armstrong num");
		}

	}
}
