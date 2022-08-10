package com.revature.steps;

import com.revature.pages.AdminPage;
import com.revature.pages.LoginPage;
import com.revature.pages.ManagerPage;
import com.revature.runner.TestRunner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.revature.runner.TestRunner.driver;

public class LogoutSteps {

    public AdminPage adminPage;
    public ManagerPage managerPage;
    public String url = "http://127.0.0.1:5500";

    public LoginPage loginPage;

    @When("I am at an Admin page")
    @Test(dependsOnGroups = "login")
    public void thatIAmAtAnAdminPage() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(2));
        wdw.until(ExpectedConditions.titleContains("Admin"));
        System.out.println("I am at the Admin Page");
    }

    @When("I click the admin logout button")
    public void iClickTheAdminLogoutButton() {
        adminPage = new AdminPage(TestRunner.driver);
        adminPage.clickLogoutButton();
    }

    @Then("I am redirected to the login page")
    public void iAmRedirectedToTheLoginPage() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(5));
        wdw.until(ExpectedConditions.urlContains(url));
    }

    @When("I am at a Manager page")
    public void thatIAmAtAManagerPage() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(2));
        wdw.until(ExpectedConditions.titleContains("Manager"));
    }

    @And("I click on the manager logout button")
    public void iClickOnTheManagerLogoutButton() {
        managerPage = new ManagerPage(TestRunner.driver);
        managerPage.clickLogoutButton();
    }
}
