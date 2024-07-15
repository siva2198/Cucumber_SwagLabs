package com.swaglabs.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/swaglabs/Features",
        glue = {"com.swaglabs.StepDefinition", "com.swaglabs.BaseConfig"},
        plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
)
//"pretty", "html:target/cucumber-html-report.html","json:cucumber.json",
public class TestRunner {
}
