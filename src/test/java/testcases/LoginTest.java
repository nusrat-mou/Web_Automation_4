package testcases;

import java.util.Scanner;

import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.BaseDriverSetup;

   



public class LoginTest extends BaseDriverSetup {
	
	LoginPage login = new LoginPage();
	
	
//	Scanner sc = new Scanner(System.in);
////	System.out.println("Enter your phone number: ");
//	String mobileNo = sc.nextLine();

//	
	@Test
	public void LoginTestPage() throws InterruptedException {
		getDriver().get(login.loginURL);
		Thread.sleep(3000);
		
		Scanner sc = new Scanner(System.in);
		String mobile = sc.nextLine();
		System.out.println("Enter your Email or Phone : ");
		login.writeText(login.mobileNo, 3000, mobile);
		
	        
	      
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
