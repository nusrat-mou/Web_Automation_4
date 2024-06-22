package testcases;

import org.testng.annotations.Test;

import pages.Category;
import utilities.BaseDriverSetup;

public class CategoryTest extends BaseDriverSetup {
	
	Category category = new Category();
	
	
	@Test
	public void CategoryTestCase() throws InterruptedException {
		getDriver().get(category.category_URL);
		Thread.sleep(3000);
		
//		category.clickOnElement(category.languageChange, 3000);
		
		category.hoverTest(category.classSixToTwelve,3000);
//		category.clickOnElement(category.HSC,3000);
		category.hoverTest(category.Skills, 3000);
		category.hoverTest(category.Admissions, 3000);
		category.hoverTest(category.OnlineBatch, 3000);
		category.hoverTest(category.EnglishCenter, 3000);
		category.hoverTest(category.more, 3000);
		category.hoverTest(category.Skills, 3000);
		category.clickOnElement(category.FreeLancing, 3000);
		category.clickOnElement(category.FreeCourses, 3000);
		category.scrollToElement(category.scrollToCourse, 3000);
	}

}
