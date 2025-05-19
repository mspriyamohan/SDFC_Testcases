package Salesforce_Testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TC16 {
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
			
			Thread.sleep(5000);
			WebElement newbtn=driver.findElement(By.xpath("//*[@title='New']"));
			newbtn.click();
			
			Thread.sleep(5000);
			driver.findElement(By.id("opp3")).sendKeys("testing");
			System.out.println("Opportunity name is given");
			driver.findElement(By.id("opp4")).sendKeys("test1");
			System.out.println("Account name is given");
			driver.findElement(By.id("opp9")).sendKeys("test1");
			WebElement date = driver.findElement(By.xpath("//td[@class=\"weekday\"='31']")); 
	        date.click();
			System.out.println("Date is selected");
	          
			WebElement dropdown=driver.findElement(By.id("opp11"));
			Select choose=new Select(dropdown);
			choose.selectByValue("Qualification");
			System.out.println("Qualification is chosen");
			
			driver.findElement(By.id("opp12")).sendKeys("0");
			System.out.println("Probability is given");

			WebElement Leadsource=driver.findElement(By.id("opp6"));
			Select chose=new Select(Leadsource);
			chose.selectByValue("Web");
			System.out.println("Lead source is chosen");
			
			
			
			
			driver.findElement(By.name("save")).click();
			System.out.println("New oppurtunity is saved");
			
			
			driver.close();
			
			
		}

	}


