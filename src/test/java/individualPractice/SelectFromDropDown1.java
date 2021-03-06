/**
 * 
 */
package individualPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Ghost // select a value from dropdown method 1
 *
 */
public class SelectFromDropDown1 {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		driver.get("https://rahulshettyacademy.com/angularpractice/");
//		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		WebElement dd = driver.findElement(By.id("dropdown-class-example"));
		Select d1 = new Select(dd);
		d1.selectByVisibleText("Option2");

		List<WebElement> optionList = d1.getOptions();
		int optionCount = optionList.size();
		System.out.println("All present Option:" + optionList);
		System.out.println("Available Options:" + optionCount);

		for (WebElement ele : optionList) {
			String option = ele.getText();
			System.out.println("Option  ->  " + option);
		}
		WebElement selectedOption = d1.getFirstSelectedOption();
		System.out.println("Selected Option: " + selectedOption.getText());

		Thread.sleep(15000);
		System.out.println("Selected is completed");
		driver.close();
	}

}
