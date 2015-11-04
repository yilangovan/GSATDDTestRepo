package com.cucumber.GSWebsiteATDD;

import com.gs.test.util.PageConstants;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

// We kept this file for Common Methods for entire Test Automation Project

public class CommonUtils extends AbstractSteps {

    @Before
    public void MaketheDriverReady() throws Throwable {
        String browser =getPropertiesValue(PageConstants.BROWSER_NAME);
        if(browser.equalsIgnoreCase("firefox")){   //Check if the browser is 'firefox'
            driver = new FirefoxDriver();
        } else if(browser.equalsIgnoreCase("safari")){
            driver = new SafariDriver();
        } else if(browser.equalsIgnoreCase("opera")){	  	//Check if the browser is 'opera'
            System.setProperty("webdriver.opera.driver", "/usr/bin/operadriver");
            driver = new OperaDriver();
        }
        else if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver1");
            driver = new ChromeDriver();
        }
    }
    @After
    public void tearDown() {
        driver.close();
    }

}
