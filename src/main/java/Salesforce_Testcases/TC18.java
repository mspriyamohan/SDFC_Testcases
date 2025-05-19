package Salesforce_Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC18 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://login.salesforce.com/");
		WebElement login=driver.findElementByName("username");
		login.clear();
		login.sendKeys("mspriyamohan106@agentforce.com");
		WebElement password=driver.findElementById("password");
		password.sendKeys("1GlaksAd!");
		driver.findElementById("Login").click();
		System.out.println("Home page is displayed");	
		
		Thread.sleep(5000);
	    WebElement opportunityLink = driver.findElement(By.xpath("//a[@href='/006/o' and @title='Opportunities Tab']"));		
	    opportunityLink.click();
		System.out.println("Opportunities tab is clicked");
		
		WebElement stuckoppurtunity=driver.findElement(By.xpath("//a[@href=\"/00O?rt=22&retURL=%2F006%2Fo&open=open&break0=STAGE_NAME&sort=STAGE_DURATION&sortdir=down&t=title7&c=FN&c=AN&c=ON&c=SN&c=FQ&c=PB&c=CD&c=TY&s=AM&a=AG&a=SD&details=yes&format=t\"]"));
		stuckoppurtunity.click();
		System.out.println("stuck Opportunities link is clicked");

		Thread.sleep(5000);
		
		driver.close();
	}


}
