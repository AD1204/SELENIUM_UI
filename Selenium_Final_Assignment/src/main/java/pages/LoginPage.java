package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;
public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	@FindBy(how = How.XPATH, using ="//a[@class='login']") 
	public WebElement signin; 

	@FindBy(how = How.ID, using ="email") 
	public WebElement registered_email;

	@FindBy(how = How.ID, using ="passwd") 
	public WebElement password;

	@FindBy(how = How.XPATH, using ="//*[@id=\"SubmitLogin\"]/span/i") 
	public WebElement signin_button; 

	public void clickSignin() throws InterruptedException {
		signin.click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	public void enterRegisteredEmail(String mail) throws InterruptedException {
		registered_email.sendKeys(mail);
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	}
	public void enterPassword(String pass) throws InterruptedException {
		password.sendKeys(pass);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	public void clickSigninButton() throws InterruptedException {
		signin_button.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
}
