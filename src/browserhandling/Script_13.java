package browserhandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_13 {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/35862/wi-vs-eng-3rd-t20i-england-tour-of-west-indies-2022");
		Thread.sleep(8000);
		List<WebElement>name = driver.findElements(By.xpath(".//div[@id=\"innings_1\"]//div[@class=\"cb-col cb-col-27 \"]"));
		Thread.sleep(5000);
		List<WebElement>run = driver.findElements(By.xpath(".//div[@id=\"innings_1\"]//div[@class=\"cb-col cb-col-100 cb-scrd-itms\"]//div[@class=\"cb-col cb-col-8 text-right text-bold\"]"));
		Thread.sleep(8000);
		for(int a=0; a<=name.size()-1; a++)
		{
			String player_name = name.get(a).getText();
			String score = run.get(a).getText();
			System.out.println(player_name+ " run made "+ score);
		}
	}

}
