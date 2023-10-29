package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Sign_in_out_Def {
	@Given("I am on the login page of the online shopping portal")
	public void i_am_on_the_login_page_of_the_online_shopping_portal() {
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://your-shopping-portal.com/login"); // Replace with the actual URL

		// Find and fill in the login credentials
        WebElement usernameField = chromeDriver.findElement(By.id("username")); // Replace with the actual element locator
        WebElement passwordField = chromeDriver.findElement(By.id("password")); // Replace with the actual element locator
        WebElement signInButton = chromeDriver.findElement(By.id("signin-button")); // Replace with the actual element locator

        // Replace these with your actual login credentials
        String username = "email";
        String password = "password";

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);

        // Click the "Sign In" button
        signInButton.click();
        
	}

	@Given("I have a registered account")
	public void i_have_a_registered_account() {
	    
	}

	@When("I enter valid login credentials")
	public void i_enter_valid_login_credentials() {
	   
	}

	@Then("I should be signed in successfully")
	public void i_should_be_signed_in_successfully() {
	   
	}

	@When("I enter invalid login credentials")
	public void i_enter_invalid_login_credentials() {
	    
	}

	@Then("I should see an error message indicating invalid credentials")
	public void i_should_see_an_error_message_indicating_invalid_credentials() {
	   
	}

	@When("I am signed in")
	public void i_am_signed_in() {
	   
	}

	@Then("I should be signed out successfully")
	public void i_should_be_signed_out_successfully() {
	   
	}

	@When("I am not signed in")
	public void i_am_not_signed_in() {
	   
	}

	@When("I try to access my account")
	public void i_try_to_access_my_account() {
	    
	}

	@Then("I should be prompted to sign in")
	public void i_should_be_prompted_to_sign_in() {
	    
	}


}
