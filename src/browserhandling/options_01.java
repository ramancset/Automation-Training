package browserhandling;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class options_01 {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	Thread.sleep(4000);
	driver.get("file:///C:/Users/Raman%20Jha/Downloads/options.html");
	Thread.sleep(4000);
	WebElement list = driver.findElement(By.xpath("//select"));
	Select s=new Select(list);
	List<WebElement> ref = s.getOptions();
	int count = ref.size();
	System.out.println("total options in listbox::"+count);
	//for (int i = 0; i < ref.size(); i++) {
		//if (i%2==0) {
			//String text = ref.get(i).getText();
			//s.selectByIndex(text);
	
			//System.out.println(i);
			
		//}
		
	//}
	//select all options
	List<WebElement> ref1 = s.getOptions();
	for (int i = 0; i < ref1.size(); i=i++) {
	String text=ref1.get(i).getText();
		if(text.contains("Testing"))
		{
		 s.selectByIndex(i);
		}
		
	}
	//select by value
	
	
	
}
}
