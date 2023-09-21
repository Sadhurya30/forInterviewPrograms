package week.practise;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeDriver driver = new  ChromeDriver();
		
		driver.get("https://www.leafground.com/window.xhtml;jsessionid=node01atv6rfwzuler4wku4rvj1dv6442956.node0");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String parentWindow = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		Set <String> windowHandle = driver.getWindowHandles();
		
		List<String> windowHandle1 = new ArrayList<String>(windowHandle);
		
		driver.switchTo().window(windowHandle1.get(1));
		
		String text = driver.getTitle();
		System.out.println(text);
		
		driver.switchTo().window(parentWindow);
		
		driver.close();
		
		
		
	}

}
