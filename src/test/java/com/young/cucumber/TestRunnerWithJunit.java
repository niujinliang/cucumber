package com.young.cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:com/young/cucumber/resources",plugin=
{"pretty", "html:result/cucumber/cucumber-html-report","json:result/cucumber/cucumber-report.json"})
public class TestRunnerWithJunit {

}