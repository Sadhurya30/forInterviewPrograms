package week.practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/frame.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.switchTo().frame(0);
		
		WebElement w =driver.findElement(By.id("Click"));
		w.click();
		
		String s=w.getText();
		System.out.println(s);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		
		WebElement w1=driver.findElement(By.xpath("//button[text()='Count Frames']"));
		w1.click();
		String s1 = w1.getText();
		System.out.println(s1);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		
		WebElement w2 = driver.findElement(By.xpath("//button[text()='Click Me']"));
		w2.click();
		String s2 = w2.getText();
		System.out.println(s2);
		
		
	}

}
