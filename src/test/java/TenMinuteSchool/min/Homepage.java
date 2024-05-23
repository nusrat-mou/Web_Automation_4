package TenMinuteSchool.min;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Homepage extends BaseDriver {
	
	
	String URL = "https://10minuteschool.com/";
	
	
	@Test
	public void HomePage() throws InterruptedException {
		
		driver.get(URL);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	
	
	WebElement languageChange = driver.findElement(By.xpath("//span[contains(text(),'EN')]"));
	languageChange.click();
	Thread.sleep(3000);
    
	
//	Actions action = new Actions(driver);
//	WebElement hoverOnClass = driver.findElement(By.xpath("//body/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[1]/div[1]/div[1]/a[1]"));
//	action.moveToElement(hoverOnClass).build().perform();
//	Thread.sleep(3000);
	
//	List<WebElement> options = driver.findElements(By.xpath("//body/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[1]/div[1]/div[1]/a[1]"));
//	Random ran = new Random();
//	int list= ran.nextInt(options.size());
//	options.get(list).click();
//	Thread.sleep(5000);
	
	WebElement search = driver.findElement(By.xpath("//body/main[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]"));
	search.sendKeys("IELTS");
	search.sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	
	WebElement filter = driver.findElement(By.xpath("//input[@id='Filter by-jobs-prep']"));
	filter.click();
	Thread.sleep(3000);
	
	
	Actions action = new Actions(driver);
	WebElement scroll1 = driver.findElement(By.xpath(" //body/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/img[1]"));
	action.moveToElement(scroll1).perform();
	Thread.sleep(3000);
	
	WebElement clickElement = driver.findElement(By.xpath("//body/main[1]/div[3]/div[2]/div[3]/div[1]/div[4]/a[3]/div[1]/div[1]/div[2]/div[1]"));
	clickElement.click();
	Thread.sleep(3000);
	
	WebElement scroll2 = driver.findElement(By.xpath("//body/main[1]/div[3]/main[1]/section[1]/div[1]/div[2]/div[7]/div[1]/div[1]/div[2]/button[1]"));
	action.moveToElement(scroll2).perform();
	Thread.sleep(3000);
	
	WebElement enroll = driver.findElement(By.xpath("//body/main[1]/div[3]/main[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]"));
	enroll.click();
	Thread.sleep(3000);
	
	WebElement clickEgiyeJan = driver.findElement(By.xpath("//button[contains(text(),'এগিয়ে যান')]"));
	clickEgiyeJan.click();
	Thread.sleep(3000);
	
	driver.navigate().back();
	Thread.sleep(3000);
	
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
	


