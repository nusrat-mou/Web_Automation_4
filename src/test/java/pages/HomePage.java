package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {
	
	public String Homepage_URL = "https://10minuteschool.com/en/";
	
	
	public By languageChange = By.xpath("//span[contains(text(),'বাং')]");
	public By HSC24_25_26 = By.xpath("//body/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]");
	public By cross1 = By.xpath("//body/div[5]/div[1]/div[1]/button[1]/*[1]");
	public By class10 = By.xpath("//body/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]");
	public By cross2 = By.xpath("//body/div[5]/div[1]/div[1]/button[1]/*[1]");
	public By class9 = By.xpath("//body/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/a[1]/div[1]");
	public By scrollIntoClass9 = By.xpath("//h2[contains(text(),'যেভাবে পেমেন্ট করবেন')]");
	public By scroll2 = By.xpath("//h3[contains(text(),'কোম্পানি')]");
	public By expand = By.xpath("//body/main[1]/div[3]/main[1]/section[1]/div[1]/div[2]/div[13]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/details[1]/summary[1]");
	public By expand2 = By.xpath("//body/main[1]/div[3]/main[1]/section[1]/div[1]/div[2]/div[13]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/details[2]/summary[1]");
	public By expand3 = By.xpath("//body/main[1]/div[3]/main[1]/section[1]/div[1]/div[2]/div[13]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/details[3]/summary[1]");
	public By expand4 = By.xpath("//body/main[1]/div[3]/main[1]/section[1]/div[1]/div[2]/div[13]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/details[4]/summary[1]");
	public By seeAll = By.xpath("//body/main[1]/div[3]/main[1]/section[1]/div[1]/div[2]/div[13]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]");
	public By expand5 = By.xpath("//body/main[1]/div[3]/main[1]/section[1]/div[1]/div[2]/div[13]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/details[5]/summary[1]");
	public By scrollToPayment = By.xpath("//h3[contains(text(),'প্যারেন্টস মিটিং কবে এবং কিভাবে হবে?')]");
	public By class8 = By.xpath("//body/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/a[1]/div[1]");
	public By class7 = By.xpath("//body/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/a[1]/div[1]");
	public By class6 = By.xpath("//body/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/a[1]/div[1]");
	public By scrollWhyWeAreParentsChoice = By.xpath("//h2[contains(text(),'কেন আমরাই শিক্ষার্থী ও অভিভাবকগণের প্রথম পছন্দ?')]");
	public By scrollDreamVarsityPrep = By.xpath("//h2[contains(text(),'স্বপ্নের ভার্সিটির সম্পূর্ণ প্রস্তুতি')]");
	public By seeLess = By.xpath("//body/main[1]/div[3]/main[1]/section[1]/div[1]/div[2]/div[13]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]");
	public By scrollToParents = By.xpath("//h3[contains(text(),'প্যারেন্টস মিটিং কবে এবং কিভাবে হবে?')]");
	public By enrollClass9 = By.xpath("//body/main[1]/div[3]/main[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]");
	public By scrollToNijerShekhaNijei = By.xpath("//h2[contains(text(),'নিজের শেখা নিজেই গুছিয়ে নেয়ার যাত্রা শুরু হোক')]");
	public By class5To12 = By.xpath("//body/main[1]/div[3]/div[1]/div[2]/div[2]/div[1]/a[1]/div[1]");
	public By click10thStandard = By.xpath("//body/app-root[1]/div[1]/div[1]/app-home[1]/div[1]/main[1]/app-auth[1]/div[1]/app-login-sub-categories[1]/div[1]/div[1]/div[2]");
	public By scrollToLiveCourses = By.xpath("//h2[contains(text(),'লাইভ কোর্সসমূহ')]");
	public By HSC24CommerceClick = By.xpath("//body/main[1]/div[4]/div[2]/div[1]/div[2]/a[6]/div[1]");
    public By clickDivision = By.xpath("//body/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/span[2]/div[1]/*[1]");
    public By chooseDivision = By.xpath("//body/div[5]/div[1]/ul[1]/li[2]");
    public By clickClass = By.xpath("//body/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/*[1]");
    public By chooseClass = By.xpath("//body/div[5]/div[1]/ul[1]/div[3]/li[1]");
    public By DemoClass = By.xpath("//a[contains(text(),'ডেমো ক্লাস করে দেখুন')]");
    public By chooseStudent = By.xpath("//body/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]/span[1]/input[1]");
    public By selectDistrict = By.xpath("//body/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/p[1]");
    public By writeDistrict = By.xpath("//body/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/ul[1]/input[1]");
    public By clickComilla = By.xpath("//li[contains(text(),'COMILLA')]");
    public By selectClass = By.xpath("//body/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/label[1]/span[1]/input[1]");
    public By clickContinue = By.xpath("//button[contains(text(),'এগিয়ে যাই')]");
    public By selectDate = By.xpath("//body/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]/span[1]/input[1]");
    public By selectCurriculamDetails = By.xpath("//p[contains(text(),'কিছুটা ধারণা আছে')]");
    public By feedback1 = By.xpath("//body/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[2]/p[1]");
    public By feedback2 = By.xpath("//body/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/label[3]/p[1]");
    public By feedback3 = By.xpath("//body/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/label[5]/p[1]");
    public By confirmBooking = By.xpath("//body/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]");

}
