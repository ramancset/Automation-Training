import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class referesh_01 {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String tittle = js.executeScript("return document.tittle").toString();
		System.out.println(tittle);
		String url = js.executeScript("return document.URL").toString();
		System.out.println(url);
		js.executeScript("history.go(0)");
		js.executeScript("window.location='https://www.flipkart.com/'");
		
		js.executeScript("history.go(-1)");
		js.executeScript("history.go(+1)");
		

	}

}
