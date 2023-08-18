package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage
{
	//Declaration
	//Address of gear web element
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	//Address of Skillrary demo app
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	//address of search textfield
	@FindBy(name="q")
	private WebElement searchtb;
	//address of search icon
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchbtn;
	
	
	//ADDRESS OF LANGUAGE BUTTON
	@FindBy(xpath="(//a[@data-toggle='dropdown'])[2]")
	private WebElement language;
	//ADDRESS OF ENGLISH BUTTON
	@FindBy(xpath="//a[@data-lang='en']")
	private WebElement english;
	
	//Initialization
	public SkillraryLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Utilization
	public void gearsbutton()
	{
		gearsbtn.click();
	}
	public void skillrarydemoapplication()
	{
		skillrarydemoapp.click();
	}
	public void searchTextbox(String name)
	{
		searchtb.sendKeys(name);
	}
	public void gobutton()
	{
		searchbtn.click();
	}
	public void languagebtn()
	{
		language.click();
	}
	public void englishbtn()
	{
		english.click();
	}

}
