package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyWithdrawcash_step_Def {
	int amount = 100;
	int balance = amount;


	@Given("I have a balance of {int} in my account")
	public void i_have_a_balance_of_in_my_account(Integer int1) {

		if (amount > 0) {

			System.out.println("Deposit of $" + amount + " successful.");
		} else {
			System.out.println("Invalid deposit amount. Amount should be greater than 0.");
		}
	}




	@When("I request {int}")
	public void i_request(Integer int1) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawal of $" + amount + " successful.");
		} else if (amount <= 0) {
			System.out.println("Invalid withdrawal amount. Amount should be greater than 0.");
		} else {
			System.out.println("Insufficient balance for withdrawal.");
		}
	}


@Then("{int} should be dispensed")
public void should_be_dispensed(Integer int1) {
	System.out.println("$20 should be dispensed");

}




}
