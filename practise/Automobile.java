package week.practise;

public class Automobile {

	public void wheels() {
		System.out.println("Wheels");
	}
	
	public void wheels(int a,int b) {
		int c = a+b;
		System.out.println(c);
	}
	
	public void wheels(int a, int b, int c) {
		int z = a+b+c;
		System.out.println(z);
		
		
	}
	
	public void steering() {
		System.out.println("Steering");
	}
	
	public void seats() {
		System.out.println("seats");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Automobile a = new Automobile();
     
     a.wheels();
     a.steering();
     a.seats();
     a.wheels(5,6);    
     a.wheels(5,6,7);
	}

}
