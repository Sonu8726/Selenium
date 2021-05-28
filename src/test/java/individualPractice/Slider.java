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
public class Slider {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.manage().window().maximize();
		js.executeScript("window.scrollBy(0,400)");

		WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frameElement);

		WebElement redSlider = driver.findElement(By.xpath("//*[@id='red']/span"));
		WebElement greenSlider = driver.findElement(By.xpath("//*[@id='green']/span"));
		WebElement blueSlider = driver.findElement(By.xpath("//*[@id='blue']/span"));

		Actions actn = new Actions(driver);
		actn.dragAndDropBy(blueSlider, -100, 125).perform();
		actn.dragAndDropBy(redSlider, 30, 125).perform();
		actn.dragAndDropBy(greenSlider, 70, 125).perform();
		Thread.sleep(3000);
		System.out.println("slider complete");
		driver.close();
	}

}
