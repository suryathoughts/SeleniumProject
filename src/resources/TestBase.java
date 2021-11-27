package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public WebDriver driver;
	public Properties prop;

	public WebDriver intializeDriver() throws IOException {
		prop = new Properties();
		FileInputStream fls = new FileInputStream(
				"C:\\Users\\om\\eclipse-workspaceNew\\MyProjectGitHub\\src\\data.properties");

		prop.load(fls);
		String browserName = prop.getProperty("browser").trim();

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browserName.equals("firefox")) { // u can write system properties here
													// driver = new FirefoxDriver();
		} else if (browserName.equals("IE")) {
			//
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

}
