package com.glue;

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
		// Initialize the WebDriver
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\stepe\\Documents\\qTest Scenario\\JAR files for BDD\\chromedriver.exe");
		// Launch browser
				driver = new ChromeDriver();
	}
	
	@After
	public void teardown() {
		driver.quit();
	}

	@Given("the user is on the login page")
	public void user_on_login_page() {
		System.out.println("Step 1: User is on the login page");

		// Navigate to the login page
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
	}
	
	@When ("the user enters valid credentials")
	public void user_enters_valid_credentials() {
		System.out.println("Step 2: User enters valid credentials");
		driver.findElement(By.id("MainContent_txtUserName")).sendKeys("tim@testemail.com");
		driver.findElement(By.id("MainContent_txtPassword")).sendKeys("trpass");
		driver.findElement(By.id("MainContent_btnLogin")).click();
	}
	
	@Then ("the user should be able to view account balance")
	public void user_should_see_account_balance() {
		System.out.println("Step3: User sees account balance");
		String bodyText = driver.findElement(By.xpath("html/body")).getText();
		String welcomeMessage = "Logged in successfully";
		Assert.assertTrue(bodyText.contains(welcomeMessage));
	//	String expected = "Balance";
	//	String actual = "No balance";
	//	Assert.assertEquals(expected, actual);
		
	}
	
	@When("the user enters bad credentials")
	public void user_enters_bad_credentials() {
		System.out.println("Step 2: User enters bad credentials");
		driver.findElement(By.id("MainContent_txtUserName")).sendKeys("tim@testemail.com");
		driver.findElement(By.id("MainContent_txtPassword")).sendKeys("badpassword");
		driver.findElement(By.id("MainContent_btnLogin")).click();
	}
	
	@Then("the user should not be able to login")
	public void user_should_not_login() {
		System.out.println("Step3: User sees account balance");
		String bodyText = driver.findElement(By.xpath("html/body")).getText();
		String welcomeMessage = "Logged in successfully";
		Assert.assertTrue(!bodyText.contains(welcomeMessage));
	}
	
	@When("^the user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) {
		driver.findElement(By.id("MainContent_txtUserName")).sendKeys(username);
		driver.findElement(By.id("MainContent_txtPassword")).sendKeys(password);
	
		
	}
}
