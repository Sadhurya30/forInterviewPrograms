package week.practise;

public class Car extends Automobile {

	public void mirror() {
		System.out.println("mirror");
	}
	
	public void doors() {
		System.out.println("doors");
	}
	
	public void seats() {
		System.out.println("Method overriding seats");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c = new Car();
		c.mirror();
		c.doors();
		c.seats();
		c.steering();
		c.wheels();
		
		
	}

}
