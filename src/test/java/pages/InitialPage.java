package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class InitialPage 
{
	public WebDriver driver;
	
	@FindBy(how=How.XPATH, using="(//a[contains(text(),'Sign in')])")
	public WebElement signin;
	
	public InitialPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickSignIn()
	{
		signin.click();
	}
}
