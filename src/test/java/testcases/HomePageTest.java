package testcases;

import org.testng.annotations.Test;

import pages.HomePage;
import utilities.BaseDriverSetup;

public class HomePageTest extends BaseDriverSetup{
	
	HomePage home = new HomePage();
	
	
	@Test
	public void HomeTestCase() throws InterruptedException {
		
		getDriver().get(home.Homepage_URL);
		Thread.sleep(3000);
		
		home.clickOnElement(home.languageChange, 3000);
		
		home.clickOnElement(home.HSC24_25_26, 3000);
		home.clickOnElement(home.cross1, 3000);
		home.clickOnElement(home.class10, 3000);
		home.clickOnElement(home.cross2, 3000);
		home.clickOnElement(home.class9, 3000);
//		home.scrollToElement(home.scrollIntoClass9,3000);
////		home.clickOnElement(home.seeAll, 3000);
//		
////		home.clickOnElement(home.expand, 3000);
//		home.clickOnElement(home.expand, 2000);
//		home.clickOnElement(home.expand2, 2000);
//		home.clickOnElement(home.expand2, 2000);
//		home.clickOnElement(home.expand3, 2000);
//		home.clickOnElement(home.expand3, 2000);
//		home.clickOnElement(home.expand4, 2000);
//		home.clickOnElement(home.expand4, 2000);
//		home.clickOnElement(home.expand5, 2000);
//		home.clickOnElement(home.expand5, 2000);
//		home.clickOnElement(home.seeAll, 2000);
		
	    home.goToBackOnce(null,3000);

		home.clickOnElement(home.class8, 3000);
		home.goToBackOnce(null, 3000);
		home.clickOnElement(home.class7, 3000);
		home.goToBackOnce(null, 3000);
		home.clickOnElement(home.class6, 3000);
		home.goToBackOnce(null, 3000);
		
//		home.scrollToElement(home.scrollWhyWeAreParentsChoice, 3000);
//		home.scrollToElement(home.scrollDreamVarsityPrep, 3000);
		
		home.scrollToElement(home.scrollToNijerShekhaNijei, 2000);
		home.clickOnElement(home.class5To12, 2000);
//	    home.clickOnElement(home.clickDivision, 2000);
//	    home.clickOnElement(home.chooseDivision, 2000);
	    home.clickOnElement(home.clickClass, 2000);
	    home.clickOnElement(home.chooseClass, 2000);
		home.clickOnElement(home.DemoClass, 2000);
		home.clickOnElement(home.chooseStudent, 2000);
		home.clickOnElement(home.selectDistrict, 2000);
		home.writeText(home.writeDistrict, 2000, "Comilla");
		home.clickOnElement(home.clickComilla, 2000);
		home.clickOnElement(home.selectClass, 2000);
		home.clickOnElement(home.clickContinue, 2000);
		home.clickOnElement(home.selectDate, 2000);
		home.clickOnElement(home.clickContinue, 2000);
		home.clickOnElement(home.selectCurriculamDetails, 2000);
		home.scrollToElement(home.confirmBooking, 2000);
		home.clickOnElement(home.feedback1, 2000);
		home.clickOnElement(home.feedback2, 2000);
		home.clickOnElement(home.feedback3, 2000);
		home.clickOnElement(home.confirmBooking, 2000);
		home.goToBackMultipleTimes(null, 2000, 3);
		
//		home.scrollToElement(home.scrollToLiveCourses, 2000);
//		home.clickOnElement(home.HSC24CommerceClick, 2000);
		
		
	}
	
	

}
