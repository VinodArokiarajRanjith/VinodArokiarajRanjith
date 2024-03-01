package com.fb.testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/com/fb/features"},
                  glue = {"com.fb.stepDefinition" },
                  monochrome = true,
                	tags="@web",
                  dryRun = false, 
                  plugin = { "pretty", "html:target/ResultsMobile/TestReport.html",
          				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
                )  

public class Runner extends AbstractTestNGCucumberTests {

}