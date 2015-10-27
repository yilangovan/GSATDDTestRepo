package com.cucumber.GSWebsiteATDD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class PageNavigations extends AbstractSteps {
	
	@When("^User clicks on Who we are link$")
	public void User_clicks_on_Who_we_are_link() throws Throwable {
		

//		String bName = GetBrowserName();
//		if(bName.equalsIgnoreCase("chrome")){		
//
//			//driver.findElement(By.xpath("//a[contains(text(),'Who We Are')]")).click();	
//		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Who We Are')]"));
//
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).click().perform();
//		}
//		else if(bName.equalsIgnoreCase("firefox")){
//		//driver.findElement(By.xpath("//a[contains(.,'Who We Are')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'Who We Are')]")).click();
//		}
		
	}

	@Then("^Verify Site opens up About us page$")
	public void Verify_Site_opens_up_About_us_page() throws Throwable {
//		String title = "Graduate School USA | About Graduate School USA";
//		driver.navigate().to("http://beta.graduateschool.edu/content/about-us");
//		Assert.assertEquals(title, driver.getTitle());
	}

	@When("^User clicks on What we offer link$")
	public void User_clicks_on_What_we_offer_link() throws Throwable {
//		String bName = GetBrowserName();
//		if(bName.equalsIgnoreCase("chrome")){		
//
//		//WebElement element = driver.findElement(By.xpath("//a[contains(.,'What We Offer')]"));
//		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'What We Offer')]"));
//
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).click().perform();
//		}
//		else if(bName.equalsIgnoreCase("firefox")){
//		//driver.findElement(By.xpath("//a[contains(.,'What We Offer')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'What We Offer')]")).click();
//		}
	}

	@When("^User clicks on Our History$")
	public void User_clicks_on_Our_History() throws Throwable {
//		String bName = GetBrowserName();
//		
//		if(bName.equalsIgnoreCase("chrome")){		
//
//		//WebElement element = driver.findElement(By.xpath("//a[contains(.,'Our History')]"));
//		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Our History')]"));
//
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).click().perform();
//		}
//		else if(bName.equalsIgnoreCase("firefox")){
//		//driver.findElement(By.xpath("//a[contains(.,'Our History')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'Our History')]")).click();
//		}
	}

}
