package week.practise;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number =371;
		int originalNumber;
		int result = 0;
		int remainder;
		
		originalNumber = number;
		
		while(originalNumber!=0) {
			
			remainder = originalNumber%10;
			result = result+ (remainder * remainder *remainder);
			originalNumber = originalNumber / 10;
		}
		
		if(result == number) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not an armstrong number");
		}
		
		
	}

}
