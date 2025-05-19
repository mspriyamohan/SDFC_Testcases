package Salesforce_Testcases;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC7 {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		WebElement login=driver.findElementByName("username");
		login.clear();
		login.sendKeys("mspriyamohan106@agentforce.com");
		Thread.sleep(5000);
		WebElement password=driver.findElementById("password");
		password.sendKeys("1GlaksAd!");
		driver.findElementById("Login").click();
		System.out.println("Login page was displayed");
		Thread.sleep(5000);
		
		driver.findElement(By.id("userNav-arrow")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@title=\"My Settings\"]")).click();
		System.out.println("My settings page is displayed ");
		Thread.sleep(1000);
		
		driver.findElement(By.id("PersonalInfo_font")).click();
		System.out.println("PersonalInfo page is displayed");
		
		driver.findElement(By.id("LoginHistory_font")).click();
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        String downloadPath = "C:\\Users\\Pradeep Venugopal\\Desktop\\Downloads";
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", downloadPath);
        prefs.put("download.prompt_for_download", false);
        
        WebElement downloadButton = driver.findElement(By.xpath("//*[@id=\"RelatedUserLoginHistoryList_body\"]/div/a"));
        downloadButton.click();
        System.out.println("History file is downloaded");
        
        driver.findElement(By.id("DisplayAndLayout_font")).click();
        driver.findElement(By.id("CustomizeTabs_font")).click();
        WebElement dropdownElement=driver.findElement(By.id("p4"));
        Select dropdown=new Select(dropdownElement);
        dropdown.selectByValue("02ugL000000QO8j");
        System.out.println("Salesforce chatter is selected");
        
        WebElement tabs=driver.findElement(By.id("duel_select_0"));
        Select options=new Select(tabs);
        options.selectByValue("report");
        driver.findElement(By.xpath("//*[@class=\"rightArrowIcon\"]")).click();
        System.out.println("Reports field is added to Selected Tabs list and also added in the links available in top of salesforce page and sales force chatter page and sales and marketing pages.");
        
        
        driver.findElement(By.id("EmailSetup_font")).click();
        driver.findElement(By.id("EmailSettings_font")).click();
        driver.findElement(By.id("auto_bcc1")).click();
        driver.findElement(By.name("save")).click();
        System.out.println("Given details are saved as default mail options and My settings page is displayed.");
		
        driver.findElement(By.id("CalendarAndReminders_font")).click();
        driver.findElement(By.id("Reminders_font")).click();
        WebElement testbutton=driver.findElement(By.id("testbtn"));
        testbutton.click();
        driver.close();
	}

}
