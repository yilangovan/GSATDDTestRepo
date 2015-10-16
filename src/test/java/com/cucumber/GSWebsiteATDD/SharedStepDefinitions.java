package com.cucumber.GSWebsiteATDD;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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

//	@When("^User clicks on About Us link$")
//	public void User_clicks_on_About_Us_link() throws Throwable {
//		String bName = GetBrowserName();
//		if(bName.equalsIgnoreCase("chrome")){
//		driver.findElement(By.linkText("About Us")).sendKeys(Keys.ENTER);
//		}
//		else if(bName.equalsIgnoreCase("firefox")){
//			//driver.findElement(By.xpath("//a[contains(text(),'About Us')]")).click();
//			//driver.findElement(By.partialLinkText("About")).click();
//			WebElement element = driver.findElement(By.cssSelector("a[class='dropdown-toggle underlined']"));
//			element.findElement(By.linkText("About Us")).click();
//			
//			
//		}
//	}
//
//	@When("^Click on News link$")
//	public void Click_on_News_link() throws Throwable {
//		driver.findElement(By.xpath("//a[contains(text(),'News')]")).click();
//	}
//
//	@Then("^Verify News page is opened$")
//	public void Verify_News_page_is_opened() throws Throwable {
//		Assert.assertEquals("Graduate School USA | Recent News Entries", driver.getTitle());
//	}
	
	@After
	public void ClosetheDriver() throws Throwable {
		driver.quit();
	}

}
