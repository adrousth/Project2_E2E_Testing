package com.revature.steps;

import com.revature.pages.LoginPage;
import com.revature.pages.ManagerPage;
import com.revature.runner.TestRunner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.annotations.Test;

public class UpdateRequestSteps {

    public LoginPage loginPage;
    public ManagerPage managerPage;

    @And("I click on a dropdown for a request's status")
    @Test(dependsOnGroups = "login")
    public void iClickOnADropdownForARequestSStatus(String statusOption) {
        managerPage = new ManagerPage(TestRunner.driver);
        //managerPage.selectWarrantyStatus(statusOption);
    }

    @And("I select a status of {string} for {int}")
    public void iSelectAStatusOfStatus(String status) {
    }

    @And("I click on the update status button")
    public void iClickOnTheUpdateStatusButton() {
    }

    @Then("I should receive an updated table with the updated status")
    public void iShouldReceiveAnUpdatedTableWithTheUpdatedStatus() {
    }
}
