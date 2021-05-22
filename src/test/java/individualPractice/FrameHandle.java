/**
 * 
 */
package individualPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Ghost
 *
 */
public class FrameHandle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement frameId = driver.findElement(By.id("courses-iframe"));
		driver.switchTo().frame(frameId);

		System.out.println("Moving to frame");
		WebElement crsText = driver.findElement(
				By.xpath("//a[@href='https://courses.rahulshettyacademy.com/courses'][normalize-space()='Courses']"));
		System.out.println(crsText.getText());
		driver.switchTo().defaultContent();
		WebElement btnText = driver.findElement(By.xpath("//button[text()='Practice']"));
		System.out.println(btnText.getText());

		driver.findElement(By.xpath("//a[contains(text(),'Free Access to InterviewQues/ResumeAssistance/Mate')]"))
				.click();
		System.out.println(driver.getTitle());
		driver.close();
	}

}
