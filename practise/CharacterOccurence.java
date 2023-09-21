package week.practise;

public class CharacterOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Sadhurya";
		
		char c= 'a';
		int count =0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==c) {
				count++;
			}
		}
		System.out.println("character occurence " + count);
	}

}
