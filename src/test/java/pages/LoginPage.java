package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
	
	public String loginURL = "https://app.10minuteschool.com/";
	
	
	public By mobileNo = By.xpath("//body/app-root[1]/div[1]/div[1]/app-home[1]/div[1]/main[1]/app-auth[1]/div[1]/app-login[1]/form[1]/section[1]/div[1]/div[1]/div[1]/div[2]/label[1]/span[1]");
	public By submit = By.xpath("//span[contains(text(),'সাবমিট করুন')]");
	

}
