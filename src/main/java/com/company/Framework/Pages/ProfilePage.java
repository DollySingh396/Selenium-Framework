package com.company.Framework.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends BasePage {

    @FindBy(id = "profileName")
    private WebElement profileName;

    @FindBy(id = "editProfileButton")
    private WebElement editProfileButton;

    public ProfilePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getProfileName() {
        return profileName.getText();
    }

    public void clickEditProfileButton() {
        editProfileButton.click();
    }
}
