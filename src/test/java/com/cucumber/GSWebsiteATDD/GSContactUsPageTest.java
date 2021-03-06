package com.cucumber.GSWebsiteATDD;

import com.gs.test.util.PageConstants;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GSContactUsPageTest extends AbstractSteps {

    @Given("^Open GraduateSchool website Home page$")
    public void Open_GraduateSchool_website_Home_page() throws Throwable {

    }

    @Given("^Open GraduateSchool Contact US pages$")
    public void Open_GraduateSchool_Contact_US_page() throws Throwable {
       driver.get(getPropertiesValue(PageConstants.GS_CONTACTUS_FORM));
    }

    @Then("^Verify Site opens up Contact Us page$")
    public void Verify_Site_opens_up_Contact_Us_page() throws Throwable {
        String title = "Graduate School USA | Contact Graduate School";
        Assert.assertEquals(title, driver.getTitle());
    }

    @Then("^Fill the Mandatory fields$")
    public void Fill_the_Mandatory_fields() throws Throwable {
        driver.findElement(By.id("txtFirstName")).sendKeys("ATB");
        driver.findElement(By.id("txtLastName")).sendKeys("ATB");
        driver.findElement(By.id("txtEmail")).sendKeys("atb@atb.com");
        driver.findElement(By.id("selInputSubject")).sendKeys("Subject Line 1");
        driver.findElement(By.id("commentText")).sendKeys("ATB");
    }

    @Then("^User clicks on Submit button$")
    public void User_clicks_on_Submit_button() throws Throwable {
        driver.findElement(By.id("submitForm")).click();
        String errorMessage = "For security, please verify you are a real person below";
        Thread.sleep(500);
        String txtMsg = driver.findElement(By.id("alertError")).getText();
        Assert.assertEquals(errorMessage, txtMsg);
    }

}
