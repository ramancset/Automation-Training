package browserhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_15 {
	public static void main(String[] args) throws InterruptedException
	{
        WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		
		int heig = driver.findElement(By.name("q")).getRect().getHeight();
		System.out.println(heig);
		Thread.sleep(5000);
		int width = driver.findElement(By.name("q")).getRect().getWidth();
		System.out.println(width);
		Thread.sleep(5000);
		int x = driver.findElement(By.name("q")).getRect().getX();
		System.out.println(x);
		Thread.sleep(5000);
		int y = driver.findElement(By.name("q")).getRect().getY();
		System.out.println(y);
		
	}

}
