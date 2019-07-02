package skeleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class TestMe1 {
	WebDriver driver;
	String expected="Find a Flight: Mercury Tours:";
	@Given("user logs in the required url")
	public void user_logs_in_the_required_url() {
	    // Write code here that turns the phrase above into concrete actions
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\a08019dirp_c2x.08.05\\Desktop\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://demoaut.com/");
	    driver.manage().window().maximize();
	    }

	@When("user enters the required credentials")
	public void user_enters_the_required_credentials() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    }
@Then("user logs out of the application")
	public void user_logs_out_of_the_application() {
		 // Write code here that turns the phrase above into concrete actions
Assert.assertEquals(expected, driver.getTitle());
driver.close();
}
}
