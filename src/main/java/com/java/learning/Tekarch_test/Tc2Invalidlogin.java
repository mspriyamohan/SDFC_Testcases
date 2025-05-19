package com.java.learning.Tekarch_test;

import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc2Invalidlogin {
	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://qa-tekarch.firebaseapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email_field")).sendKeys("admin123@gmail.com");
		driver.findElement(By.id("password_field")).sendKeys("admin1234");
		driver.findElement(By.cssSelector("#login_div > button")).click();
		//handle the alert
		Thread.sleep(5000);

		Alert alert=driver.switchTo().alert();
		System.out.println("Alert message:"+alert.getText());
		alert.accept();
		Thread.sleep(5000);

		
        	driver.close();
          
        


	}

}
