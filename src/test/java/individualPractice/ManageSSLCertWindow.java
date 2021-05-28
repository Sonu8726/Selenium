/**
 * 
 */
package individualPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * @author Ghost
 *
 */
public class ManageSSLCertWindow {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\lib\\chromedriver.exe");
		DesiredCapabilities dc = new DesiredCapabilities();
//		dc.acceptInsecureCerts();
//		dc.setAcceptInsecureCerts(true);
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

		ChromeOptions chOptions = new ChromeOptions();
		chOptions.merge(dc);
		WebDriver driver = new ChromeDriver(chOptions);

		driver.get("http://expired.badssl.com");
		Thread.sleep(5000);
		System.out.println("BADSSL completed AKA desiredCapabilities");
		driver.close();
	}

}
