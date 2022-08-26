package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	public WebDriver driver;
	
	@FindBy(how=How.XPATH, using="(//input[@id='login_field'])")
	public WebElement username;
	
	@FindBy(how=How.XPATH, using="(//input[@id='password' and @type='password'])")
	public WebElement password;
	
	@FindBy(how=How.XPATH, using="(//input[@value='Sign in' and @type='submit'])")
	public WebElement signinbutton;
	
	@FindBy(how=How.XPATH, using="(//div[@class='px-2'])")
	public WebElement errstring;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void fillUsername(String un)
	{
		username.sendKeys(un);
	}
	
	public void fillPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clickSignIn()
	{
		signinbutton.click();
	}
}
