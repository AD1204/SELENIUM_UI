package tests;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import java.util.concurrent.TimeUnit;
public class LoginTest extends PBaseTest{
	public final static Logger logger = Logger.getLogger(LoginTest.class);

	@Test(priority=1)
	public void validLogin() throws InterruptedException{  //positive test case
		LoginPage li = new LoginPage(driver);
		li.clickSignin();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		li.enterRegisteredEmail(prop.getProperty("registered_email_value"));
		li.enterPassword(prop.getProperty("password_value"));
		li.clickSigninButton();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Assert.assertTrue(driver.getTitle().contains(prop.getProperty("title_text")));
		logger.info(prop.getProperty("loggermessage3"));
	
		 
	}

	@Test(priority=2)
	public void invalidLogin() throws InterruptedException{  //negative test case
		LoginPage in = new LoginPage(driver);
		in.clickSignin();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		in.enterRegisteredEmail(prop.getProperty("registered_email_value"));
		in.enterPassword(prop.getProperty("password_value"));
		in.clickSigninButton();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		logger.info(prop.getProperty("loggermessage4"));
		Assert.assertTrue(driver.getTitle().contains(prop.getProperty("invalid_title_text")));
	}
}
