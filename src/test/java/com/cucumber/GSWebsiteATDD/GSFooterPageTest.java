package com.cucumber.GSWebsiteATDD;

import com.gs.test.util.PageConstants;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;


public class GSFooterPageTest extends AbstractSteps {

    @Given("^the user is on the GS Website$")
    public void the_user_is_on_the_GS_Website() throws Throwable {
        driver.get(getPropertiesValue(PageConstants.DEV_URL));
    }


    @Then("^the Footer should display the Graduate School Seal,$")
    public void the_Footer_should_display_the_Graduate_School_Seal() throws Throwable {

        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[4]/div/img"));
    }

    @Then("^the Facebook icon$")
    public void the_Facebook_icon() throws Throwable {

        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[5]/ul/li[1]/a/img"));
        String url = driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[5]/ul/li[1]/a")).getAttribute("href");
        Assert.assertEquals(url, "http://www.facebook.com/GraduateSchoolUSA");

    }

    @Then("^the Twitter icon$")
    public void the_Twitter_icon() throws Throwable {
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[5]/ul/li[2]/a/img"));
        String url = driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[5]/ul/li[2]/a")).getAttribute("href");
        Assert.assertEquals(url, "http://twitter.com/thegradschool");

    }

    @Then("^the Flickr icon$")
    public void the_Flickr_icon() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='footer']/div[2]/footer/div[1]/div[5]/ul/li[4]/a/img"));
        String url = driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[5]/ul/li[4]/a")).getAttribute("href");
        Assert.assertEquals(url, "http://www.flickr.com/photos/thegradschool");

    }

    @Then("^the GSA Contract Holder logo$")
    public void the_GSA_Contract_Holder_logo() throws Throwable {
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[1]/a/img"));
    }

    @Then("^the (\\d+) Graduate School USA copyright \"([^\"]*)\"$")
    public void the_Graduate_School_USA_copyright(int arg1, String arg2) throws Throwable {
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[1]/p"));
        //   driver.findElement(By.linkText("Copyright © 2015 Graduate School USA"));
    }

    @Then("^the GS Mission link$")
    public void the_GS_Mission_link() throws Throwable {
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[3]/ul/li[1]/a"));
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[3]/ul/li[1]/a")).click();
        Assert.assertEquals("Graduate School USA | Mission Statement and Goals", driver.getTitle());
    }

    @Then("^the GS policies link$")
    public void the_GS_policies_link() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='footer']/div[2]/footer/div[1]/div[3]/ul/li[3]/a"));
    }

    @Then("^the GS Accreditation and Approvals link$")
    public void the_GS_Accreditation_and_Approvals_link() throws Throwable {
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[3]/ul/li[2]/a"));
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[3]/ul/li[2]/a")).click();
        Assert.assertEquals("Graduate School USA | Accreditation and Approvals", driver.getTitle());
    }

    @Then("^the Southeastern University Students link$")
    public void the_Southeastern_University_Students_link() throws Throwable {
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[3]/ul/li[5]/a"));
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[3]/ul/li[5]/a")).click();
        Assert.assertEquals("Graduate School USA | Under Construction", driver.getTitle());
    }

    @Then("^the Instructor opputunities link$")
    public void the_Instructor_opputunities_link() throws Throwable {
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[3]/ul/li[6]/a"));
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[3]/ul/li[6]/a")).click();
        Assert.assertEquals("Graduate School USA | Under Construction", driver.getTitle());
    }

    @Then("^the Sign-up for Email link$")
    public void the_Sign_up_for_Email_link() throws Throwable {
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[3]/ul/li[7]/a"));
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[3]/ul/li[7]/a")).click();
        Assert.assertEquals("Graduate School USA | Under Construction", driver.getTitle());
    }

    @Then("^Contact Us options - Chat, Phone and email$")
    public void Contact_Us_options_Chat_Phone_and_email() throws Throwable {
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[2]/ul/li[3]/a"));

    }

    @Given("^the user is on the GS Homepage Footer$")
    public void the_user_is_on_the_GS_Homepage_Footer() throws Throwable {
        driver.get(getPropertiesValue(PageConstants.DEV_URL));

    }

    @When("^the user clicks on the GSA Contract Holder$")
    public void the_user_clicks_on_the_GSA_Contract_Holder() throws Throwable {
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[1]/a/img"));
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[1]/a")).click();

    }

    @Then("^the system should display the General Service Administration \\(GSA\\) Contracts page$")
    public void the_system_should_display_the_General_Service_Administration_GSA_Contracts_page() throws Throwable {
        Assert.assertEquals("Graduate School USA | Under Construction", driver.getTitle());
    }

    @Given("^the user is on the GS Homepage$")
    public void the_user_is_on_the_GS_Homepage() throws Throwable {
        driver.get(getPropertiesValue(PageConstants.DEV_URL));
    }

    @Given("^the user navigates to the footer section on the GS homepage$")
    public void the_user_navigates_to_the_footer_section_on_the_GS_homepage() throws Throwable {
        driver.get(getPropertiesValue(PageConstants.DEV_URL));
    }

    @When("^the user clicks on a social Media icon \\(Facebook, Youtube, Twitter, Flickr\\)$")
    public void the_user_clicks_on_a_social_Media_icon_Facebook_Youtube_Twitter_Flickr() throws Throwable {
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[5]/ul/li[1]/a/img"));
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[5]/ul/li[2]/a/img"));
        driver.findElement(By.xpath(".//*[@id='footer']/div[2]/footer/div[1]/div[5]/ul/li[4]/a/img"));
    }

    @Then("^the System should display the appropriate Social Media page \\(Facebook, Youtube, Twitter, Flickr\\) for GS$")
    public void the_System_should_display_the_appropriate_Social_Media_page_Facebook_Youtube_Twitter_Flickr_for_GS() throws Throwable {
        String url = driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[5]/ul/li[1]/a")).getAttribute("href");
        Assert.assertEquals(url, "http://www.facebook.com/GraduateSchoolUSA");

        url = driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[5]/ul/li[2]/a")).getAttribute("href");
        Assert.assertEquals(url, "http://twitter.com/thegradschool");

        url = driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[5]/ul/li[4]/a")).getAttribute("href");
        Assert.assertEquals(url, "http://www.flickr.com/photos/thegradschool");
    }

    @Given("^the user navigates to the Footer section on the GS homepage$")
    public void the_user_navigates_to_the_Footer_section_on_the_GS_homepage() throws Throwable {
        driver.get(getPropertiesValue(PageConstants.DEV_URL));
    }

    @When("^the user clicks on the \"([^\"]*)\" link$")
    public void the_user_clicks_on_the_link(String arg1) throws Throwable {
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[3]/ul/li[1]/a"));
    }

    @Then("^the system should display the Graduate School Mission Page$")
    public void the_system_should_display_the_Graduate_School_Mission_Page() throws Throwable {
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[3]/ul/li[1]/a")).click();
        Assert.assertEquals("Graduate School USA | Mission Statement and Goals", driver.getTitle());
    }

    @When("^the user clicks on the Policies link$")
    public void the_user_clicks_on_the_Policies_link() throws Throwable {
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[3]/ul/li[3]/a"));
    }

    @Then("^the system should display the Graduate School Polices Page$")
    public void the_system_should_display_the_Graduate_School_Polices_Page() throws Throwable {
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[3]/ul/li[3]/a")).click();
        Assert.assertEquals("Graduate School USA | Under Construction", driver.getTitle());
    }

    @When("^the user clicks on the Accreditation and Approvals link$")
    public void the_user_clicks_on_the_Accreditation_and_Approvals_link() throws Throwable {
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[3]/ul/li[2]/a"));
    }

    @Then("^the system should display the Graduate School Accreditation and Approvals Page$")
    public void the_system_should_display_the_Graduate_School_Accreditation_and_Approvals_Page() throws Throwable {
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[3]/ul/li[2]/a")).click();
        Assert.assertEquals("Graduate School USA | Accreditation and Approvals", driver.getTitle());
    }

    @When("^the user clicks on the Southeastern Students link$")
    public void the_user_clicks_on_the_Southeastern_Students_link() throws Throwable {
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[3]/ul/li[5]/a"));
    }

    @Then("^the system should display the Former Southeastern Students Information Page$")
    public void the_system_should_display_the_Former_Southeastern_Students_Information_Page() throws Throwable {
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[3]/ul/li[5]/a")).click();
        Assert.assertEquals("Graduate School USA | Under Construction", driver.getTitle());
    }

    @When("^the user clicks on the  Instructor Opportunities link$")
    public void the_user_clicks_on_the_Instructor_Opportunities_link() throws Throwable {
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[3]/ul/li[6]/a"));
    }

    @Then("^the system should display the Instructor Opportunities Information Page$")
    public void the_system_should_display_the_Instructor_Opportunities_Information_Page() throws Throwable {
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[3]/ul/li[6]/a")).click();
        Assert.assertEquals("Graduate School USA | Under Construction", driver.getTitle());
    }

    @When("^the user clicks on the Signup for Email updates link$")
    public void the_user_clicks_on_the_Signup_for_Email_updates_link() throws Throwable {
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[3]/ul/li[7]/a"));
    }

    @Then("^the system should display the Email Sign up form$")
    public void the_system_should_display_the_Email_Sign_up_form() throws Throwable {
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[3]/ul/li[7]/a")).click();
        Assert.assertEquals("Graduate School USA | Under Construction", driver.getTitle());
    }

    @When("^the user clicks on the Accessibility link$")
    public void the_user_clicks_on_the_Accessibility_link() throws Throwable {
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[3]/ul/li[4]/a"));
    }

    @Then("^the system should display the Accessibility Policy page$")
    public void the_system_should_display_the_Accessibility_Policy_page() throws Throwable {
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[3]/ul/li[4]/a")).click();
        Assert.assertEquals("Graduate School USA | Under Construction", driver.getTitle());
    }

    @When("^the user selects to Contact GS by selecting Email Option$")
    public void the_user_selects_to_Contact_GS_by_selecting_Email_Option() throws Throwable {
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[3]/ul/li[4]/a"));
    }

    @Then("^the system should open the default user email app$")
    public void the_system_should_open_the_default_user_email_app() throws Throwable {
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[3]/ul/li[4]/a")).click();
        Assert.assertEquals("Graduate School USA | Under Construction", driver.getTitle());
    }

    @Then("^the mail should be addressed to customersupport@graduateschool.edu$")
    public void the_mail_should_be_addressed_to_customersupport_graduateschool_edu() throws Throwable {
    }

    @When("^the user selects to Contact GS by selecting Chat Option$")
    public void the_user_selects_to_Contact_GS_by_selecting_Chat_Option() throws Throwable {
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[2]/ul/li[3]/a"));
    }

    @Then("^the system should open Boldchat app for chat$")
    public void the_system_should_open_Boldchat_app_for_chat() throws Throwable {
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[2]/ul/li[3]/a"));
    }

    @When("^the user selects to Contact GS by selecting to call via phone number \"([^\"]*)\"$")
    public void the_user_selects_to_Contact_GS_by_selecting_to_call_via_phone_number(String arg1) throws Throwable {
        driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[2]/ul/li[1]/a"));
    }

    @Then("^the system should provide the option to call GS$")
    public void the_system_should_provide_the_option_to_call_GS() throws Throwable {
        // driver.findElement(By.xpath("//*[@id='footer']/div[2]/footer/div[1]/div[2]/ul/li[1]/a")).click();
        //Assert.assertEquals("Graduate School USA | Under Construction", driver.getTitle());
    }


}
