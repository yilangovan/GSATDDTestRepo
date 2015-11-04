package com.cucumber.GSWebsiteATDD;

import com.gs.test.util.PageConstants;

import  cucumber.api.java.Before;
import cucumber.api.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SharedStepDefinitions extends AbstractSteps {

    @Before
    public void MaketheDriverReady() throws Throwable {
        driver = new FirefoxDriver();
    }
    @After
    public void tearDown() {
        driver.close();
    }

}