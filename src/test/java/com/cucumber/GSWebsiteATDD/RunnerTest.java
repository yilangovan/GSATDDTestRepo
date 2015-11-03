package com.cucumber.GSWebsiteATDD;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
        features = {"src/test/resource/feature"}
)
public class RunnerTest {

}
