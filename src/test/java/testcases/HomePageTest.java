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
		
//		home.clickOnElement(home.HSC24_25_26, 3000);
//		home.clickOnElement(home.cross1, 3000);
//		home.clickOnElement(home.class10, 3000);
//		home.clickOnElement(home.cross2, 3000);
		home.clickOnElement(home.class9, 3000);
		home.scrollToElement(home.scrollIntoClass9,3000);
//		home.clickOnElement(home.seeAll, 3000);
		
//		home.clickOnElement(home.expand, 3000);
		home.clickOnElement(home.expand, 2000);
		home.clickOnElement(home.expand2, 2000);
		home.clickOnElement(home.expand2, 2000);
		home.clickOnElement(home.expand3, 2000);
		home.clickOnElement(home.expand3, 2000);
		home.clickOnElement(home.expand4, 2000);
		home.clickOnElement(home.expand4, 2000);
		home.clickOnElement(home.expand5, 2000);
		home.clickOnElement(home.expand5, 2000);
		home.clickOnElement(home.seeAll, 2000);
		home.scrollToElement(home.scrollToParents,2000);
//		home.scrollToElement(home.scrollToPayment, 3000);
		home.clickOnElement(home.enrollClass9, 3000);

	
		home.goToBackOnce(null, 3000);
		home.clickOnElement(home.class8, 3000);
		home.goToBackOnce(null, 3000);
		home.clickOnElement(home.class7, 3000);
		home.goToBackOnce(null, 3000);
		home.clickOnElement(home.class6, 3000);
		home.goToBackOnce(null, 3000);
		
		home.scrollToElement(home.scrollWhyWeAreParentsChoice, 3000);
		home.scrollToElement(home.scrollDreamVarsityPrep, 3000);
	}
	
	

}
