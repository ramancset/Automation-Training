package browserhandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_14 {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("selenium");
		Thread.sleep(9000);
		List<WebElement>option = driver.findElements(By.xpath(".//div[@class=\"OBMEnb\"]//div[@class=\"pcTkSc\"]"));
		Thread.sleep(5000);
		System.out.println(option.size());
		for(int i=0; i<option.size();i++)
		{
			String sugg = option.get(i).getText();
			System.out.println(sugg);
		}
		search.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(8000);
		search.sendKeys(Keys.ARROW_DOWN);
		search.click();
		//WebElement option1 = driver.findElement(By.xpath("(.//div[@class=\"OBMEnb\"]//div[@class=\"pcTkSc\"])[2]"));
		//WebElement search1=driver.findElement(By.xpath(".//span[contain"));
		//Thread.sleep(5000);
		//String sec=option1.getText();
		//Thread.sleep(2000);
		//System.out.println(sec);
	
	}

}
