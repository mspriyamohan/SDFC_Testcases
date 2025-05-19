package Salesforce_Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC4_ForgotPassword_4A {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("forgot_password_link")).click();
		System.out.println("Forgot your password link opened");
		driver.findElement(By.id("un")).sendKeys("mspriyamohan106@agentforce.com");
		driver.findElement(By.id("continue")).click();
		System.out.println("An email associated with the account is sent to reset password.");
		driver.close();
	
	}
}
