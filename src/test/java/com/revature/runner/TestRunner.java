package com.revature.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

@CucumberOptions(glue="com.revature.steps", features={"src/test/resources/add_invalid_request.feature",
       "src/test/resources/addRequest.feature", "src/test/resources/invalid_login.feature",
       "src/test/resources/loginAdmin.feature", "src/test/resources/updateRequest.feature", "src/test/resources/admin_logout.feature", "src/test/resources/loginManager.feature",
        "src/test/resources/manager_logout.feature"})

//@CucumberOptions(glue="com.revature.steps", features={"src/test/resources/loginAdmin.feature", "src/test/resources/loginManager.feature",
//        "src/test/resources/invalid_login.feature", "src/test/resources/admin_logout.feature", "src/test/resources/manager_logout.feature"})
//@CucumberOptions(glue="com.revature.steps", features={"src/test/resources/updateRequest.feature"})
public class TestRunner extends AbstractTestNGCucumberTests {

    public static WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors","--disable-extensions","--no-sandbox","--disable-dev-shm-usage");

        driver = new ChromeDriver(options);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
