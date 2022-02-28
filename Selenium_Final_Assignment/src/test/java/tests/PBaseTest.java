package tests;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PBaseTest {
public static WebDriver driver;
static File file = new File("./Resources/propertiesFile/configuration.properties");
static FileInputStream fi = null;
static Properties prop = new Properties();
static {
	try {
		fi = new FileInputStream(file);

	} catch (FileNotFoundException e) {
		e.printStackTrace();

	}
	try {
		prop.load(fi);
	} catch (IOException el) {
		el.printStackTrace();

	}
}
public final static Logger logger = Logger.getLogger(RegistrationTest.class);
	@BeforeMethod
	public static void intializeDriver() {
		System.setProperty("webdriver.chrome.driver",prop.getProperty("driverPath"));
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public static void openBrowser() {

		driver.get(prop.getProperty("url_new"));
		driver.manage().window().maximize();
		logger.info(prop.getProperty("loggermessage1"));
	}
	@AfterMethod
	public static void closeBrowser() {
		//driver.quit();
	}
}
