package week8.day2;

public class CharacterOccurences2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="Sadhurya";
		
		int[] charOccurences = new int[256];
		
		char[] charArray = s.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			charOccurences[i]++;
		}
		
		for(int i=0;i<256;i++) {
			if(charOccurences[i]>0) {
				System.out.println("Character: " + (char)i +",occurences: " +charOccurences[i]);
			}
		}

	}

}
