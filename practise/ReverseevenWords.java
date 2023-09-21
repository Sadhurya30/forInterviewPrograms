package week.practise;

public class ReverseevenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  //        1  2 3   4       5
		String a = "I am a software tester";
	 //             0  1 2   3       4
				
	
	    String[] stringArray = a.split(" ");
	    
	    for(int i =0 ; i<stringArray.length;i++){
	    	if(i%2==1){
	    		char[] charArray = stringArray[i].toCharArray();
	    		for(int j=charArray.length-1;j>=0;j--) {
	    			System.out.print(charArray[j]);
	    		}
	    	System.out.print(" ");
	    	}
	    	else {
	    		System.out.print(stringArray[i] + " ");
	    	}
	    }
		
	}

}
