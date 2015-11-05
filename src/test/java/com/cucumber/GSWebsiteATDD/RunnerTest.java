package com.cucumber.GSWebsiteATDD;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import org.openqa.selenium.firefox.FirefoxDriver;

@RunWith(Cucumber.class)
@Cucumber.Options(
        features = "src/test/resource/feature", tags={"@contactusPageForm, @feedbackForm, @aboutUsPage, @GSFooterPage"}
)
public class RunnerTest {




}