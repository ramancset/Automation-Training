package browserhandling;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_10 {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
				
				WebDriver driver = new FirefoxDriver();
				driver.get("https://demo.actitime.com/login.do");
				WebElement pwd=driver.findElement(By.name("pwd"));
				String placeholder_value=pwd.getAttribute("placeholder");
				if(placeholder_value.isEmpty())
				{
					System.out.println("Passward field is not contain default filed");
				}
				else
				{
					System.out.println("Passward field is contain default filed");

				}
				


}
}