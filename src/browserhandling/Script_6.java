package browserhandling;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_6 {
	public static void main(String args[])
	{
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");

		//Username
		int  usr_H = driver.findElement(By.id("username")).getRect().getX();
		int usr_W=driver.findElement(By.id("username")).getRect().getY();
		//password
		int pwd_H= driver.findElement(By.name("pwd")).getRect().getX();
		int pwd_W= driver.findElement(By.name("pwd")).getRect().getY();
		
		if(usr_H ==pwd_H && usr_W<pwd_W)
		{
			System.out.println("Alligment Ok");
		}
		else
		{
			System.out.println("Allignment is not ok");
		}
	}
}


