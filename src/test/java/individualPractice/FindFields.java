/**
 * 
 */
package individualPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Ghost // find values using locator
 *
 */
public class FindFields {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\lib\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://facebook.com/");
		driver.manage().window().maximize();

		// driver.findElement(By.className(null));
		// driver.findElement(By.cssSelector(null));
		System.out.println(driver.findElement(By.id("reg_pages_msg")));
		System.out.println(driver.findElement(By.linkText("Forgotten password?")));
		System.out.println(driver.findElement(By.name("email")));
		// driver.findElement(By.partialLinkText(null));
		System.out.println(driver.findElement(By.tagName("h2")));
		// driver.findElement(By.xpath(null));
		System.out.println("Everything was good");
		driver.close();
	}

}
