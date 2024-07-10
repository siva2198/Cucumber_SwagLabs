package com.swaglabs.Pages;

import com.swaglabs.BaseConfig.BaseConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

// page_url = https://www.saucedemo.com/
public class LoginPage extends BaseConfig{
    WebDriver driver;

    @FindBy(xpath = "//*[@id='user-name']")
    WebElement userNameLoginTextField;
    @FindBy(xpath = "//*[@id='password']")
    WebElement passwordLoginTextField;
    @FindBy(xpath = "//*[@id='login-button']")
    WebElement loginButton;

    @FindBy(css = "h3[data-test='error']")
    WebElement errorMessage;

    public void enterUserName(String userName) {
        userNameLoginTextField.sendKeys(userName);
    }
    public void enterPassword(String password) {
        passwordLoginTextField.sendKeys(password);
    }

    public String getErrorMessage() {
         return errorMessage.getText();
    }
    public ProductPage clickLoginButton() {
        loginButton.click();
        return new ProductPage(driver);
    }


    public void loadBaseURL(){
        driver.get("https://www.saucedemo.com/");
    }
}