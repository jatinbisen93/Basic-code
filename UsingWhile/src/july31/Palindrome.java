package july31;

public class Palindrome {

	public static void main(String[] args) {
        
		int num=23232;
		int n=0;
		int reverse=0;
		int ognum=num;
		
		while(num>0) {
			
			reverse=num%10;
			n=n*10+reverse;
			num=num/10;	
		}
		if(ognum==n) {
					System.out.println("yes");
		}
		else {
			
			System.out.println("no");
		}
	}
}
