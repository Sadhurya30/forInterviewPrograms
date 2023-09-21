package week.practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class snapDeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement mensFashion = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
		
		Actions builder = new Actions(driver);
		
		builder.moveToElement(mensFashion).perform();
		
		WebElement sportsShoes = driver.findElement(By.xpath("(//span[text()='Sports Shoes']/parent::a)[1]"));
				
		builder.click(sportsShoes).perform();
		
		WebElement count = driver.findElement(By.xpath("(//div[text()='5184'])[4]"));
		
		System.out.println(count);
		
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		
		//driver.findElement(By.xpath("//div[@class='sort-selected']/parent::div")).click();
		
		driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")).click();
		
		driver.findElement(By.xpath("(//li[@class='search-li'])[1]")).click();
		
		WebElement a = driver.findElement(By.xpath("(//input[@class='input-filter'])[1]"));
		a.clear();
		a.sendKeys("900");
		
		//WebElement b = driver.findElement(By.xpath("//input[@class='input-filter'])[2]"));
		WebElement b = driver.findElement(By.name("toVal"));
		b.clear();
		b.sendKeys("1200");
		
		

	}

}
