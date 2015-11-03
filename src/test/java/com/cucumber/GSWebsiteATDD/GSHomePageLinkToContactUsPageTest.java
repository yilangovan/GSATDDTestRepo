package com.cucumber.GSWebsiteATDD;

import com.gs.test.util.PageConstants;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class GSHomePageLinkToContactUsPageTest extends AbstractSteps {

    @Given("^Open GraduateSchool website Home pages$")
    public void Open_GraduateSchool_website_Home_page() throws Throwable {
        driver.navigate().to(getPropertiesValue(PageConstants.DEV_URL));
    }

    @Given("^User clicks on Contact Us  link$")
    public void User_clicks_on_Contact_Us_link() throws Throwable {
        driver.navigate().to(getPropertiesValue(PageConstants.DEV_URL));
        driver.findElement(By.xpath("//div[@id='navbar-collapse-grid']/ul/li[5]/a/div[2]")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'Contact GS')])[2]")).click();

    }

    @Then("^Verify Site opens up Contact us page$")
    public void Verify_Site_opens_up_Contact_us_page() throws Throwable {
      String title = "Graduate School USA | Contact Graduate School";
      Assert.assertEquals(title, driver.getTitle());
    }



    @Given("^User clicks on Contact Us footer link$")
    public void User_clicks_on_Contact_Us_footer_link() throws Throwable {
        driver.navigate().to(getPropertiesValue(PageConstants.DEV_URL));
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[1]/ul/li[2]/a")).click();
    }

    @Given("^User clicks on Trainer  secondary navigation link$")
    public void User_clicks_on_Trainer_secondary_navigation_link() throws Throwable {
        driver.navigate().to(getPropertiesValue(PageConstants.DEV_URL));
        driver.findElement(By.xpath("(//a[contains(text(),'Training Official')])[2]")).click();
        driver.findElement(By.linkText("Contact Us")).click();
    }

}
