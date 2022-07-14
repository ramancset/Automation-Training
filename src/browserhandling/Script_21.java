package browserhandling;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_21 
{
	public static void main(String[] args) throws FindFailed, InterruptedException
	{
        WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String pathString = "../Automation Training/sikuli_photo/Screenshot.png";
		File f = new File(pathString);
		String Screenshot = f.getAbsolutePath();
	   // Pattern scr=new Pattern(Screenshot);
		Screen s = new Screen();
		s.mouseMove(Screenshot);
		s.click();
		Thread.sleep(5000);
		s.type("selenium");
		String sech = "../Automation Training/sikuli_photo/search.png";
		File f1 = new File(sech);
		String search1 = f1.getAbsolutePath();
		s.click(search1);
		
	}
	

}
