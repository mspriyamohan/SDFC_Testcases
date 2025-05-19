package Salesforce_Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC23 {

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
			
			 WebElement dropdownElement = driver.findElement(By.id("fcf")); 
	         Select dropdown = new Select(dropdownElement);
	         dropdown.selectByValue("00BgL0000010EYe");
	         System.out.println("Today's Leads is chosen");
             driver.close();
	}
}
