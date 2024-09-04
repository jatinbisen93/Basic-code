package july31;

public class Count {

	public static void main(String[] args) {

		// count of digit
		int num = 424513;
		int i = 1;
		int count = 0;
		while (num > 0) {

			num /= 10;
			count++;

		}
		System.out.println(count);
		
	}

}
