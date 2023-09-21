package week.practise;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     ChromeDriver driver = new ChromeDriver();
     
     driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node01vnjt03z3e6d414yp26alvm8r1437142.node0");
     
     driver.manage().window().maximize();
     
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     
     driver.findElement(By.xpath("//span[text()='Show']")).click();
     
     Thread.sleep(2000);
     
     Alert simpleAlert = driver.switchTo().alert();
     simpleAlert.accept();
     
     driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
     
     Alert confirmationAlert = driver.switchTo().alert();
     confirmationAlert.accept();
     
     driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
     
     Alert promptAlert = driver.switchTo().alert();
     promptAlert.sendKeys("just for sample");
     
     promptAlert.accept();
     
     WebElement a =driver.findElement(By.xpath("(//span[text()='Show'])[3]"));
     a.click();
     driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
     
     
     
    // Alert sweetAlert = driver.switchTo().alert();
     
     driver.findElement(By.xpath("(//span[text()='Show'])[6]")).click();
     
     driver.findElement(By.xpath("(//a[@aria-label='Close'])[3]")).click();
     
     driver.close();
     
     
     
	}

}
