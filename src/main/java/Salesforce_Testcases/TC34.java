package Salesforce_Testcases;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC34 {

		public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.edgedriver().setup();
			EdgeDriver driver=new EdgeDriver();
			try {
			driver.get("https://login.salesforce.com/");
			WebElement login=driver.findElementByName("username");
			login.clear();
			login.sendKeys("mspriyamohan106@agentforce.com");
			WebElement password=driver.findElementById("password");
			password.sendKeys("1GlaksAd!");
			driver.findElementById("Login").click();
			System.out.println("Home page is displayed");	
			Thread.sleep(5000);
			
			 WebElement nameLink = driver.findElement(By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span[1]/h1/a"));
             nameLink.click();
	         System.out.println("First and last name is displayed and it is similar to home page");
	         
	         driver.findElement(By.xpath("//*[@title='Edit Profile' and @src='/img/func_icons/util/pencil12.gif\']")).click();
	         System.out.println("Edit profile is clicked");

	         driver.switchTo().frame("contactInfoContentId");
	         
	         driver.findElement(By.xpath("//*[@aria-controls=\"TabPanel:0:Body:1\"]")).click();
	         driver.findElement(By.id("lastName")).clear();
	         driver.findElement(By.id("lastName")).sendKeys("ABCD");
	         System.out.println("Lastname is changed to ABCD");

	         driver.findElement(By.xpath("//*[@value=\"Save All\"]")).click();
	         System.out.println("Lastname is updated");

	         
	         
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // Close the browser
	     //   driver.close();
	        }

		
		}}		
	