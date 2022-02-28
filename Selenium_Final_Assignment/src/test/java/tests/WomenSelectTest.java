package tests;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WomenPage;
import java.util.concurrent.TimeUnit;
public class WomenSelectTest extends PBaseTest {    //positive test case
	public final static Logger logger = Logger.getLogger(WomenSelectTest.class);
	@Test(priority=1)
	public void validateSameProduct() throws InterruptedException {
		WomenPage obj = new WomenPage(driver);
		obj.selectSubItem();
		obj.searchAndClick();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		String actual_text  = obj.item_name.getText().trim();
		String expected_text = prop.getProperty("valid_expectedtext");
		Assert.assertEquals(actual_text, expected_text);
		logger.info(prop.getProperty("loggermessage5"));
	}
	
	@Test(priority=2)
	public void validateDifferentProduct() throws InterruptedException{   //negative test case
		WomenPage obj = new WomenPage(driver);
		obj.selectSubItem();
		obj.searchAndClick();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		String actual_text  = obj.item_name.getText().trim();
		String expected_text = prop.getProperty("invalid_expectedtext");
		logger.info(prop.getProperty("loggermessage6"));
		Assert.assertEquals(actual_text, expected_text);
	}

}
