package objectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {

	WebDriver driver;
	public SignInPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement signIn;
	
	
	public void SignIntoRetool(String uid,String pass) throws InterruptedException {
		username.sendKeys(uid);
		Thread.sleep(6000);
		password.sendKeys(pass);
		Thread.sleep(6000);
		signIn.click();
		Thread.sleep(6000);

	}
	
}
