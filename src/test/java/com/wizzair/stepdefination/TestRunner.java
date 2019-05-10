package com.wizzair.stepdefination;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/WizzAironeway.feature",glue="com.wizzair.stepdefination",plugin={"html:target","json:target1/report.json"})
public class TestRunner {

}
