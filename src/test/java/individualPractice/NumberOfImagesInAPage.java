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
public class NumberOfImagesInAPage {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Radio button");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		int numberOfImage = driver.findElements(By.tagName("img")).size();
		System.out.println("Number of Images:" + numberOfImage);
		Thread.sleep(15000);
		driver.close();
	}

}
