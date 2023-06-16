package com.adac.runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Muhamed Javeed\\Desktop\\ProjectMuhamedJaveed\\src\\test\\resources\\Features",
				glue = {"com.adactin.stepdefinition", "com.adactin.hookspackage"},
				monochrome = true,
				dryRun = false,
				strict = true,
				plugin = {"html:Adactin/Reports", "json:Adactin/reports.json"})
public class AdactinRunnerClass {

}
