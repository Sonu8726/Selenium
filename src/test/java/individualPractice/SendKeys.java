/**
 * 
 */
package individualPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Ghost /enter values in input box
 *
 */
public class SendKeys {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://technicalhindi.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"search-2\"]/form/label/input")).sendKeys("Normal");
		driver.findElement(By.xpath("//button[@class='search-submit']")).click();
		Thread.sleep(10000);
		System.out.println(driver.getTitle());

		driver.close();
	}

}
