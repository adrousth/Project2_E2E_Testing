package com.revature.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Map;

public class AddRequestPage {

    private WebDriver driver;
    private WebDriverWait wdw;

    @FindBy(id="war-issue-date")
    private WebElement warrantyIssueDate;

    @FindBy(id="war-exp-date")
    private WebElement warrantyExpirationDate;

    @FindBy(id="amount")
    private WebElement warrantyAmount;

    @FindBy(id="device-select")
    private Select warrantyDeviceDropdown;

    @FindBy(id="submit-btn")
    private WebElement submitButton;

    public AddRequestPage(WebDriver driver) {
        this.driver = driver;
        this.wdw = new WebDriverWait(driver, Duration.ofSeconds(2));
        PageFactory.initElements(driver, this);
    }

    public void inputWarrantyIssueDate(String warrantyIssueDate){
        this.warrantyIssueDate.sendKeys(warrantyIssueDate);
    }

    public void inputWarrantyExpirationDate(String warrantyExpirationdate) {
        this.warrantyExpirationDate.sendKeys(warrantyExpirationdate);
    }

    public void inputWarrantyAmount(String amount) {
        this.warrantyAmount.sendKeys(amount);
    }

    public void selectWarrantyType(String type) {
        Select dropDown = new Select(driver.findElement(By.id("device-select")));

        dropDown.selectByValue(type);

        //this.warrantyDeviceDropdown.selectByValue("MRI");
    }



    public void clickSubmitButton() {
        this.submitButton.click();
    }

    public String getErrorAlert() {
        wdw.until(ExpectedConditions.alertIsPresent());
        return driver.switchTo().alert().getText();
    }
}
