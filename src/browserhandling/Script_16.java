package browserhandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_16 {
	public static void main(String[] args) throws InterruptedException
	{
        WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath(".//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		Thread.sleep(5000);
		List<WebElement>ref = driver.findElements(By.xpath(".//div[@id=\"container\"]//img]"));
		Thread.sleep(9000);
		int count = ref.size();
		System.out.println("total image count"+count);
		Thread.sleep(5000);
		for(int a=0; a<ref.size(); a++)
		{
			String image = ref.get(a).getAttribute("alt");
			System.out.println(image);
		}
	}

}
