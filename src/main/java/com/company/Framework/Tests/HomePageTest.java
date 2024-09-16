package com.company.Framework.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.yourcompany.framework.pages.HomePage;

public class HomePageTest extends BaseTest {

    @Test
    public void testWelcomeMessage() {
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(homePage.getWelcomeMessage(), "Welcome to Our Website");
    }
}