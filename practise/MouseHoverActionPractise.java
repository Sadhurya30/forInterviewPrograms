package week.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActionPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disable-notifications","start-maximized");
		
		ChromeDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.myntra.com/");
		
		WebElement kids = driver.findElement(By.xpath("(//a[text()='Kids'])[1]"));
		
		Actions builder = new Actions(driver);
		
		builder.moveToElement(kids).perform();
		
		WebElement partyWear = driver.findElement(By.xpath("//a[text()='Party wear']"));
		
		builder.click(partyWear).perform();
		
		//driver.close();
		
		
		
		
		
		
		

	}

}
