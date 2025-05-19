package Salesforce_Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC28 {
	
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.edgedriver().setup();
	EdgeDriver driver=new EdgeDriver();
	driver.get("https://login.salesforce.com/");
	WebElement login=driver.findElementByName("username");
	login.clear();
	login.sendKeys("mspriyamohan106@agentforce.com");
	WebElement password=driver.findElementById("password");
	password.sendKeys("1GlaksAd!");
	driver.findElementById("Login").click();
	System.out.println("Home page is displayed");	
	Thread.sleep(5000);
    
	WebElement Contact=driver.findElement(By.xpath("//a[@href=\"/003/o\"]"));
	Contact.click();
	System.out.println("Contact tab is clicked");
	
	
	WebElement dropdow=driver.findElement(By.id("fcf"));
	Select op=new Select(dropdow);
	op.selectByValue("00BgL0000010ExX");
	System.out.println("My Contacts is selected and displayed");
    driver.close();
	
	}

}
