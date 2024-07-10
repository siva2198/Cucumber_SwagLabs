package com.swaglabs.BaseConfig;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseConfig {
    public static WebDriver driver;

    public BaseConfig(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
    public void close(){
        driver.close();
    }
}
