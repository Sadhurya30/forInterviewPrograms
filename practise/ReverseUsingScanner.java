package week.practise;

import java.util.Scanner;

public class ReverseUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		
		
		char[] charArray = a.toCharArray();
		
		for(int i=charArray.length-1;i>=0;i--) {
			
			System.out.print(charArray[i]);
		}
	}

}
