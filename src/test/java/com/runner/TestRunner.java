package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",glue="src/test/java/stepdefinitions",
dryRun=true,monochrome=true)
public class TestRunner {
	

}
