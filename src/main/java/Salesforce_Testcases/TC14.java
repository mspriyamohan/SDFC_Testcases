package Salesforce_Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC14 {
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
		
		driver.findElement(By.id("Account_Tab")).click();
		System.out.println("Accounts page is displayed with correct <username>");
		Thread.sleep(5000);
		
		driver.findElement(By.partialLinkText("Accounts with last activity > 30 days")).click();
		System.out.println("Accounts with last activity >30 days link is clicked");
		
		
	    driver.findElement(By.id("ext-gen149")).click();
	    Thread.sleep(2000);
	    WebElement createddate=driver.findElement(By.xpath("//div[contains(text(),'Created Date')]"));
	    createddate.click();
	    System.out.println("Created Date is selected from dropdown");
	    driver.findElement(By.id("ext-gen153")).click();
		
		driver.findElement(By.id("ext-comp-1114")).click();
		System.out.println("Today date is selected");
		
        driver.findElement(By.id("ext-gen50")).click();
        driver.findElement(By.id("saveReportDlg_reportNameField")).sendKeys("report");
        driver.findElement(By.id("saveReportDlg_DeveloperName")).click();
		Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@id=\"ext-gen311\"]")).click();
        System.out.println("Save and Run Report is clicked");

	}

}
