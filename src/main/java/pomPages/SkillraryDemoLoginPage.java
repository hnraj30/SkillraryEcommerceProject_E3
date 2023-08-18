package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage 
{
	//Address of course web element
	@FindBy(id="course")
	private WebElement coursetab;
	
	//Address of dropdown WebElement
	@FindBy(xpath="//select[@name='addresstype']")
	private WebElement coursedd;
	
	//address of Selenium training WebElement
	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement seleniumtraining;
	
	//Initialization
	public SkillraryDemoLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Utilization
	public WebElement getCoursedd()
	{
		return coursedd;
	}
	public WebElement getCoursetab()
	{
		return coursetab;
	}
	public void seleniumtariningtab()
	{
		seleniumtraining.click();
	}
}
