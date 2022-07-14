package browserhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class actitme1 {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(50));
		driver.get("https://demo.actitime.com/login.do");
		//Thread.sleep(5000);
		WebElement use = driver.findElement(By.id("username"));
		Thread.sleep(5000);
		use.click();
		use.sendKeys("admin");
		WebElement pwd = driver.findElement(By.name("pwd"));
		pwd.click();
		Thread.sleep(5000);
		pwd.sendKeys("manager");
		Thread.sleep(5000);
	    driver.findElement(By.id("loginButton")).click();
	    Thread.sleep(9000);
	    WebElement n_butt  = driver.findElement(By.id("addTaskButtonId"));
	    n_butt.click();
	    Thread.sleep(15000);
	    driver.findElement(By.xpath("(.//div[@class=\"dropdownButton\"])[5]")).click();
	    Thread.sleep(15000);
	    WebElement sec = driver.findElement(By.xpath(".//div[text()='- New Customer -']"));
	    sec.click();	    
	}
}
