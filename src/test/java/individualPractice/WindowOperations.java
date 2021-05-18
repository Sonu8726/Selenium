/**
 * 
 */
package individualPractice;

import java.util.ArrayList;
import java.util.Set;

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
public class WindowOperations {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public void WindowOperation() throws InterruptedException {
		System.out.println("Window operation Select");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("openwindow")).click();

		Set<String> allWindows = driver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList<String>(allWindows);
		for (String S : allWindows) {
			System.out.println("Window " + S);
			Thread.sleep(2000);
		}
		driver.switchTo().window(tabs.get(1));

//		String text = driver.findElement(By.xpath(
//				"//a[@href='https://courses.rahulshettyacademy.com/sign_up' and @class='btn btn-theme btn-sm btn-min-block']"))
//				.getText();
		String text = driver.getTitle();
		System.out.println("Join Button text = " + text);

		driver.switchTo().window(tabs.get(0));

		WebElement textbox = driver.findElement(By.id("autocomplete"));
		Actions builder = new Actions(driver);
		textbox.sendKeys("India");
		builder.sendKeys(Keys.ARROW_DOWN).click().build().perform();
		builder.sendKeys(Keys.ARROW_DOWN).click().build().perform();
		builder.sendKeys(Keys.ENTER).click().build().perform();

		System.out.println(textbox.getText());
		System.out.println("Program Completed");
		driver.quit();
	}

	public void tabOperation() throws InterruptedException {
		System.out.println("Tab operation Select");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("opentab")).click();

		Set<String> allWindows = driver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList<String>(allWindows);
		for (String S : allWindows) {
			System.out.println("Window " + S);
			Thread.sleep(2000);
		}
		driver.switchTo().window(tabs.get(1));

//		String text = driver.findElement(By.xpath(
//				"//a[@href='https://courses.rahulshettyacademy.com/sign_up' and @class='btn btn-theme btn-sm btn-min-block']"))
//				.getText();
		String text = driver.getTitle();
		System.out.println("Join Button text = " + text);

		driver.switchTo().window(tabs.get(0));

		WebElement textbox = driver.findElement(By.id("autocomplete"));
		Actions builder = new Actions(driver);
		textbox.sendKeys("India");
		builder.sendKeys(Keys.ARROW_DOWN).click().build().perform();
		builder.sendKeys(Keys.ARROW_DOWN).click().build().perform();
		builder.sendKeys(Keys.ENTER).click().build().perform();

		System.out.println(textbox.getText());
		System.out.println("Program Completed");
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WindowOperations wo = new WindowOperations();
		wo.WindowOperation();
	}

}
