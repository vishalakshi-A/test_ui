package org.example.pageobjects.pages;

import org.example.pageobjects.BasePage;
import org.example.pageobjects.modules.ProfileDropDown;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "//summary[@class=\"Header-link\"]/img")
    private WebElement profileDropDownButton;

    public HomePage(WebDriver webDriver) {
            super(webDriver);
        }
    public ProfileDropDown openProfileDropDown() {
        profileDropDownButton.click();

        return new ProfileDropDown(webDriver);

    }

}
