/**
 * 
 */
package individualPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author Ghost
 *
 */
public class DragAndDrop {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.get("https://jqueryui.com/droppable");
		driver.manage().window().maximize();
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(5000);
		WebElement frameElement = driver.findElement(By.xpath("//*[@id='content']/iframe"));
//		driver.switchTo().frame(0);
		driver.switchTo().frame(frameElement);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));

		Actions actn = new Actions(driver);
		actn.dragAndDrop(drag, drop).perform();
		Thread.sleep(3000);
		System.out.println("Drag and drop completed ");
		driver.close();
	}

}
