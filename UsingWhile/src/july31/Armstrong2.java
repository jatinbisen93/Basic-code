package july31;

public class Armstrong2 {

	public static void main(String[] args) {

		int num = 1634;
		int temp = num;
		int count = 0;
		int sum = 0;

		while (temp > 0) {
			count++;
			temp /= 10;
		}
		temp = num;
		while (temp > 0) {
			int digit = temp % 10;//
			sum += Math.pow(digit, count);
			temp /= 10;
		}
		if (sum == num) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not Armstrong");
		}
	}
}
