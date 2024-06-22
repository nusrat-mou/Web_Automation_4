package testcases;

import java.util.Scanner;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ProfilePage;
import utilities.BaseDriverSetup;

public class ProfileTest extends LoginTest
{
	
	ProfilePage profile = new ProfilePage();
	LoginPage login = new LoginPage();
	
	
	@Test
	public void LoginTest() throws InterruptedException {
		
//		getDriver().get(profile.profile_URL);
//		Thread.sleep(3000);
		getDriver().get(login.loginURL);
		Thread.sleep(3000);
		System.out.println("Enter your Email or Phone : ");            
		Scanner sc = new Scanner(System.in);
		String mobile = sc.nextLine();
		
		Thread.sleep(3000);
		
		System.out.println("Enter password: ");
		String pass = sc.nextLine();
		
		Thread.sleep(3000);
		
		sc.close();
		
		// insert the mobile number in the input field.
		login.writeText(login.mobileNoInputField, 3000,""+mobile);
		login.clickOnElement(login.submit, 3000);
		login.writeText(login.pwd, 3000, pass);
		login.clickOnElement(login.submitpwd, 3000);
		
		
		
		
	}
	
	@Test
	public void ProfileTestCase() {
		profile.clickOnElement(profile.clickProfile, 3000);
		
	}
		
	}


