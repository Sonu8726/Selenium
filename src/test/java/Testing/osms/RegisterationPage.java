package Testing.osms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegisterationPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\lib\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://localhost/elms/admin/"); // enter url
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='signin']")).click();

		String Title = driver.getTitle();
		System.out.println(Title);

		System.out.println("Success");
		driver.close();
	}

}
