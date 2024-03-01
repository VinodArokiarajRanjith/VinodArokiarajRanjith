package com.fb.web.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/com/fb/web/features/05StoreSearch.feature"},
                  glue = {"com.fb.web.stepDefinition" },
                  monochrome = false,
               tags="@web",
                  dryRun =false,
                		  plugin = { "pretty", "html:target/ResultsWeb/TestReport.html",
    				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
                  

)
public class WebRunner  extends AbstractTestNGCucumberTests {

}