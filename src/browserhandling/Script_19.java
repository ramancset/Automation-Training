package browserhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_19 {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		driver.get("https://www.abhibus.com/?utm_source=google&utm_medium=cpc&utm_campaign=CompetitorKW&utm_term=makemytrip%20bus%20booking&utm_content=Competitor&gclid=EAIaIQobChMI5suV8u_t9QIVhTMqCh3d2gWnEAAYASAAEgKg3fD_BwE");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//input[@id=\"datepicker1\"]")).click();
		Thread.sleep(5000);
		//select expected month
		String exp_month = "March 2022";
		String exp_date = "12";
		while(true)
		{
			String dis_month = driver.findElement(By.xpath(".//div[@id=\"ui-datepicker-div\"]/div[1]/div[1]//div[@class=\"ui-datepicker-title\"]")).getText();
			Thread.sleep(5000);
			if(dis_month .equals(exp_month))
			{
				while(true)
				{
					String dis_day = driver.findElement(By.xpath(".//div[@id=\"ui-datepicker-div\"]/div[1]//table[@class=\"ui-datepicker-calendar\"]//tbody//td//a[text()='"+exp_date+"']")).getText();
					//String dis_day = driver.findElement(By.xpath(".//div[@id=\"ui-datepicker-div\"]/div[1]//table[@class=\"ui-datepicker-calendar\"]//tbody/tr/td")).getText();
					Thread.sleep(5000);
					if(dis_day.equals(exp_date))
					{
						break;
						
					}
				}
				System.out.println("Program End");
				break;
				
			}
			else
			{
				driver.findElement(By.xpath(".//div[@id=\"ui-datepicker-div\"]/div[2]//span[text()='Next']")).click();
				Thread.sleep(5000);
				
			}
		}
	}

}
