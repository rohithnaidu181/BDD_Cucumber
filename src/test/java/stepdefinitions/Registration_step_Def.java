package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration_step_Def {
	ChromeDriver chromeDriver = new ChromeDriver();

	@Given("I am on the registration page of the online shopping portal")
	public void i_am_on_the_registration_page_of_the_online_shopping_portal() {

		chromeDriver.get("https://your-shopping-portal.com/login"); 
}

	@When("I enter valid registration details")
	public void i_enter_valid_registration_details() {


		WebElement usernameField = chromeDriver.findElement(By.id("username")); 
		WebElement passwordField = chromeDriver.findElement(By.id("password")); 
		WebElement signInButton = chromeDriver.findElement(By.id("signin-button")); 


		String username = "email";
		String password = "password";

		usernameField.sendKeys(username);
		passwordField.sendKeys(password);


	}

	@When("I click the {string} button")
	public void i_click_the_button(String string) {

	}

	@Then("I should be registered successfully")
	public void i_should_be_registered_successfully() {

	}

	@When("I enter an email address that is already registered")
	public void i_enter_an_email_address_that_is_already_registered() {

	}

	@Then("I should see an error message indicating the email is already registered")
	public void i_should_see_an_error_message_indicating_the_email_is_already_registered() {

	}

	@When("I enter invalid registration details")
	public void i_enter_invalid_registration_details() {

	}

	@Then("I should see validation error messages")
	public void i_should_see_validation_error_messages() {

	}

	@When("I enter valid registration details with mismatched passwords")
	public void i_enter_valid_registration_details_with_mismatched_passwords() {

	}

	@Then("I should see an error message indicating password mismatch")
	public void i_should_see_an_error_message_indicating_password_mismatch() {

	}

	@When("I do not agree to the terms and conditions")
	public void i_do_not_agree_to_the_terms_and_conditions() {

	}

	@Then("I should see an error message indicating I need to agree to the terms")
	public void i_should_see_an_error_message_indicating_i_need_to_agree_to_the_terms() {

	}




}
