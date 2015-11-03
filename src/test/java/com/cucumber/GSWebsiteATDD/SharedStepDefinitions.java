package com.cucumber.GSWebsiteATDD;

import com.gs.test.util.PageConstants;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

public class SharedStepDefinitions extends AbstractSteps {

    WebDriver driver = null;

    @Before
    public void MaketheDriverReady() throws Throwable {
        driver = getDriver(getPropertiesValue(PageConstants.BROWSER_NAME));
    }

    @After
    public void ClosetheDriver() throws Throwable {
       // driver.quit();
    }



}