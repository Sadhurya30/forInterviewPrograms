package week.practise;

public class RemoveVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Sadhurya";
		
		String s1="";
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c== 'a'|  c== 'e'| c=='i' | c=='o' | c=='u' | c=='A' | c=='E' | c=='I'| c=='O' | c=='U') {
				continue;
			}
			s1+=c;
		}
		System.out.println(s1);

	}

}
