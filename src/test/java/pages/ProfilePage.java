package pages;

import org.openqa.selenium.By;

public class ProfilePage extends BasePage{
	
	public String profile_URL = "https://10minuteschool.com/";
	
	public By clickProfile = By.xpath("//body/main[1]/div[1]/div[1]/div[4]/div[2]/span[1]/div[1]/div[1]/img[1]");
    public By clickMyCourse = By.xpath("//span[contains(text(),'আমার কোর্সসমূহ')]");
    public By clickMySubscription = By.xpath("//span[contains(text(),'আমার সাবস্ক্রিপশন')]");
    public By clickCertificate = By.xpath("//span[contains(text(),'সার্টিফিকেট')]");
    public By clickLearningReport = By.xpath("//span[contains(text(),'লার্নিং রিপোর্ট')]");
    public By clickPaymentHistory = By.xpath("//span[contains(text(),'পেমেন্ট ইতিহাস')]");
    public By clickBetaTesterProgam = By.xpath("//span[contains(text(),'বেটা টেস্টার প্রোগ্রাম')]");
    public By clickPaymentManagement = By.xpath("//span[contains(text(),'পেমেন্ট ব্যবস্থাপনা')]");
    public By clickAccount= By.xpath("//span[contains(text(),'অ্যাকাউন্ট')]");
    public By clickChangePassword= By.xpath("//span[contains(text(),'পাসওয়ার্ড পরিবর্তন করুন')]");
    public By clickDeviceManager= By.xpath("//span[contains(text(),'ডিভাইস ম্যানেজার')]");
    public By clickLogout= By.xpath("//span[contains(text(),'লগআউট')]");
    
    
}
