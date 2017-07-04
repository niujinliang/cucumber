package com.young.cucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="classpath:com/young/cucumber/resources",plugin=
{"pretty", "html:result/cucumber/cucumber-html-report","json:result/cucumber/cucumber-report.json"})
public class TestRunnerWithTestNG extends AbstractTestNGCucumberTests{

}