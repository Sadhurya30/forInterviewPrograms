package week.practise;

import java.time.Duration;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindow2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//https://www.leafground.com/window.xhtml;jsessionid=node01atv6rfwzuler4wku4rvj1dv6442956.node0
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/window.xhtml;jsessionid=node01atv6rfwzuler4wku4rvj1dv6442956.node0");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String text = driver.getTitle();
		System.out.println(text);
		
		String parentWindow = driver.getWindowHandle();
		
		Set<String> childWindow = driver.getWindowHandles();
		
		List<String> childWindow1 = new ArrayList<String>(childWindow);
		
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		driver.switchTo().window(childWindow1.get(0));
		
		String text1 = driver.getTitle();
		System.out.println(text1);
		
		
		driver.switchTo().window(childWindow1.get(0));
		driver.close();
		
		
		

	}

}
