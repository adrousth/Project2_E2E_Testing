package com.revature.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("I am at the login page")
    public void iAmAtTheLoginPage() {

    }

    @When("I type in a username of {string}")
    public void iTypeInAUsernameOfUsername(String username) {

    }

    @And("I type in a password of {string}")
    public void iTypeInAPasswordOfPassword(String password) {

    }

    @And("I click the login button")
    public void iClickTheLoginButton() {
    }

    @Then("I should be redirected to the user page")
    public void iShouldBeRedirectedToTheUserPage() {
    }

    @Then("I should receive an alert with an error message")
    public void iShouldReceiveAnAlertWithAnErrorMessage() {
    }
}
