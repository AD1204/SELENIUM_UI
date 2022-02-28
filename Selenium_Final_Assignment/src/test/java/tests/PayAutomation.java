//package tests;
//
//public class PayAutomation {
//
//	private void CreditCard() throws InterruptedException, AWTException {
//		String url = "https://rentaride-customer.test.odm.bmw-fleet.net/en/bookings/RAR-2B37GENR?securityCode=6d19c157-feba-4dac-a7d4-3259b39d0501&paymentStatus=OPEN"
//		//System.setProperty("webdriver.chrome.driver","./Driver/Chrome/chromedriver.exe");
//
//		 WebDriverManager.chromedriver().setup();
//
//		 WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		Robot robot = new Robot();
//
//		 Thread.sleep(5000);
//		System.out.println("About to zoom out");
//		for (int i = 0; i < 8; i++)
//		{
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_SUBTRACT);
//		robot.keyRelease(KeyEvent.VK_SUBTRACT);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		}
//
//		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.get(url);
//		Thread.sleep(3000);
//
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,750)");
//		Thread.sleep(3000);
//
//		 int size = driver.findElements(By.tagName("iframe")).size();
//
//		 System.out.println("Iframe " + size);
//
//		 driver.switchTo().frame(0);
//
//		 WebElement Creditcard= driver.findElement(By.xpath("//*[@id='encryptedCardNumber']"));
//		Creditcard.click();
//		Creditcard.sendKeys("5454545454545454");
//		Thread.sleep(5000);
//
//		 js.executeScript("window.scrollBy(0,1000)");
//
//		 WebElement expDate= driver.findElement(By.xpath("//*[@id='encryptedExpiryDate']"));
//		expDate.click();
//		expDate.sendKeys("03/30");
//		Thread.sleep(3000);
//
//		 js.executeScript("window.scrollBy(0,950)");
//
//		 WebElement Cvv= driver.findElement(By.xpath("//*[@id='encryptedSecurityCode']"));
//		Cvv.click();
//		Cvv.sendKeys("737");
//		js.executeScript("window.scrollBy(0,900)");
//		WebElement userName= driver.findElement(By.xpath("//*[@placeholder='J. Smith']"));
//		userName.click();
//		userName.sendKeys("user");
//
//		js.executeScript("window.scrollBy(0,1000)");
//		WebElement PayNowButton= driver.findElement(By.xpath("//*[@type='button']"));
//
//		 js.executeScript("arguments[0].scrollIntoView();", PayNowButton);
//
//		 Actions act = new Actions(driver);
//		act.moveToElement(PayNowButton).click().build().perform();
//
//		}
//}
