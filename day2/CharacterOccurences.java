package week8.day2;

public class CharacterOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="sadhurya";
		
		char c = 'a';
		int count =0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==c) {
				count++;
			}
		}
		System.out.println("character occurence of a is " + count);
		
	}

}
