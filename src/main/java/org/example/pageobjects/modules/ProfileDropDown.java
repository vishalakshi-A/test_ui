package org.example.pageobjects.modules;

import org.example.pageobjects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProfileDropDown extends BasePage {
    private WebElement userInformationLabel;
        public ProfileDropDown(WebDriver webDriver){
        super(webDriver);
    }

    public String getUserInformationLabel() {
            userInformationLabel = new WebDriverWait(webDriver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[text()=\"vishalakshi_A@epam.com\"]")));

        return userInformationLabel.getText();

    }
}
