import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseAction {

	public static void main(String[] args) throws AWTException 
	{
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.yatra.com/");
		WebElement tgt_element = driver.findElement(By.xpath(".//.//a[text()='Support ']"));
		Actions a = new Actions(driver);
		a.moveToElement(tgt_element).perform();
		a.contextClick().perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_K);
		r.keyPress(KeyEvent.VK_ENTER);

	}

}
