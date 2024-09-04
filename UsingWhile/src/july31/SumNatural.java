package july31;

public class SumNatural {

	public static void main(String[] args) {

		// sum of natural no.
		int n = 5;
		int i = 1;
		int sum = 0;

		while (i <= n) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
}
