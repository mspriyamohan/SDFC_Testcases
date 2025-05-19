package Salesforce_Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC24 {
	
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
		leadlink.click();
		
		WebElement newbtn=driver.findElement(By.name("new"));
		newbtn.click();
		System.out.println("New Button is clicked");	

		WebElement lname=driver.findElement(By.id("name_lastlea2"));
		lname.sendKeys("ABCD");
		System.out.println("lastname is entered");	

		
		WebElement cname=driver.findElement(By.id("lea3"));
		cname.sendKeys("ABCD");
		System.out.println("companyname is entered");	

		driver.findElement(By.name("save")).click();
		System.out.println("new lead is saved and the newly created lead view page is opened");	

		driver.close();
	}

}
