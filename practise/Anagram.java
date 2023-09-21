package week.practise;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a = "stops";
		
		String b= "potss";
		
		int len1=a.length();
		int len2 = b.length();
		
		if(len1 ==len2) {
			
			char[]  c1 = a.toCharArray();
			char[]  c2 = b.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			System.out.println((c1));
			System.out.println((c2));
			
			boolean z = Arrays.equals(c1, c2);
			if(z) {
				System.out.println("It is an anagram");
			}
			else {
				System.out.println("not an anagram");
			}
			
		}
	}

}
