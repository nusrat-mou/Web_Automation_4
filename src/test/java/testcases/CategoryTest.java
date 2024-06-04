package testcases;

import pages.Category;
import utilities.BaseDriverSetup;

public class CategoryTest extends BaseDriverSetup {
	
	Category category = new Category();
	
	public void CategoryTestCase() throws InterruptedException {
		getDriver().get(category.category_URL);
		Thread.sleep(3000);
		
		
		category.hoverTest(category.classSixToTwelve,3000);
		Thread.sleep(3000);
		
		category.clickOnElement(category.HSC,3000);
		Thread.sleep(3000);
		
		category.clickOnElement(category.CourseDetails,3000);
		Thread.sleep(3000);
	}

}
