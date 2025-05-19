package Salesforce_Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC33 {

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
			
			 WebElement nameLink = driver.findElement(By.xpath("//*[@href='/_ui/core/userprofile/UserProfilePage']"));

	            // Verify if the link is displayed
	            if (nameLink.isDisplayed()) {
	                System.out.println("The account holder's name is displayed at the top-left as a link.");
	            } else {
	                System.out.println("The account holder's name is NOT displayed at the top-left as a link.");
	            }
	            nameLink.click();
	            System.out.println("First and last name is displayed and it is similar to home page");
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // Close the browser
	         driver.close();
	        }

		
		}}		
		/*	WebElement Contact=driver.findElement(By.xpath("//a[@href=\"/003/o\"]"));
			Contact.click();
			System.out.println("Contact tab is clicked");
			
			WebElement newbtn=driver.findElement(By.name("new"));
			newbtn.click();
			System.out.println("New button is clicked");
			
			WebElement lname=driver.findElement(By.id("name_lastcon2"));
			lname.sendKeys("Indian");
			System.out.println("Lastname is entered");
			
			WebElement acname=driver.findElement(By.id("con4"));
			acname.sendKeys("Global Media");
			System.out.println("accountname is entered");

		    driver.findElement(By.xpath("//input[@value=\" Save \"]")).click();
			System.out.println("New contact is created. Contact Edit: New Contact Page is dispalyed");

	}
}
*/