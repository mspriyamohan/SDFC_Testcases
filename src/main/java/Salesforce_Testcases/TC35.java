package Salesforce_Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC35 {
	
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
		
		driver.findElement(By.xpath("//*[@class=\"allTabsArrow\" and @title=\"All Tabs\"]")).click();
		driver.findElement(By.name("customize")).click();
		
		WebElement dropdown=driver.findElement(By.id("duel_select_1"));
		Select op=new Select(dropdown);
		op.selectByValue("Idea");
		
		driver.findElement(By.xpath("//*[@class=\"leftArrowIcon\"]")).click();
		System.out.println("Idea tab is removed");
		driver.findElement(By.name("save")).click();
		driver.findElement(By.id("userNav-arrow")).click();
		
        driver.findElement(By.xpath("//*[@href='/secur/logout.jsp']")).click();
        System.out.println("Application got logout successfully");
		
        driver.get("https://login.salesforce.com/");
		WebElement login1=driver.findElementByName("username");
		login1.clear();
		login1.sendKeys("mspriyamohan106@agentforce.com");
		WebElement password1=driver.findElementById("password");
		password1.sendKeys("1GlaksAd!");
		driver.findElementById("Login").click();
		System.out.println("Home page is displayed");	
		Thread.sleep(5000);
	}
	

}
