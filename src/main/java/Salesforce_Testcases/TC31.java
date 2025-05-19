package Salesforce_Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC31 {

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
		
		WebElement link=driver.findElement(By.xpath("//a[@href=\"/ui/list/FilterEditPage?ftype=c&retURL=%2F003&cancelURL=%2F003%2Fo\"]"));
		link.click();
		System.out.println("Create new view is clicked");
		
		driver.findElement(By.id("fname")).sendKeys("ABCD");
		driver.findElement(By.id("devname")).sendKeys("EFGH");
        
		driver.findElement(By.xpath("//input[@title=\"Cancel\"]")).click();
		System.out.println("Contacts Home page is displayed and the View ABCD should not be created.");
		
}

}
