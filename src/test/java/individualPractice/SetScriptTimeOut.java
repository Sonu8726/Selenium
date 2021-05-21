/**
 * 
 */
package individualPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Ghost
 *
 */
public class SetScriptTimeOut {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().setScriptTimeout(1, TimeUnit.SECONDS);
		driver.get("https://forbes.com");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
