package com.revature.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminPage {

    private WebDriver driver;
    private WebDriverWait wdw;

    @FindBy(className = "request-table")
    private WebElement requestTable;

    @FindBy(id="add-warranty-btn")
    private WebElement addWarrantyButton;

    @FindBy(id="logout-button")
    private WebElement logoutButton;

    @FindBy(id="welcome")
    private WebElement welcome;

    public AdminPage(WebDriver driver) {
        this.driver = driver;
        this.wdw = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);
    }

    public void clickAddWarrantyButton() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");


        Thread.sleep(1000);
        addWarrantyButton.click();
    }

    public void clickLogoutButton() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");


        Thread.sleep(1000);
        logoutButton.click();
    }

    public String getTableHeader() {
        return requestTable.getText();
    }

    public String getWelcomeMessage() {
        return welcome.getText();
    }

}
