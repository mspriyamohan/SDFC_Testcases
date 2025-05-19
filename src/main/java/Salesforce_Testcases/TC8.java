package Salesforce_Testcases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC8 {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		WebElement login=driver.findElementByName("username");
		login.clear();
		login.sendKeys("mspriyamohan106@agentforce.com");
		Thread.sleep(2000);
		WebElement password=driver.findElementById("password");
		password.sendKeys("1GlaksAd!");
		driver.findElementById("Login").click();
		System.out.println("Login page was displayed");
		Thread.sleep(2000);
		
		driver.findElement(By.id("userNav-arrow")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@title=\"Developer Console (New Window)\"]")).click();
		System.out.println("Developer Console page is displayed ");
		Thread.sleep(1000);
		
		String parentwindow=driver.getWindowHandle();
		Set<String> allwindows=driver.getWindowHandles();
		 for (String windowHandle : allwindows) {
             if (!windowHandle.equals(parentwindow)) {
                 // Switch to the child window
                 driver.switchTo().window(windowHandle);

                 // Perform any desired actions on the child window
                 System.out.println("Child Window Title: " + driver.getTitle());
                	driver.close();

	}

		 }
	}
}

