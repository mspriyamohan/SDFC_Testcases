package Salesforce_Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC12 {
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
		
		driver.findElement(By.id("Account_Tab")).click();
		System.out.println("Accounts page is displayed with correct <username>");
		Thread.sleep(5000);
		
		WebElement dropdown=driver.findElement(By.id("fcf"));
		Select options=new Select(dropdown);
		options.selectByValue("00BgL000001SMjT");
		System.out.println("<View name> edit page Is displayed");
		
		driver.findElement(By.partialLinkText("Edit")).click();
		System.out.println("Edit is clicked");
		WebElement viewname=driver.findElement(By.id("fname"));
		viewname.clear();
		viewname.sendKeys("test33");
		System.out.println("New viewname is entered");
		Thread.sleep(2000);
		
		WebElement addfields=driver.findElement(By.id("fcol1"));
		Select choose=new Select(addfields);
		choose.selectByValue("ACCOUNT.NAME");
		Thread.sleep(2000);
		System.out.println("Account name is selected");
		
		WebElement operator=driver.findElement(By.id("fop1"));
		Select op=new Select(operator);
		op.selectByValue("c");
		Thread.sleep(2000);
		System.out.println("operator is selected");
		
		WebElement value=driver.findElement(By.id("fval1"));
		value.clear();
		value.sendKeys("t");
		System.out.println("value is entered");
		driver.findElement(By.xpath("//*[@title=\"Save\"]")).click();
		System.out.println("Saved Successfully");
		driver.close();

		

	}

}
