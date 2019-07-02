package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Ex1stepdef {
	WebDriver driver;
	@Given("user is on the home page")
	public void user_is_on_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Users\\a08019dirp_c2x.08.05\\Desktop\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://demoaut.com/");
	    driver.manage().window().maximize();
	    }
	    
@When("user enter {string} and {string}")
	public void user_enter_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	String a = string;
	String b = string2;
	driver.findElement(By.name("userName")).sendKeys(a);
	driver.findElement(By.name("password")).sendKeys(b);
	driver.findElement(By.name("login")).click();
	driver.navigate().back();
	
	}

	@Then("user does successful login")
	public void user_does_successful_login() {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
	   
	}
	
	

}
