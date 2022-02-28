package tests;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegistrationPage;
import java.util.concurrent.TimeUnit;
public class RegistrationTest extends PBaseTest {
	public final static Logger logger = Logger.getLogger(RegistrationTest.class);
	@Test
	public void registration() throws InterruptedException{    //positive test case
		RegistrationPage re = new RegistrationPage(driver);
		re.clickSignin();
		re.enterEmail(prop.getProperty("new_email"));
		re.clickCreateAccount();
		re.selectGender();
		re.enterFirstName(prop.getProperty("firstname_value"));
		re.enterLastName(prop.getProperty("lastname_value"));
		re.enterPassword(prop.getProperty("password_value"));
		re.selectDay(prop.getProperty("day_value"));
		re.selectMonth(prop.getProperty("month_value"));
		re.selectYear(prop.getProperty("year_value"));
		re.clickNewsLetterCheckBox();
		re.neglectOfferCheckbox();
		re.enterCompanyName(prop.getProperty("companyname"));
		re.enterAddressLine1(prop.getProperty("addressline1"));
		re.enterAddressLine2(prop.getProperty("addressline2"));
		re.enterCityName(prop.getProperty("cityname"));
		re.selectState(prop.getProperty("state_value"));
		re.enterPostalCode(prop.getProperty("postalcode"));
		re.selectCountry(prop.getProperty("country_value"));
		re.mentionAdditionalInformation(prop.getProperty("additionalinformation"));
		re.enterHomeNo(prop.getProperty("homeno"));
		re.enterMobileNo(prop.getProperty("mobileno"));
		re.clickRegister();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		Assert.assertTrue(driver.getTitle().contains(prop.getProperty("title_text")));
		logger.info(prop.getProperty("loggermessage2"));
	}

}
