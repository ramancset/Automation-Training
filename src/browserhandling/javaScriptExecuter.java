package browserhandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javaScriptExecuter 
{
	public static void main(String []args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		javaScriptExecuter js = (javaScriptExecuter).driver;
		
	}

}
