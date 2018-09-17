package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	// Use Cucumber to bind the Feature File steps to Java code
	// Glue code - step definitions - step implementation
	WebDriver driver;
	
	@Before
	public void setup() {
		// Initiate the WebDriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\steph\\eclipse-workspace\\JARs\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After
	public void tearDown() {
		driver.quit();
		
	}
	
	// Given the user is on the login page
	@Given("the user is on the login page")
	public void user_on_login_page() {
		System.out.println("Step 1: User is on the login page");
		
		
		// Navigatee to login page
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
	}
	@When ("the user enters valid credentials")
	public void user_enters_valid_credentials() {
		System.out.println("Step 2: User enters valid credentials");
		driver.findElement(By.id("MainContent_txtUserName")).sendKeys("tim@testemail.com");
		driver.findElement(By.id("MainContent_txtPassword")).sendKeys("trpass");
		driver.findElement(By.id("MainContent_btnLogin")).click();
	}
	
	@Then ("the user should be able to view their account balance")
	public void user_should_see_account_balance() {
		System.out.println("Step 3: User sees account balance");
		String bodyText = driver.findElement(By.xpath("html/body")).getText();
		String welcomeMessage = "Logged in successfully";
		Assert.assertTrue(bodyText.contains(welcomeMessage));
		
	}

}