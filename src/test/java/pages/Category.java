package pages;

import org.openqa.selenium.By;

public class Category extends BasePage{
	
	public String category_URL = "https://10minuteschool.com/en/";
	
	public By classSixToTwelve = By.xpath("//body/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[1]/div[1]/div[1]/a[1]/p[1]");
	public By Skills = By.xpath("//body/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/div[1]/div[1]/a[1]/p[1]");
	public By Admissions = By.xpath("//body/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]");
	public By OnlineBatch = By.xpath("//p[contains(text(),'Online Batch')]");
	public By EnglishCenter = By.xpath("//p[contains(text(),'English Centre')]");
	public By more = By.xpath("//body/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[6]");
	public By HSC = By.xpath("//body/div[5]/div[1]/ul[1]/li[1]/span[2]");
	public By CourseDetails = By.xpath("//body/main[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]");
	
	

}
