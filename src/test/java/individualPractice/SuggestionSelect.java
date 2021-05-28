/**
 * 
 */
package individualPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author Ghost
 *
 */
public class SuggestionSelect {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Suggestion Search Select");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement textbox = driver.findElement(By.id("autocomplete"));
		Actions builder = new Actions(driver);
		textbox.sendKeys("India");
		builder.sendKeys(Keys.ARROW_DOWN).click().build().perform();
		builder.sendKeys(Keys.ARROW_DOWN).click().build().perform();
		builder.sendKeys(Keys.ENTER).click().build().perform();

		Thread.sleep(15000);

		System.out.println(textbox.getText());
		driver.close();

	}

}
