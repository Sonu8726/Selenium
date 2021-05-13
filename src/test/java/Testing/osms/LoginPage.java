package Testing.osms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\lib\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://127.0.0.1/osms/"); // enter url
		driver.manage().window().maximize();
		System.out.println("Success");
		driver.close();
	}

}
