package Salesforce_Testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC6_SelectMyprofileoptionsfromdropdown {
	
	public static  void main(String[] args) throws InterruptedException, AWTException
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
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@title=\"My Profile\"]")).click();
		System.out.println("My profile page is displayed ");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td/div/div[2]/div[2]/div[1]/h3/div/div/a/img")).click();
		System.out.println("Edit profile page is displayed ");
		
		//Switch to iframe by id//
		
		driver.switchTo().frame("contactInfoContentId");
		
		
		driver.findElement(By.xpath("//*[@role=\"tab\"]")).click();
		System.out.println("About page is displayed ");
		
		
		WebElement lastname=driver.findElement(By.id("lastName"));
		lastname.clear();
		lastname.sendKeys("M");
		System.out.println("lastname is entered");
		driver.findElement(By.xpath("//*[@value=\"Save All\"]")).click();
		
        driver.switchTo().defaultContent();
        Thread.sleep(3000);

        driver.findElement(By.id("publishereditablearea")).click();
        
		//Switch to iframe by using xpath//

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"cke_wysiwyg_frame cke_reset\"]")));

        driver.findElement(By.xpath("//*[@role=\"textbox\"]")).sendKeys("Hi");
        System.out.println("Text is entered");
        driver.switchTo().defaultContent();

        
        driver.findElement(By.id("publishersharebutton")).click();
        System.out.println("Entered text is displayed");


        Thread.sleep(5000);
        driver.findElement(By.id("publisherAttachContentPost")).click();       
        System.out.println("Click on file link");
        
        driver.findElement(By.id("chatterUploadFileAction")).click();
        System.out.println("Upload a file from computer is selected");
        WebElement upload=driver.findElement(By.id("chatterFile"));
        Thread.sleep(5000);
        String fileupload="C:\\Users\\Pradeep Venugopal\\Desktop\\cover lettter.txt";
        upload.sendKeys(fileupload);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        driver.findElement(By.id("publishersharebutton")).click();
        System.out.println("File uploaded is displayed");
        
        Thread.sleep(5000);

        WebElement moderate=driver.findElement(By.id("photoSection"));
        Actions actions=new Actions(driver);
        actions.moveToElement(moderate).build().perform();
        
        driver.findElement(By.id("uploadLink")).click();
        Thread.sleep(5000);

        driver.switchTo().frame("uploadPhotoContentId");
        
        WebElement photo=driver.findElement(By.xpath("//*[@id=\"j_id0:uploadFileForm:uploadInputFile\"]"));
        String pic="C:\\Users\\Pradeep Venugopal\\Desktop\\0_SEq6IBJKG_bNW5tc.jpg";
        photo.sendKeys(pic);
        robot.keyPress(KeyEvent.VK_ENTER);
        driver.findElement(By.id("j_id0:uploadFileForm:uploadBtn")).click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame("uploadPhotoContentId");
        Thread.sleep(5000);

        driver.findElement(By.id("j_id0:j_id7:save")).click();
        

       	driver.close();

	}


}
