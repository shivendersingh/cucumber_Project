package com.knight.cucumber;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/", glue = "com.knight.cucumber",  
plugin = {"pretty","html:E:/eclipse-new-ws/CucumberTest/test-output","json:E:/eclipse-new-ws/CucumberTest/json-output/c.json","junit:E:/eclipse-new-ws/CucumberTest/xml-output/c.xml"},
monochrome=true,
dryRun =false)
public class Runner 
{
 

}
