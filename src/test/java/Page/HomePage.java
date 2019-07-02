package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
 @FindBy(linkText="signIn")
public static WebElement signIn;
 
 @FindBy(name="username")
public static WebElement username; 
 
 @FindBy(name="password")
public static WebElement password; 
 
 @FindBy(name="Login")
public static WebElement Login;

}
