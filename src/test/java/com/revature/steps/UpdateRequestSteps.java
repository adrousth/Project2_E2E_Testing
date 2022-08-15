package com.revature.steps;

import com.revature.pages.LoginPage;
import com.revature.pages.ManagerPage;
import com.revature.runner.TestRunner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;
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

    @And("I select a status of {string} for {string}")
    @Test(dependsOnGroups = "login")
    public void iSelectAStatusOfStatus(String status, String wid) throws InterruptedException {

        managerPage = new ManagerPage(TestRunner.driver);
        managerPage.selectWarrantyStatus(status, wid);

    }

    @And("I click on the update status button")
    public void iClickOnTheUpdateStatusButton() throws InterruptedException {
        // Thread.sleep(5000);
        managerPage.clickUpdateWarrantyButton();
    }

    @Then("I should receive an updated table with the updated status of {string}")
    public void iShouldReceiveAnUpdatedTableWithTheUpdatedStatus(String status) throws InterruptedException {

        Thread.sleep(2000);
        Assert.assertEquals(managerPage.getLastTableRow().getText(), status);
    }
}
