package pages;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
public class WomenPage {
WebDriver driver;
public WomenPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

    @FindBy(how = How.XPATH, using ="//a[@title='Women']") 
	public WebElement women_icon; 

	@FindBy(how = How.XPATH, using ="//a[@title='T-shirts']") 
	public WebElement t_shirt_item; 

	@FindBy(how = How.LINK_TEXT, using ="Faded Short Sleeve T-shirts") 
	public WebElement item_name; 

	@FindBy(how = How.NAME, using ="search_query") 
	public WebElement search_bar;

	@FindBy(how = How.NAME, using ="submit_search") 
	public WebElement search_button;

    public void selectSubItem() throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.moveToElement(women_icon).moveToElement(t_shirt_item).click().build().perform();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
	}
    
	public void searchAndClick() throws InterruptedException{
		search_bar.sendKeys(item_name.getText());
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		search_button.click();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
	}	

}
