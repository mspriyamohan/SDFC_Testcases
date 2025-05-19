package Salesforce_Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.ArrayList;
import java.util.List;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TC15 {
	public static void main(String[] args) throws InterruptedException
	{
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
		
		
		WebElement dropdownElement = driver.findElement(By.id("fcf"));
		Select dropdown = new Select(dropdownElement);
		List<WebElement> options = dropdown.getOptions();
		
	    int size=options.size();
	    for(int i=0;i<size;i++)
	    {
	    	String op = options.get(i).getText();
	         System.out.println(op);
	    }
	    
	    driver.close();
      	}

	
}


