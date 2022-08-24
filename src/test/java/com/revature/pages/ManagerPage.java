package com.revature.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class ManagerPage {

    private WebDriver driver;
    private WebDriverWait wdw;

    @FindBy(className = "request-table")
    private WebElement requestTable;

    @FindBy(id="logout-button")
    private WebElement logoutButton;

    @FindBy(id="update-warranty-btn")
    private WebElement updateWarrantyButton;

    @FindBy(id="welcome")
    private WebElement welcome;

    @FindBy(name = "status")
    private List<Select> statusOption;

    @FindBy(xpath = "(//tbody[1])/tr[last()]/td[7]")
    private WebElement lastRowStatus;

    // @FindBy(id=)

    public ManagerPage(WebDriver driver) {
        this.driver = driver;
        this.wdw = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);
    }

    public void clickLogoutButton() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");


        Thread.sleep(1000);
        logoutButton.click();
    }

    public void clickUpdateWarrantyButton() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");


        Thread.sleep(1000);
        wdw.until(ExpectedConditions.visibilityOf(updateWarrantyButton));

        updateWarrantyButton.click();
    }

    public String getTableHeader() {
        return requestTable.getText();
    }

    public String getWelcomeMessage() {
        return welcome.getText();
    }

    public void selectWarrantyStatus(String status, String id) {
        wdw.until(ExpectedConditions.visibilityOfElementLocated(By.name("status")));
        Select dropDown = new Select(driver.findElement(By.id(id)));
        dropDown.selectByVisibleText(status);



        //List<WebElement> options = driver.findElements(By.name("status"));
//        for (Map.Entry<String, String> option: statusOption.entrySet()) {
//            Select warrantyID = new Select(driver.findElement(By.id(option.getKey())));
//            warrantyID.selectByValue(option.getValue());

            /*
            Select dropDown = new Select(driver.findElement(By.id("device-select")));

        dropDown.selectByValue("MRI");

             */
        //}
    }

    public WebElement getLastTableRow() throws InterruptedException {
        // wdw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//tbody[1])/tr[last()]/td[7]")));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");


        Thread.sleep(1000);
        return this.lastRowStatus;
    }
}
