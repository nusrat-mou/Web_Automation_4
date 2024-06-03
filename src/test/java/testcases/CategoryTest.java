package testcases;

import pages.Category;
import utilities.BaseDriverSetup;

public class CategoryTest extends BaseDriverSetup {
	
	Category category = new Category();
	
	public void CategoryTestCase() throws InterruptedException {
		getDriver().get(category.category_URL);
		Thread.sleep(3000);
		
		
		category.hoverTest(category.classSixToTwelve);
		Thread.sleep(3000);
		
		category.clickOnElement(category.HSC);
		Thread.sleep(3000);
		
		category.clickOnElement(category.CourseDetails);
		Thread.sleep(3000);
	}

}
