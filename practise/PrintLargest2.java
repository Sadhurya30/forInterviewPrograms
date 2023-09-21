package week.practise;

public class PrintLargest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {33,77,999,22,10,5};
		
		int max = arr1[0];
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]>max) {
				max = arr1[i];
			}
		}
		System.out.println(max);
	}

}
