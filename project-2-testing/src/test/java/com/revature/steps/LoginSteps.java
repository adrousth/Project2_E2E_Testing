package com.revature.steps;

import com.revature.pages.LoginPage;
import com.revature.runner.TestRunner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginSteps {

    public LoginPage loginPage;
    public String url = "http://127.0.0.1:5500";
    @Given("I am at the login page")
    @Test(groups = "login")
    public void iAmAtTheLoginPage() {
        TestRunner.driver.get(url);
        loginPage = new LoginPage(TestRunner.driver);
    }

    @When("I type in a username of {string}")
    @Test(groups = "login")
    public void iTypeInAUsernameOfUsername(String username) {
        loginPage.typeUsername(username);
    }

    @And("I type in a password of {string}")
    @Test(groups = "login")
    public void iTypeInAPasswordOfPassword(String password) {
        loginPage.typePassword(password);
    }

    @And("I click the manager login button")
    @Test(groups = "login")
    public void iClickTheManagerLoginButton() throws InterruptedException{
        loginPage.clickLoginButton();
        // Thread.sleep(2000);
    }

    @Then("I should be redirected to the admin page")
    public void iShouldBeRedirectedToTheAdminPage() {
        WebDriverWait wdw = new WebDriverWait(TestRunner.driver, Duration.ofSeconds(2));
        wdw.until(ExpectedConditions.titleContains("Admin"));
    }

    @Then("I should receive an alert with an {string} error message")
    public void iShouldReceiveAnAlertWithAnErrorMessage(String arg0) {
        WebDriverWait wdw = new WebDriverWait(TestRunner.driver, Duration.ofSeconds(2));
        String errorMessage = wdw.until(ExpectedConditions.alertIsPresent()).getText();
        Assert.assertEquals(errorMessage, "Invalid username and/or password");
    }

    @Then("I should be redirected to the manager page")
    public void iShouldBeRedirectedToTheManagerPage() {
        WebDriverWait wdw = new WebDriverWait(TestRunner.driver, Duration.ofSeconds(2));
        wdw.until(ExpectedConditions.titleContains("Manager"));
    }

    @And("I click the admin login button")
    @Test(groups="login")
    public void iClickTheAdminLoginButton() {
        loginPage.clickLoginButton();
    }

    @And("I click the login button")
    public void iClickTheLoginButton() {
        loginPage.clickLoginButton();
    }
}
