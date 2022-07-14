package browserhandling;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_17 {
	public static void main(String[] args) throws InterruptedException
	{
        WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(50));
		driver.get("https://www.amazon.in/");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(5000);
		search.sendKeys("oneplus 9");
		Thread.sleep(5000);
		List<WebElement>option = driver.findElements(By.xpath(".//div[@class=\"autocomplete-results-container\"]//div[@class=\"s-suggestion\"]"));
		Thread.sleep(8000);
		System.out.println(option.size());
		Thread.sleep(5000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		//Thread.sleep(15000);
		List<WebElement>name = driver.findElements(By.xpath(".//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]//div[@class=\"a-section a-spacing-none s-padding-right-small s-title-instructions-style\"]"));
		Thread.sleep(20000);
		List<WebElement>price= driver.findElements(By.xpath(".//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]//span[@class=\"a-price\""));
		//Thread.sleep(20000);
		for(int a=0; a<name.size(); a++)
		{
			String name1 = name.get(a).getAttribute("alt");
			String price1 = price.get(a).getText();
			System.out.println();
			System.out.println(name1+"mobile and price"+price1);
		}
		TreeSet<Integer> ref2 = new TreeSet<Integer>();
		for(int a=0; a<price.size();a++)
		{
			String price1= price.get(a).getText();
			String price2=price1.substring(1);
			String price3=price2.replaceAll("," , "");
			int value = Integer.parseInt(price3);
			ref2.add(value);
			
		}
		
		System.out.println(ref2);		
		
	}

}
