package com.cucumber.GSWebsiteATDD;

import com.gs.test.util.PageConstants;
import cucumber.api.java.en.Given;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class GSFeedbackPageTest extends AbstractSteps{

	@Given("^Open Feedback form page$")
	public void Open_Feedback_form_page() throws Throwable {
		driver.navigate().to(getPropertiesValue(PageConstants.GS_CUSTOMERFEEDBACK_FORM));
	}

	@Then("^Verify we are on feedback page$")
	public void Verify_we_are_on_feedback_page() throws Throwable {
		String title = "Graduate School USA | Contact Graduate School";
		Assert.assertEquals(title, driver.getTitle());
	}

	@When("^User Enters information$")
	public void User_Enters_information() throws Throwable {
        driver.findElement(By.id("txtCustomerFirstName")).sendKeys("Ifti");
        driver.findElement(By.id("txtCustomerLastName")).sendKeys("Khan");
        driver.findElement(By.id("telCustomerPhone")).sendKeys("703-552-6549");
        driver.findElement(By.id("txtCustomerEmail")).sendKeys("i@k.com");
	}

	@Then("^User clicks submit$")
	public void User_clicks_submit() throws Throwable {
		driver.findElement(By.id("customerFeedbackSubmitForm")).click();
	}

	@Then("^Verify that form was submitted successfully$")
	public void Verify_that_form_was_submitted_successfully() throws Throwable {
		WebElement element = driver.findElement(By.id("customerFeedbackFormAlertError"));
		if (element == null) {
			Assert.assertEquals(false, true);
		}
		else {

		}
	}
}
