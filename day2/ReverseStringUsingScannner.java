package week8.day2;

import java.util.Scanner;

public class ReverseStringUsingScannner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String nextLine = scan.nextLine();
		
		char[] charArray = nextLine.toCharArray();
		
		for(int i=charArray.length-1;i>=0;i--) {
			System.out.println(charArray[i]);
		}

	}

}
