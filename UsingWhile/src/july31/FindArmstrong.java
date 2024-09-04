package july31;

public class FindArmstrong {

	public static void main(String[] args) {

		int i;
		int num = 0;
		int num1=0;
		int temp=0 ;
		int count = 0;
		int sum = 0;

		 
		while (temp <num1) {
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
