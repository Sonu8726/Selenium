/**
 * 
 */
package individualPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Ghost
 *
 */
public class WebTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> rowlist = driver.findElements(By.xpath("//table[@name='courses']//tbody/tr"));
		int rowSize = rowlist.size();
		List<WebElement> collist = driver.findElements(By.xpath("//table[@name='courses']//tbody/tr/th"));
		int colSize = collist.size();

		System.out.println(rowSize + " " + colSize);

		for (int i = 1; i <= rowSize; i++) {
			for (int j = 1; j <= colSize; j++) {
				if (i == 1)
					System.out.print(
							driver.findElement(By.xpath("//table[@name='courses']//tbody/tr[" + i + "]/th[" + j + "]"))
									.getText() + "   ");
				else {
					System.out.print(
							driver.findElement(By.xpath("//table[@name='courses']//tbody/tr[" + i + "]/td[" + j + "]"))
									.getText() + "   ");
				}
			}
			System.out.println();
		}
		driver.close();
	}

}
