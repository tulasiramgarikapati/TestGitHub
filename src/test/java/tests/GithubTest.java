package tests;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.InitialPage;
import pages.LoginPage;
import utility.TestUtility;

public class GithubTest 
{
	public Scenario s;
	public InitialPage ip;
	public LoginPage lp;
	public HomePage hp;
	public WebDriver driver;
	public TestUtility tu;
	
	@Before
	public void method1(Scenario s)
	{
		this.s=s;
		tu = new TestUtility();
	}
	
	@Given("^launch site using chrome browser$")
	public void method2() throws InterruptedException
	{
		driver = tu.openBrowser();
		
		ip = new InitialPage(driver);
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
		
		tu.launchSite(driver, "https://github.com/");
	}
	
	@When("^click on Sign In button$")
	public void method3() throws InterruptedException
	{
		ip.clickSignIn();
		Thread.sleep(3000);
	}
	
	@Then("^enter \"(.*)\" as username$")
	public void method4(String un) throws InterruptedException
	{
		lp.fillUsername(un);
		Thread.sleep(3000);
	}
	
	@And("^enter \"(.*)\" as password$")
	public void method5(String pwd) throws InterruptedException
	{
		lp.fillPassword(pwd);
		Thread.sleep(3000);
	}
	
	@And("^click on Sign in button$")
	public void method6() throws InterruptedException
	{
		lp.clickSignIn();
		Thread.sleep(3000);
	}
	
	@Then("^validate criteria \"(.*)\" as criteria$")
	public void method7(String pc)
	{
		try
		{
			if(pc.equals("bothblank") && lp.errstring.isDisplayed())
			{
				System.out.println("Test passed");
			}
			else if(pc.equals("blankuid") && lp.errstring.isDisplayed())
			{
				System.out.println("Test passed");
			}
			else if(pc.equals("pwdblank") && lp.errstring.isDisplayed())
			{
				System.out.println("Test passed");
			}
			else if(pc.equals("invalid") && lp.errstring.isDisplayed())
			{
				System.out.println("Test passed");
			}
			else if(pc.equals("valid") && hp.issuesField.isDisplayed())
			{
				System.out.println("Test passed");
			}
			else
			{
				System.out.println("Test Failed");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	@And("^close site$")
	public void method8()
	{
		tu.closeSite(driver);
	}
}
