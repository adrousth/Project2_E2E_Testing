package com.revature.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AddRequestSteps {
    @And("I click on the add request button")
    public void iClickOnTheAddRequestButton() {
    }

    @And("I enter a initial date of {string}")
    public void iEnterAInitialDateOfInitialDate(String intial_date) {
    }

    @And("I enter a expiration date of {string}")
    public void iEnterAExpirationDateOfExpirationDate(String expiration_date) {
    }

    @And("I enter a value of {int}")
    public void iEnterAValueOfValue(int value) {
    }

    @And("I choose a type of {string}")
    public void iChooseATypeOfType(String type) {
    }

    @And("I click submit")
    public void iClickSubmit() {
    }

    @Then("I should be redirected to the user page with the new request added")
    public void iShouldBeRedirectedToTheUserPageWithTheNewRequestAdded() {
    }
}
