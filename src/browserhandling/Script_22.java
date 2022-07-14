package browserhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_22 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Create New Account"));
		Thread.sleep(1000);
		
		//identify first element
		WebElement first_name=driver.findElement(By.xpath(".//input[@name='firstname']"));
		int f_locX=first_name.getRect().getX();
		int f_locY=first_name.getRect().getY();
		
		//identify last element
		WebElement last_name=driver.findElement(By.xpath(".//input[@name='lastname']"));
		int l_locX=last_name.getRect().getX();
		int l_locY=last_name.getRect().getY();
		
		if(f_locX==l_locX && f_locY==l_locY )
		{
			System.out.println("last name field aligned left side of first name");
		}
		else
		{
			System.out.println("last name field not aligned left side of first name");

		}		

	}

}
