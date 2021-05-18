/**
 * 
 */
package individualPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Ghost
 *
 */
public class AlertNormal {

	/**
	 * @param args
	 * @throws InterruptedException
	 */

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys("Ansh");
		driver.findElement(By.id("alertbtn")).click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println("Alert Text is " + alertText);
		alert.dismiss();
		Thread.sleep(1500);

		System.out.println("Everything looks goods");
		driver.quit();
	}

}
