package testcases;


import org.testng.annotations.Test;

import pages.SearchPage;
import utilities.BaseDriverSetup;

public class SearchTest extends BaseDriverSetup {
	
	
	SearchPage search = new SearchPage();
	
	@Test
	public void searchTestCase() throws InterruptedException {
		getDriver().get(search.searchURL);
		Thread.sleep(3000);
		
		
		search.clickOnElement(search.searchBar, 3000);
		search.writeText(search.searchBar, 3000, "IELTS");
		search.enterButtonEvent(search.searchBar, 3000);
		search.clickOnElement(search.filterByJob, 3000);
		search.clickOnElement(search.filterByPrice, 3000);
		search.clickOnElement(search.filteredCourse, 3000);
		search.clickOnElement(search.clickEnroll, 3000);
		search.clickOnElement(search.shuruKorun, 3000);
		search.goToBackMultipleTimes(null, 2000, 4);

	}
	
	
	
	}
	


	
	
	
	


