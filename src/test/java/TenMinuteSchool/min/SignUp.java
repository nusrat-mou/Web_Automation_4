package TenMinuteSchool.min;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SignUp extends BaseDriver {
	
	
	String URL = "https://10minuteschool.com/";
	
	@Test
	public void SignUpTest() throws InterruptedException {
		
		driver.get(URL);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement languageChange = driver.findElement(By.xpath("//span[contains(text(),'EN')]"));
		languageChange.click();
		Thread.sleep(3000);
        
	   WebElement loginClick = driver.findElement(By.xpath("//span[contains(text(),'লগ-ইন')]"));
	   loginClick.click();
	   Thread.sleep(3000);
	   
	   
		
		
		
	}

}
