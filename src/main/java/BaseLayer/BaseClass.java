package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
   protected static	WebDriver driver;
	public static void intialization() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OM\\eclipse-workspace\\selenium2\\Driver\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
	}
	

}
