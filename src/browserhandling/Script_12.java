package browserhandling;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_12 {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.trivago.in/");
		Thread.sleep(5000);
		WebElement cocies=driver.findElement(By.id("onetrust-accept-btn-handler"));
		Thread.sleep(8000);
		cocies.click();
		Thread.sleep(8000);
		WebElement text=driver.findElement(By.xpath(".//input[@type=\"search\"]"));
		text.sendKeys(" B e n g a l u r u ");
		Thread.sleep(5000);
		text.click();
	    Thread.sleep(5000);
		driver.findElement(By.xpath(".//span[@class=\"search-button__label\"]")).click();
		Thread.sleep(10000);
		String hotel = ".//div[@class=\"item__flex-column\"]//span[@class=\"item-link name__copytext name__copytext--small\"]";
		List<WebElement> hotelname = driver.findElements(By.xpath(hotel));
		Thread.sleep(2000);
		String amt = ".//div[@class=\"item__flex-column\"]//div[@class=\"accommodation-list__price--5d246\"]";
		List<WebElement>amount = driver.findElements(By.xpath(amt));
		for(int i=0; i<hotelname.size();i++)
		{
			String hotel_name = hotelname.get(i).getText();
			String rent = amount.get(i).getText();
			System.out.println(hotel_name+ " price is "+ rent);
		}
		
	}
}
