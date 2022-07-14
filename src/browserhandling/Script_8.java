package browserhandling;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_8 {
	public static void main(String[] args)
	{
        WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		String checkBox=driver.findElement(By.id("keepLoggedInCheckBox")).getTagName();
		//String Tag_name=.getTagName();
		String checkBox1=driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("title");

		System.out.println("Tag name is"+checkBox);
		System.out.println("Title attribute value"+checkBox1);
	}
 
}
