package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;
public class RegistrationPage {
	WebDriver driver;
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using ="//a[@class='login']") 
	public WebElement signin; 

	@FindBy(how = How.ID, using ="email_create") 
	public WebElement email; 

	@FindBy(how = How.CSS, using ="#SubmitCreate > span > i") 
	public WebElement create_account;

	@FindBy(how = How.XPATH, using = "//label[@for ='id_gender1']")
	public WebElement gender;

	@FindBy(how = How.ID, using ="customer_firstname") 
	public WebElement first_name; 

	@FindBy(how = How.ID, using ="customer_lastname") 
	public WebElement last_name; 

	@FindBy(how = How.ID, using ="passwd") 
	public WebElement password; 

	@FindBy(how = How.ID, using ="days") 
	public WebElement day;

	@FindBy(how = How.ID, using ="months") 
	public WebElement month;

	@FindBy(how = How.ID, using ="years") 
	public WebElement year;

	@FindBy(how = How.ID, using ="newsletter") 
	public WebElement newslettercheckbox;

	@FindBy(how = How.ID, using ="optin") 
	public WebElement offercheckbox;

	@FindBy(how = How.ID, using ="company") 
	public WebElement company_name;

	@FindBy(how = How.ID, using ="address1") 
	public WebElement address_line1;

	@FindBy(how = How.ID, using ="address2") 
	public WebElement address_line2;

	@FindBy(how = How.ID, using ="city") 
	public WebElement city_name;

	@FindBy(how = How.ID, using ="id_state") 
	public WebElement state_name;

	@FindBy(how = How.ID, using ="postcode") 
	public WebElement postal_code;

	@FindBy(how = How.ID, using ="id_country") 
	public WebElement country_name;

	@FindBy(how = How.ID, using ="other") 
	public WebElement additional_information;

	@FindBy(how = How.ID, using ="phone") 
	public WebElement home_phone;

	@FindBy(how = How.ID, using ="phone_mobile") 
	public WebElement mobile_phone;

	@FindBy(how = How.XPATH, using ="//span[text()='Register']") 
	public WebElement register; 

	public void clickSignin() throws InterruptedException {
		signin.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}
	public void enterEmail(String mail) {
		email.sendKeys(mail);
	}

	public void clickCreateAccount() throws InterruptedException {
		create_account.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}
	public void selectGender() throws InterruptedException {
		gender.click();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS) ;
	}
	public void enterFirstName(String name) throws InterruptedException {
		first_name.sendKeys(name);
	}
	public void enterLastName(String l_name) throws InterruptedException {
		last_name.sendKeys(l_name);
	}
	public void enterPassword(String pass) throws InterruptedException {
		password.sendKeys(pass);
	}

	public void selectDay(String day_value) throws InterruptedException {
		Select dropdown = new Select(day);
		dropdown.selectByValue(day_value);
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS) ;
	}
	public void selectMonth(String month_value) throws InterruptedException {
		Select option = new Select(month);
		option.selectByValue(month_value);
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS) ;
	}
	public void selectYear(String year_value) throws InterruptedException {
		Select option = new Select(year);
		option.selectByValue(year_value);
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS) ;
	}
	public void clickNewsLetterCheckBox() throws InterruptedException {
		newslettercheckbox.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}
	public void neglectOfferCheckbox() throws InterruptedException {
		offercheckbox.click();
		offercheckbox.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}
	public void enterCompanyName(String c_name) throws InterruptedException {
		company_name.sendKeys(c_name);
	}

	public void enterAddressLine1(String add1) throws InterruptedException {
		address_line1.sendKeys(add1);
	}
	public void enterAddressLine2(String add2) throws InterruptedException {
		address_line2.sendKeys(add2);
	}
	public void enterCityName(String c_name) throws InterruptedException {
		city_name.sendKeys(c_name);
	}
	public void selectState(String state_value) throws InterruptedException {
		Select option = new Select(state_name);
		option.selectByVisibleText(state_value);
	}
	public void enterPostalCode(String p_code) throws InterruptedException {
		postal_code.sendKeys(p_code);
	}
	public void selectCountry(String country_value) throws InterruptedException {
		Select option = new Select(country_name);
		option.selectByValue(country_value);
	}
	public void mentionAdditionalInformation(String info) throws InterruptedException {
		additional_information.sendKeys(info);
	}
	public void enterHomeNo(String h_no) throws InterruptedException {
		home_phone.sendKeys(h_no);
	}
	public void enterMobileNo(String m_no) throws InterruptedException {
		mobile_phone.sendKeys(m_no);
	}
	public void clickRegister() throws InterruptedException {
		register.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}
}
