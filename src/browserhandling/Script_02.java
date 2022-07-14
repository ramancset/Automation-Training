package browserhandling;



import org.openqa.selenium.Dimension;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_02 
{
	public static void main(String[] args) throws Exception
	{
	WebDriverManager.chromedriver().setup();
	//WebDriver driver = new ChromeDriver();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	Thread.sleep(2000);
	driver.navigate().to("https://www.facebook.com");
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	Dimension d = new Dimension(200, 400);
	driver.manage().window().setSize(d);
	Thread.sleep(2000);
	//Object p=200;
	Point s = new Point(200,150);
	driver.manage().window().setPosition(s);
	
	driver.close();
	}

}
