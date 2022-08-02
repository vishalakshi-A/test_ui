package org.example.pageobjects.pages;

import org.example.pageobjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
//   @FindBy (id= )
//    private WebElement login;
//    private WebElement pass;
//    private WebElement sighInButton;
    @FindBy(id = "login_field")
    private WebElement login;
    @FindBy(id = "password")
    private WebElement pass;
    @FindBy(name = "commit")
    private WebElement sighInButton;

    protected LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public HomePage login(String login,String pass) {
        this.login.sendKeys(login);
        this.pass.sendKeys(pass);
        this.sighInButton.click();
        return new HomePage(webDriver);

    }

}
