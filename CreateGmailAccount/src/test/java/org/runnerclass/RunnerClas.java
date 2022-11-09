package org.runnerclass;


import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\",
glue= {"org.stepdefinitionclass"},
dryRun=false)           

 public class RunnerClas {
	
	
  
	


}  
