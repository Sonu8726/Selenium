package Testing.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://google.com/"); // enter url
		driver.manage().window().maximize();

		// login
		WebElement searchQuery = driver.findElement(By.name("q"));
//		WebElement password = driver.findElement(By.name("password"));

		searchQuery.sendKeys("Test");
		searchQuery.submit();
		driver.manage().timeouts();
		System.out.println("Success");
		driver.close();
	}

}
