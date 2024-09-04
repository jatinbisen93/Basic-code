package july31;

public class Reverse {

	public static void main(String[] args) {

		int num = 728;
		int reverse = 0;
		int rem = 0;

		 while (num > 0) {
		//for (int i = 0; i < num; i++) {

			rem = num % 10;
			reverse = reverse * 10 + rem;
			num = num / 10;
		}
		System.out.println(reverse);
	}
}
