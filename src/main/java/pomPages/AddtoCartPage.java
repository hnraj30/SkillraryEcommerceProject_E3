package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCartPage
{
	//Declaration
	//Address of + icon
	@FindBy(id="add")
	private WebElement addbtn;
	
	//Address of add to cart button
	@FindBy(xpath="//button[@ondblclick='addtocart()']")
	private WebElement cartbtn;
	
	//Initialization
	public AddtoCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Utilization
	public WebElement getAddbtn()
	{
		return addbtn;
	}
	public void addtocartbtn()
	{
		cartbtn.click();
	}	

}
