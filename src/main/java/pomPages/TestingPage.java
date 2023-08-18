package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage 
{
	//Declaration
	//Address of selenium Training
	@FindBy(xpath="//img[@id='Selenium Training']")
	private WebElement seleniumtraining;
	//Address of cart
	@FindBy(id="mycart")
	private WebElement carttab;
	//Address of facebook
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebook;
	
	//initialization
	public TestingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Utilization
	public WebElement getSeleniumtraining()
	{
		return seleniumtraining;
	}
	public WebElement getCarttab()
	{
		return carttab;
	}
	public WebElement getFacebook()
	{
		return facebook;
	}
	public void facebookicon()
	{
		facebook.click();
	}
}
