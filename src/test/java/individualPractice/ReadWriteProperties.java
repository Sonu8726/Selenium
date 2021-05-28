/**
 * 
 */
package individualPractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Ghost
 *
 */
public class ReadWriteProperties {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		FileInputStream input = new FileInputStream(
				System.getProperty("user.dir") + "\\resources\\testdata.properties");
		prop.load(input);

		System.out.println(prop.getProperty("tester"));
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));

		FileOutputStream output = new FileOutputStream(
				System.getProperty("user.dir") + "\\resources\\testdata.properties");
		prop.setProperty("username", "Alex");
		prop.store(output, "Updating the properties file");

		System.out.println(prop.getProperty("username"));
	}

}
