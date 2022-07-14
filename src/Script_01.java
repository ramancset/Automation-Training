import org.openqa.selenium.chrome.ChromeDriver;

public class Script_01 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "../Automation Training/browserdriverexecutiable/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException
{
	ChromeDriver rv = new ChromeDriver();
	rv.get("http://www.facebook.com");
	Thread.sleep(2000);
	rv.close();
}
}
