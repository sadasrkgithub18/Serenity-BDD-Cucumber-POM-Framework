package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions( features="src/test/resources/features/Login.feature",
                  glue = "com/qa/stepDefinitions",
                  monochrome = true,
                  plugin = "pretty",
                  dryRun = false)
public class RunCuke 
{

}
