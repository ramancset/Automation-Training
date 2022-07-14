package browserhandling;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Script_18 {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement username = driver.findElement(By.id("username"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		boolean status = username.isDisplayed();
		if(status) {
			username.sendKeys("raman");
			System.out.println("username verified");
		}
		else {
			System.out.println("username not verified");
		}
	}

}
