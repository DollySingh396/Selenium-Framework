package com.company.Framework.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

    public class BasePage {

        protected WebDriver driver;
        protected WebDriverWait wait;

        // Constructor to initialize WebDriver and WebDriverWait
        public BasePage(WebDriver driver) {
            this.driver = driver;
            this.wait = new WebDriverWait(driver, 15);
        }

        // Method to wait for an element to be visible
        protected WebElement waitForElementVisibility(By locator) {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        }

        // Method to click on an element
        protected void click(By locator) {
            waitForElementVisibility(locator).click();
        }

        // Method to enter text into a text field
        protected void enterText(By locator, String text) {
            WebElement element = waitForElementVisibility(locator);
            element.clear();
            element.sendKeys(text);
        }

        // Method to get text from an element
        protected String getText(By locator) {
            return waitForElementVisibility(locator).getText();
        }
    }



