package week.practise;

public class RemoveVowelsUsingReplaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s ="Sadhurya";
		String s1 = "";
		
		s1 = s.replaceAll("[AEIOUaeiou]", "");
		System.out.println(s1);
	}

}
