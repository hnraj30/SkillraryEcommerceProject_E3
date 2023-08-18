package Scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.AddtoCartPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;

public class TestCase_1 extends BaseClass
{
	@Test
	
	public void tc1() throws Throwable 
	{
		SkillraryLoginPage s =new SkillraryLoginPage(driver);
		s.languagebtn();
		s.englishbtn();Thread.sleep(2000);
		s.gearsbutton();
		s.skillrarydemoapplication();
		utilities.switchingtabs(driver);
		SkillraryDemoLoginPage sd = new SkillraryDemoLoginPage(driver);
		utilities.mouseOver(driver, sd.getCoursetab());
		sd.seleniumtariningtab();
		AddtoCartPage d= new AddtoCartPage(driver);
		utilities.doubleClick(driver, d.getAddbtn());
		d.addtocartbtn();
		utilities.alertPopup(driver);
		
		
	}
	
	
	
}
