package week.practise;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "madam";
		
		String rev = "";
		
		char[] charArray = a.toCharArray();
		
		for(int i=charArray.length-1;i>=0;i--) {
			rev =rev+charArray[i];
		}
		if(a.equals(rev)) {
			System.out.println("Its a palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

}
