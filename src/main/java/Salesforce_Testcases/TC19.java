package Salesforce_Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC19 {
	
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
		
		WebElement dropdown=driver.findElement(By.id("quarter_q"));
		Select op=new Select(dropdown);
		op.selectByValue("curnext1");
		
		WebElement dd=driver.findElement(By.id("open"));
		Select option=new Select (dd);
		option.selectByValue("all");
		
		Thread.sleep(5000);
		WebElement btn=driver.findElement(By.name("go"));
		btn.click();
		System.out.println("Report Page with the Opportunities will be displayed.");
	}
	

}
