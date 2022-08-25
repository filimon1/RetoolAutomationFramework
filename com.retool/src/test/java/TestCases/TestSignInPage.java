package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import basePage.Base;
import objectPages.SignInPage;

public class TestSignInPage {

	
	WebDriver driver;
	
	@Test
	public void testSignInRetool() throws InterruptedException {
		
		driver=Base.selectBrowserAndUrl("chrome", "https://login.retool.com/auth/login");
				
		SignInPage signInObj=PageFactory.initElements(driver,SignInPage.class);
		signInObj.SignIntoRetool("support@jebena.app","#Jebenatool2020");
		String expectTitle=driver.getTitle();
		Thread.sleep(3000);
		Assert.assertEquals(expectTitle,"Apps | Retool");
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
