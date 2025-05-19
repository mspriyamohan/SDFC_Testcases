package Salesforce_Testcases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC21 {
	
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

	            List<WebElement> options = dropdown.getOptions();
	            List<String> actualValues = new ArrayList<>();
	            for (WebElement option : options) {
	                actualValues.add(option.getText());
	            }
               
	             System.out.println(actualValues); 	
	     	
	     	
	}
         
}