package week.practise;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a ="testleaf";
		
		char[] charArray = a.toCharArray();
		
		for(int i=0;i<charArray.length;i++) {
			
			if(i%2==1) {
				System.out.print(Character.toUpperCase(charArray[i]));
			}
			else {
				System.out.print(charArray[i]);
			}
			
		}
		
		System.out.println();
		System.out.println(a.toUpperCase());
	}

}
