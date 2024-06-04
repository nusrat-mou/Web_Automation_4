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
		
//		home.clickOnElement(home.HSC24_25_26, 3000);
//		home.clickOnElement(home.cross1, 3000);
//		home.clickOnElement(home.class10, 3000);
//		home.clickOnElement(home.cross2, 3000);
		home.clickOnElement(home.class9, 3000);
		home.scrollToElement(home.scrollIntoClass9,3000);
//		home.clickOnElement(home.seeAll, 3000);
		
//		home.clickOnElement(home.expand, 3000);
		home.clickOnElement(home.expand, 3000);
		home.clickOnElement(home.expand2, 3000);
		home.clickOnElement(home.expand2, 3000);
		home.clickOnElement(home.expand3, 3000);
		home.clickOnElement(home.expand3, 3000);
		home.clickOnElement(home.expand4, 3000);
		home.clickOnElement(home.expand4, 3000);
//		home.clickOnElement(home.seeAll, 3000);
//		home.scrollToElement(home.scrollToPayment, 3000);
		home.clickOnElement(home.expand5, 3000);
		home.clickOnElement(home.expand5, 3000);
	
		home.goToBackOnce(null, 3000);
		home.clickOnElement(home.class8, 3000);
		home.goToBackOnce(null, 3000);
		home.clickOnElement(home.class7, 3000);
		home.goToBackOnce(null, 3000);
		home.clickOnElement(home.class6, 3000);
		home.goToBackOnce(null, 3000);
	}
	
	

}
