
package Salesforce_Testcases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC36 {
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
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//a[@href=\"/00U/c?md3=84&md0=2025\"]")).click();
		System.out.println("The 'Calendar for FirstName LastName' page is displayed.");
		
		driver.findElement(By.xpath("//*[@id=\"p:f:j_id25:j_id61:28:j_id64\"]/a")).click();
		System.out.println("The 'Calendar: New Event' page is displayed with the cursor at the Subject field.");
		
		driver.findElement(By.xpath("//*[@title=\"Subject Combo (New Window)\"]")).click();
		System.out.println("The 'Combobox' popup is opened.");
		
		String mainWindowHandle = driver.getWindowHandle();

        // Get all window handles
        Set<String> windowHandles = driver.getWindowHandles();

        // Switch to the child window
        for (String handle : windowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
        driver.findElement(By.xpath("//li[@href=\"javascript:pickValue(4);\"]")).click();
        
		 driver.close();
         driver.switchTo().window(mainWindowHandle);


	}
	

}
