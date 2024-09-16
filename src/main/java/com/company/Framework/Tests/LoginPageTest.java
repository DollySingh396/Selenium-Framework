package com.company.Framework.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.yourcompany.framework.pages.HomePage;
import com.yourcompany.framework.pages.LoginPage;

public class LoginPageTest extends BaseTest {

    @Test
    public void testLogin() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = homePage.clickLoginLink();
        loginPage.enterUsername("testuser");
        loginPage.enterPassword("password");
        homePage = loginPage.clickLoginButton();

        Assert.assertTrue(homePage.getWelcomeMessage().contains("Welcome, testuser"));
    }
}
