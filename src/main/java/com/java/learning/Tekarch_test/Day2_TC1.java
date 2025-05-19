package com.java.learning.Tekarch_test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Day2_TC1 {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://qa-tekarch.firebaseapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement username=driver.findElement(By.id("email_field"));
		username.clear();
		username.sendKeys("admin123@gmail.com");
		WebElement password=driver.findElement(By.id("password_field"));
		password.clear();
		password.sendKeys("admin123");
		driver.findElement(By.xpath("/html/body/div[1]/button")).click();
		
		

	}
	
	
}
