package com.cucumber.GSWebsiteATDD;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SharedStepDefinitions extends AbstractSteps {
	
	WebDriver driver = null;
	@Before
	public void MaketheDriverReady() throws Throwable {
		driver = getDriver(GetBrowserName());
	}
	
	@Given("^Open GraduateSchool website Home page$")
	public void Open_GraduateSchool_website_Home_page() throws Throwable {
		driver.navigate().to("http://beta.graduateschool.edu");
	}

	@When("^User clicks on About Us link$")
	public void User_clicks_on_About_Us_link() throws Throwable {
		//driver.findElement(By.partialLinkText("About Us")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'About Us')]")).click();
		driver.findElement(By.linkText("About Us")).sendKeys(Keys.ENTER);
	}

	@When("^Click on News link$")
	public void Click_on_News_link() throws Throwable {
		driver.findElement(By.xpath("//a[contains(text(),'News')]")).click();
	}

	@Then("^Verify News page is opened$")
	public void Verify_News_page_is_opened() throws Throwable {
		//Assert.assertEquals("Graduate School Website User Feedback Survey", driver.getTitle());
	}
	
	@After
	public void ClosetheDriver() throws Throwable {
		driver.quit();
	}

}
