package testcases;

import java.util.Scanner;

import org.testng.annotations.Test;

import pages.ProfilePage;
import utilities.BaseDriverSetup;

public class ProfileTest extends LoginTest
{
	
	ProfilePage profile = new ProfilePage();
	
	
	@Test
	public void ProfileTestCase() throws InterruptedException {
		
//		getDriver().get(profile.profile_URL);
//		Thread.sleep(3000);
		
		
		profile.clickOnElement(profile.clickProfile, 3000);
		
		
	}
		
	}


