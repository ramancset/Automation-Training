package browserhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_9 {
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(2000);
	//Identify user name field
	WebElement login=driver.findElement(By.linkText("Login"));
	login.click();
	Thread.sleep(2000);
	WebElement emsg=driver.findElement(By.className("errormsg"));
	//Thread.sleep(2000);
	String s1= emsg.getText();
	//Thread.sleep(2000);
	System.out.println(s1);
	Thread.sleep(5000);
	String s2= emsg.getCssValue("color");
	System.out.println(s2);	
    }
}