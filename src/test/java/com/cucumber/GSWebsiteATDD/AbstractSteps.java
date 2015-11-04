package com.cucumber.GSWebsiteATDD;

import com.gs.test.util.PageConstants;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import junit.framework.TestSuite;
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


//Common behaviour that shared across test automation project

public class AbstractSteps {

    protected static  WebDriver driver = null;

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



}

	
	
	


