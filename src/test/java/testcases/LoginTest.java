package testcases;

import static utilities.BaseDriverSetup.getDriver;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
	public WebElement getElement(By locator) {
		return getDriver().findElement(locator);
		
	}
	
	

}
