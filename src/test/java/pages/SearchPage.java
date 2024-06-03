package pages;

import org.openqa.selenium.By;

public class SearchPage extends BasePage{
	
	public String searchURL = "https://10minuteschool.com/en/";
	
	public By searchBar = By.xpath("//body/main[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]");
	public By firstCourse = By.xpath("//h2[contains(text(),'IELTS Course by Munzereen Shahid')]");
	public By secondCourse = By.xpath("//h2[contains(text(),'IELTS LIVE Batch')]");
	public By thirdCourse = By.xpath("//h2[contains(text(),'IELTS Reading & Listening Mock Tests')]");
	public By fourthCourse = By.xpath("//h2[contains(text(),'IELTS Mock Test Solutions')]");
	public By filterByJob = By.xpath("//input[@id='Filter by-jobs-prep']");
	public By filterByPrice = By.xpath("//input[@id='Price-free']");
	public By clickEnroll = By.xpath("//body/main[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]");
	public By clickContinue = By.xpath("//button[contains(text(),'এগিয়ে যান')]");
	public By filteredCourse = By.xpath("//body/main[1]/div[2]/div[2]/div[3]/div[1]/div[4]/a[1]/div[1]/div[1]/div[2]/div[1]");
	public By shuruKorun = By.xpath("//body/app-root[1]/div[1]/div[1]/app-home[1]/div[1]/main[1]/app-checkout[1]/div[1]/div[1]/div[2]/div[2]/app-cart[1]/div[1]/div[2]/div[2]/button[1]/span[1]");
}
