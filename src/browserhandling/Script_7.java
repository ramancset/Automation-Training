package browserhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_7 {
	{
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		//Username
		int  usr_H = driver.findElement(By.id("username")).getRect().getHeight();
		int usr_W=driver.findElement(By.id("username")).getRect().getWidth();
		//password
		int pwd_H= driver.findElement(By.name("pwd")).getRect().getHeight();
		int pwd_W= driver.findElement(By.name("pwd")).getRect().getWidth();
		
		if(usr_H ==pwd_H && usr_W==pwd_W)
		{
			System.out.println("Dimentions are same");
		}
		else
		{
			System.out.println("Dimentions are not same");
		}
	}

}
