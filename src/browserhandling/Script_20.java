package browserhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_20 {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		driver.get("https://www.trivago.in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(.//button[text()='OK']")).click();
		driver.findElement(By.xpath("(.//button[@data-testid=\"calendar-checkin\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(.//div[@class=\"grid grid-cols-2 gap-10\"]/div[1]//table//tbody/tr/td//button[contains(@class,'font-bold')])[1]")).click();
	}

}
