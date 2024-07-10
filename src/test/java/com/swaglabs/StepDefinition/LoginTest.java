package com.swaglabs.StepDefinition;

import com.microsoft.playwright.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class LoginTest {
    Playwright playwright = Playwright.create();
    Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
    Page page = browser.newPage();
    @Given("User navigate to the login page")
    public void userNavigateToTheLoginPage(){
        page.navigate("https://www.saucedemo.com/");
    }

    @When("user should enter {string} and {string}")
    public void userShouldEnterAnd(String username, String password) {
        page.locator("//*[@id='user-name']").type("standard_user");
        page.locator("//*[@id='password']").type("secret_sauce");
        page.locator("//*[@id='login-button']").click();
    }

    @Then("user able to view the product page")
    public void userAbleToViewTheProductPage() {
        Locator logoText =page.locator("//div[@class='app_logo']");
        assertThat(page).hasTitle("Swag Labs");
        page.clock();
        browser.close();
        playwright.close();
    }
}
