package genericLibrary;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities 
{
	//Handling dropdown
	public void dropdown(WebElement ele,String text)
	{
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}
	//Handling MouseOver
	public void mouseOver(WebDriver driver,WebElement ele)
	{
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}
	//Handling Double click
	public void doubleClick(WebDriver driver,WebElement ele)
	{
		Actions a = new Actions(driver);	
		a.doubleClick(ele).perform();
	}			
	//Handling right click
	public void rightclick(WebDriver driver,WebElement ele)
	{
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
	}
	//handling Drag and Drop
	public void dragdrop(WebDriver driver,WebElement src,WebElement target)
	{
		Actions a = new Actions(driver);
		a.dragAndDrop(src,target).perform();
	}
	//Shifting control to frame
	public void switchFrame(WebDriver driver)
	{
		driver.switchTo().frame(0);
	}
	//Shifting control to normal web page
	public void switchbackframe(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	//Shifting control to popup
	public void alertPopup(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	//shifting control to child window
	public void switchingtabs(WebDriver driver)
	{
		Set<String> child = driver.getWindowHandles();
		for(String b:child)
		{
			driver.switchTo().window(b);
		}
	}
	//Handling scrollbar
	public void scrollbar(WebDriver driver,int x,int y)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("windows.scrollBy("+x+","+y+")");
	}

}
