/**
 * 
 */
package individualPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Ghost
 *
 */
public class ImplicitWait {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com/");
		System.out.println("System is goint in Wait mode");
//		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("alison")).click();
		System.out.println("System is coming from Wait mode");

		driver.close();
	}

}
