package com.company.Framework.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.yourcompany.framework.pages.HomePage;
import com.yourcompany.framework.pages.LoginPage;
import com.yourcompany.framework.pages.ProfilePage;

public class ProfilePageTest extends BaseTest {

    @Test
    public void testProfileName() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = homePage.clickLoginLink();
        loginPage.enterUsername("testuser");
        loginPage.enterPassword("password");
        homePage = loginPage.clickLoginButton();

        ProfilePage profilePage = homePage.clickProfileLink();
        Assert.assertEquals(profilePage.getProfileName(), "testuser");
    }
}
