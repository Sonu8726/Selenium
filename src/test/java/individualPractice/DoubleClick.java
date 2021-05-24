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
public class DoubleClick {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		driver.manage().window().maximize();
		// Right Click aka ContextClick
		driver.get("https://api.jquery.com/dblclick/");
		driver.switchTo().frame(0);
		WebElement dblClick = driver.findElement(By.xpath("//span[text()='Double click the block']//parent::body/div"));
		act.doubleClick(dblClick).build().perform();
		Thread.sleep(5000);
		driver.close();
		System.out.println("Success");
	}

}
