package com.revature.steps;

import com.revature.pages.AddRequestPage;
import com.revature.pages.AdminPage;
import com.revature.runner.TestRunner;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddRequestSteps {

    public AdminPage adminPage;
    public AddRequestPage requestPage;

    @And("I click on the add request button")
    @Test(dependsOnGroups = "login")
    public void iClickOnTheAddRequestButton() throws InterruptedException {
        adminPage = new AdminPage(TestRunner.driver);
        adminPage.clickAddWarrantyButton();
    }

    @And("I enter a initial date of {string}")
    public void iEnterAInitialDateOfInitialDate(String intial_date) {
        requestPage = new AddRequestPage(TestRunner.driver);
        requestPage.inputWarrantyIssueDate(intial_date);
    }

    @And("I enter a expiration date of {string}")
    public void iEnterAExpirationDateOfExpirationDate(String expiration_date) throws InterruptedException {
        requestPage.inputWarrantyExpirationDate(expiration_date);
    }

    @And("I enter a value of {string}")
    public void iEnterAValueOfValue(String value) {
        requestPage.inputWarrantyAmount(value);
    }

    @And("I choose a type of {string}")
    public void iChooseATypeOfType(String type) {
        requestPage.selectWarrantyType(type);
    }

    @And("I click submit")
    public void iClickSubmit() {

        requestPage.clickSubmitButton();
    }

    @Then("I should be redirected to the user page with the new request added")
    public void iShouldBeRedirectedToTheUserPageWithTheNewRequestAdded() {
        WebDriverWait wdw = new WebDriverWait(TestRunner.driver, Duration.ofSeconds(2));
        wdw.until(ExpectedConditions.titleContains("Admin"));
    }

    @Then("I should receive an alert with an invalid parameter message")
    public void iShouldReceiveAnAlertWithAnErrorMessageAlert() {
        WebDriverWait wdw = new WebDriverWait(TestRunner.driver, Duration.ofSeconds(2));
        String errorMessage = wdw.until(ExpectedConditions.alertIsPresent()).getText();
        Assert.assertNotNull(errorMessage);
    }

    @And("I enter a valid value of {string}")
    public void iEnterAValidValueOfValue(String value) {
        requestPage.inputWarrantyAmount(value);
    }
}
