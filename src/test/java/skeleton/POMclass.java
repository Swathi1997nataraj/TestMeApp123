package skeleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class POMclass {
WebDriver driver;
@Given("user enters the url")
public void user_enters_the_url() {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\a08019dirp_c2x.08.05\\Desktop\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("http://demoaut.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}

@When("user enters the username and password")
public void user_enters_the_username_and_password() {
	
	HomePage.signIn.click();
    HomePage.username.sendKeys("mercury");
    HomePage.password.sendKeys("mercury");
    HomePage.Login.click();

}

@Then("user sign out of the application")
public void user_sign_out_of_the_application() {
   
   System.out.println("successful login");
   driver.close();
}
	
	
	
	
}
