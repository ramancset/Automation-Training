import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scroll_01 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//input[@class=\"_3704LK\"]")).sendKeys("iphone 12");
		driver.findElement(By.className("L0Z3Pu")).click();
		//driver.findElement(By.xpath(".//a[class=\"_1_3w1N\"]")).click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		for(int a=0;a<5;a++)
		{
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(3000);
			
			
		}

	}

}
