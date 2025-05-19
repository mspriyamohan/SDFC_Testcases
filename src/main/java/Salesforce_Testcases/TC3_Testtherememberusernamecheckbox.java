package Salesforce_Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC3_Testtherememberusernamecheckbox {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://login.salesforce.com/");
		WebElement login=driver.findElementByName("username");
		login.clear();
		login.sendKeys("mspriyamohan106@agentforce.com");
		Thread.sleep(5000);
		WebElement password=driver.findElementById("password");
		password.sendKeys("1GlaksAd!");
        WebElement checkbox = driver.findElement(By.id("rememberUn"));
        if(!checkbox.isSelected())
        {
        	checkbox.click();
        }
		driver.findElementById("Login").click();
		System.out.println("Home page is displayed");
		Thread.sleep(5000);

		driver.findElementById("userNav-arrow").click();
		WebElement logoutButton = driver.findElement(By.xpath("//a[@class='menuButtonMenuLink' and @title='Logout']"));
        logoutButton.click();
		Thread.sleep(5000);
		WebElement identitySpan = driver.findElement(By.id("idcard-identity"));
		String identityText = identitySpan.getText();

		if (identityText.equals("mspriyamohan106@agentforce.com")) {
		    System.out.println("Username is populated");
		}


		driver.close();
	
	}

}
