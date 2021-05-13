package Testing.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public WebDriver driver;

	public static void main(String[] args) {
		// Set system property for browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\lib\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ghost\\eclipse-workspace\\Selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		//get title
		
		String URLTitle = driver.getTitle();
		System.out.println(URLTitle);
		System.out.println(driver.getWindowHandle());
		
		driver.close();
	}

}
