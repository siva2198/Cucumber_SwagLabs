package com.swaglabs.BaseConfig;


import org.junit.After;
import org.junit.Before;

public class Hooks {
    public static BaseConfig driver;
    @Before
    public void setUp() {
        driver = new BaseConfig();
    }
    @After
    public void tearDown() {
        driver.close();
    }
}
