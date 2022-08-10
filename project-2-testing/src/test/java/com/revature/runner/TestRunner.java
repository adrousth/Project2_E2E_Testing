package com.revature.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

// @CucumberOptions(glue="com.revature.steps", features={"src/test/resources/add_invalid_request.feature",
       // "src/test/resources/addRequest.feature", "src/test/resources/invalid_login.feature",
       // "src/test/resources/loginAdmin.feature", "src/test/resources/updateReqeust.feature"})
//@CucumberOptions(glue="com.revature.steps", features={"src/test/resources/loginAdmin.feature", "src/test/resources/loginManager.feature",
//        "src/test/resources/invalid_login.feature", "src/test/resources/admin_logout.feature", "src/test/resources/manager_logout.feature"})
@CucumberOptions(glue="com.revature.steps", features={"src/test/resources/add_invalid_request.feature"})
public class TestRunner extends AbstractTestNGCucumberTests {

    public static WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
