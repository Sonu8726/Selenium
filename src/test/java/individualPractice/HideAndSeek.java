/**
 * 
 */
package individualPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Ghost
 *
 */
public class HideAndSeek {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("show-textbox")).click();
		boolean inputVisibilityStatus = driver.findElement(By.id("displayed-text")).isDisplayed();
		if (inputVisibilityStatus == true) {
			System.out.println("Textbox is Displaying");
			driver.findElement(By.id("displayed-text")).sendKeys("Testing");
			String tempText = driver.findElement(By.id("displayed-text")).getText();
			if (tempText.equalsIgnoreCase("Testing")) {
				System.out.println("Validation Successfull part 1");
			} else {
				System.out.println("Validation failed part 1");
			}

		} else {
			System.out.println("displayed text input box is not present");
		}
		inputVisibilityStatus = false;
		driver.findElement(By.id("hide-textbox")).click();
		inputVisibilityStatus = driver.findElement(By.id("displayed-text")).isDisplayed();
		if (inputVisibilityStatus == true) {
			System.out.println("Textbox is Displaying");
			driver.findElement(By.id("displayed-text")).sendKeys("Testing");
			String tempText = driver.findElement(By.id("displayed-text")).getText();
			if (tempText.equalsIgnoreCase("Testing")) {
				System.out.println("Validation Successfull part 2");
			} else {
				System.out.println("Validation failed part 2");
			}

		} else {
			System.out.println("displayed text input box is not present");
		}
		driver.quit();
	}
}
