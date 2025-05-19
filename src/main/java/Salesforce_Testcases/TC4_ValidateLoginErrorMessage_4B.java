package Salesforce_Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC4_ValidateLoginErrorMessage_4B {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		WebElement login=driver.findElementByName("username");
		login.clear();
		login.sendKeys("123");
		System.out.println("Username 123 is entered");
		WebElement password=driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("22131");
		System.out.println("Password 22131 is entered");
		driver.findElementById("Login").click();
		Thread.sleep(5000);
		WebElement errormessage=driver.findElement(By.id("error"));
		String error=errormessage.getText();
		Thread.sleep(5000);
		System.out.println(error);
		driver.close();
	}
}
