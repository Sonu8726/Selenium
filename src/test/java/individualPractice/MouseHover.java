/**
 * 
 */
package individualPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author Ghost
 *
 */
public class MouseHover {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Actions actn = new Actions(driver);
		WebElement mhover = driver.findElement(By.id("mousehover"));
		actn.moveToElement(mhover).build().perform();

		boolean topDisplay = driver.findElement(By.linkText("Top")).isDisplayed();
		if (topDisplay == true) {
			System.out.println("Print Work exact");
		} else {
			System.out.println("Something Failed");
		}
		Thread.sleep(8000);
		driver.close();
	}

}
