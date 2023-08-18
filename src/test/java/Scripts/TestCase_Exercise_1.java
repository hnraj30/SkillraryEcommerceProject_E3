package Scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.AddtoCartPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;

public class TestCase_Exercise_1 extends BaseClass
{
	@Test
	public void tc1() throws Throwable
	{
		SkillraryLoginPage loginPage = new SkillraryLoginPage(driver);
		
		loginPage.languagebtn();
		loginPage.englishbtn();
		
		loginPage.gearsbutton();
		loginPage.skillrarydemoapplication();
		utilities.switchingtabs(driver);
		SkillraryDemoLoginPage sd= new SkillraryDemoLoginPage(driver);
		utilities.mouseOver(driver, sd.getCoursetab());
		sd.seleniumtariningtab();
		AddtoCartPage ac =new AddtoCartPage(driver);
		utilities.doubleClick(driver, ac.getAddbtn());
		ac.addtocartbtn();
		utilities.alertPopup(driver);
		
		
		
		
		
	}

}
