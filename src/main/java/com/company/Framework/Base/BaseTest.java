package com.company.Framework.Base;

import com.company.Framework.Utility.ConfigReader;
import com.company.Framework.Utility.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public class BaseTest {

        protected WebDriver driver;

        @BeforeMethod
        public void setUp() {
            // Initialize the WebDriver
            driver = DriverManager.getDriver();

            // Load the application URL from the configuration file
            driver.get(ConfigReader.getProperty("app.url"));
        }

        @AfterMethod
        public void tearDown() {
            // Quit the WebDriver after each test
            if (driver != null) {
                driver.quit();
            }
        }

    }

}



