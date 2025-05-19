package Salesforce_Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC22 {

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
		
		WebElement leadlink=driver.findElement(By.id("Lead_Tab"));
		if(!leadlink.isDisplayed())
		{
			System.out.println("Lead Tab is not present");	
		}
        
	     	System.out.println("Lead Tab is present");
	     	leadlink.click();
	     	
	  	  WebElement dropdownElement = driver.findElement(By.id("fcf")); 
          Select dropdown = new Select(dropdownElement);
          dropdown.selectByValue("00BgL0000010EYQ");
          System.out.println("My Unread Leads is chosen");

          
          driver.findElement(By.id("userNav-arrow")).click();
          driver.findElement(By.xpath("//*[@href='/secur/logout.jsp']")).click();
          System.out.println("Application got logout successfully");
 	   	
          
        driver.get("https://login.salesforce.com/");
  		WebElement login1=driver.findElementByName("username");
  		login1.clear();
  		login1.sendKeys("mspriyamohan106@agentforce.com");
  		WebElement password1=driver.findElementById("password");
  		password1.sendKeys("1GlaksAd!");
  		driver.findElementById("Login").click();
  		System.out.println("Home page is displayed");	
  		Thread.sleep(5000);	
	     	
		WebElement leadlink1=driver.findElement(By.id("Lead_Tab"));
     	leadlink1.click();
     	
     	WebElement go=driver.findElement(By.name("go"));
     	go.click();
 
     	 driver.findElement(By.id("userNav-arrow")).click();
         driver.findElement(By.xpath("//*[@href='/secur/logout.jsp']")).click();
         System.out.println("Application got logout successfully");
	   	driver.close();
         
		
	}
}
