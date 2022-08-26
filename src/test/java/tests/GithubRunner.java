package tests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
	features= {"C:\\Users\\tulas\\eclipse-workspace\\TestGitHub\\src\\test\\resources\\resouces\\github.feature"},
	monochrome=true,
	glue= {"classpath:test"},
	publish=true,
	plugin= {"pretty","html:C:\\Users\\tulas\\eclipse-workspace\\TestGitHub\\githubtest.html"}
)
public class GithubRunner 
{

}
