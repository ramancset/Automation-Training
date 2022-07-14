package browserhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_23 {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://integrator.actitime.com/auth/at");
		Thread.sleep(1000);
		
		//identify usename
		WebElement u=driver.findElement(By.xpath(".//input[@name='username']"));
		u.sendKeys("admin");

		u.sendKeys(Keys.CONTROL,"a");
		Thread.sleep(1000);
		u.sendKeys(Keys.CONTROL,"c");
		Thread.sleep(1000);
		
		//identify password filed
		WebElement p=driver.findElement(By.xpath(".//input[@name='password']"));
		p.sendKeys(Keys.CONTROL,"v");
		
		
	}

}
