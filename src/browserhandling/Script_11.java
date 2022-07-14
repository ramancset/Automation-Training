package browserhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_11 {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("selenium");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement search1=driver.findElement(By.xpath(".//input[@value=\"selenium\"]"));
		Thread.sleep(2000);
		String n1=search1.getAttribute("value");
		System.out.println(n1);
	}
}
