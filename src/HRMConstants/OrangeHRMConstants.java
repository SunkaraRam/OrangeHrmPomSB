package HRMConstants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class OrangeHRMConstants {
	
	static WebDriver driver;
	
	static String url = "http://orangeHRM.qedgetech.com";
	@BeforeSuite
	public static void launchApp() {
	
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(url);

	}

	@AfterSuite
	public static void closeApp() {
		
		driver.close();
		
	}
	
}
