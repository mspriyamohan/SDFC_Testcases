package Salesforce_Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC5_selectusermenufromdropdown {
	
	public static  void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		WebElement login=driver.findElementByName("username");
		login.clear();
		login.sendKeys("mspriyamohan106@agentforce.com");
		Thread.sleep(5000);
		WebElement password=driver.findElementById("password");
		password.sendKeys("1GlaksAd!");
		driver.findElementById("Login").click();
		System.out.println("Login page was displayed");
		Thread.sleep(5000);
		driver.findElement(By.id("userNav-arrow")).click();
		List<WebElement> menuItems=driver.findElements(By.xpath("//*[@id='userNav-menuItems']"));
		for(WebElement item : menuItems) {
            System.out.println(item.getText());
		}
		driver.close();

	}

}
