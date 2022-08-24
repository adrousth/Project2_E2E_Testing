package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private WebDriver driver;
    private WebDriverWait wdw;

    @FindBy(id="username-input")
    private WebElement usernameInput;

    @FindBy(id="password-input")
    private WebElement passwordInput;

    @FindBy(id="login-button")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wdw = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);
    }

    public void typeUsername(String username) {
        usernameInput.sendKeys(username);
    }

    public void typePassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public String getErrorAlert() {
        wdw.until(ExpectedConditions.alertIsPresent());
        return driver.switchTo().alert().getText();
    }
}
