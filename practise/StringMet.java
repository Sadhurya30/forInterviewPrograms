package week.practise;

public class StringMet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "changeme";
				
		char[] charArray = a.toCharArray();
		
		for(int i=0;i<charArray.length;i++) {
			if(i%2!=0) {
				System.out.print(Character.toUpperCase(charArray[i]));
			}
			else {
				System.out.print((charArray[i]));
			}
		}
		
	}

}
