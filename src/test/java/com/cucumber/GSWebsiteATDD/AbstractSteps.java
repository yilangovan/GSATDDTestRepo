package com.cucumber.GSWebsiteATDD;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class AbstractSteps {

    protected static WebDriver driver = null;

    protected String getPropertiesValue(String propertyKey)
    {
        String propertyValue = null;
        try {
            File file = new File("config.properties");
            FileInputStream fileInput = new FileInputStream(file);
            Properties properties = new Properties();
            properties.load(fileInput);
            fileInput.close();
            Enumeration enuKeys = properties.keys();
            while (enuKeys.hasMoreElements()) {
                String key = (String) enuKeys.nextElement();
                if(key.equals(propertyKey)){
                    propertyValue = properties.getProperty(key);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return propertyValue;
    }

    protected WebDriver getDriver(String browser){

        if(driver == null){
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
        return driver;

    }

}

	
	
	


