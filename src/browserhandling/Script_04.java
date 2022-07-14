package browserhandling;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_04 {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https:actitime.com");
	    WebElement un=driver.findElement(By.id("username"));
	    driver.findElement(locator).getsize().getHeight();
	    driver.findElement(locator).getsize().getwidth();
	    driver.findElement(locator).getsize().getX();
	    driver.findElement(locator).getsize().getY();
		


