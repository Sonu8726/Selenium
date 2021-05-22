/**
 * 
 */
package individualPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Ghost
 *
 */
public class ExplicitTimeOut {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

		driver.findElement(By.xpath("//button")).click();

		WebDriverWait wbWait = new WebDriverWait(driver, 30);
		WebElement element = wbWait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(.,'WebDriver')]")));

		System.out.println(element.getText());
		System.out.println(element.isDisplayed());
		driver.close();
	}

}
