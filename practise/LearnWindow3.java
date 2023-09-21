package week.practise;

import java.time.Duration;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindow3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/window.xhtml;jsessionid=node01atv6rfwzuler4wku4rvj1dv6442956.node0");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		Set <String> childWindow = driver.getWindowHandles();
		
		//Set <String> windowHandle = driver.getWindowHandles();
		
		List<String> childWindow1 = new ArrayList<String> (childWindow);
		
		driver.switchTo().window(childWindow1.get(1));
		
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		//driver.switchTo().window(parentWindow);
		driver.switchTo().window(childWindow1.get(0));
		
		Thread.sleep(3000);
		
		driver.close();
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
	}

}
