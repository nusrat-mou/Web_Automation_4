package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
	
	public String loginURL = "https://app.10minuteschool.com/";
	
	// //body/app-root[1]/div[1]/div[1]/app-home[1]/div[1]/main[1]/app-auth[1]/div[1]/app-login[1]/form[1]/section[1]/div[1]/div[1]/div[1]/div[2]/label[1]/span[1]
	
	//body/app-root[1]/div[1]/div[1]/app-home[1]/div[1]/main[1]/app-auth[1]/div[1]/app-login[1]/form[1]/section[1]/div[1]/div[1]/div[1]/div[2]/label[1]/input[1]
	public By mobileNo = By.xpath("//body/app-root[1]/div[1]/div[1]/app-home[1]/div[1]/main[1]/app-auth[1]/div[1]/app-login[1]/form[1]/section[1]/div[1]/div[1]/div[1]/div[2]/label[1]/span[1]");
	public By mobileNoInputField= By.xpath("//body/app-root[1]/div[1]/div[1]/app-home[1]/div[1]/main[1]/app-auth[1]/div[1]/app-login[1]/form[1]/section[1]/div[1]/div[1]/div[1]/div[2]/label[1]/input[1]");
	public By submit = By.xpath("//span[contains(text(),'সাবমিট করুন')]");
	public By pwd = By.xpath("//body/app-root[1]/div[1]/div[1]/app-home[1]/div[1]/main[1]/app-auth[1]/div[1]/app-login[1]/form[1]/section[1]/div[1]/div[1]/div[2]/div[2]/label[1]/input[1]");
	public By submitpwd = By.xpath("//span[contains(text(),'সাবমিট করুন')]");

}
