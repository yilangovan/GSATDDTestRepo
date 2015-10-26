package com.cucumber.GSWebsiteATDD;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;


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
	
	@After
	public void ClosetheDriver() throws Throwable {
		driver.quit();
	}

}
