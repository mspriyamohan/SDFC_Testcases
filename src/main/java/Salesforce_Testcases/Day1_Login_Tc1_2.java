package Salesforce_Testcases;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Day1_Login_Tc1_2 {

	public static WebElement getShadowRoot(FirefoxDriver driver, WebElement element, String querySelector) {
		return (WebElement)driver.executeScript("return arguments[0].shadowRoot.querySelector('" + querySelector + "')", element);
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		Actions action = new Actions(driver);
		
		try {
			driver.get("https://www.salesforce.com");
			Thread.sleep(5000);
			// WebElement
			// login=driver.findElementByXPath("//*[@data-tracking-type='login']");
			
			WebElement header = driver.findElementByXPath("//div[@class='globalnav-wrapper-c360 ']");
			WebElement hgf = header.findElement(By.tagName("hgf-c360nav"));
			// action.moveToElement(hgf);
			
			WebElement nav = getShadowRoot(driver, hgf, ".c360-nav").findElement(By.xpath("//nav[@class='utility-nav show']"));
			// action.moveToElement(nav);
			
			WebElement login_li = nav.findElement(By.className("utility-icons"))
					.findElement(By.className("login")).findElement(By.tagName("hgf-c360login"));
			action.moveToElement(login_li);
			
			WebElement login_popOver = getShadowRoot(driver, login_li, ".hgf-popover");
			action.moveToElement(login_popOver);
			
			login_popOver.findElement(By.tagName("hgf-button")).click();
			
			// /hgf-popover/div/div/ul/li[1]/a    /hgf-popover/div/div/ul/li[1]/a
			
			WebElement loginIcon = driver.findElementByXPath("/hgf-popover/div/div/ul/li[1]/a");
			loginIcon.click();
			
			System.out.println("--login_anchor--");
			System.out.println(login_popOver);
			
			/*SignInButton = driver.execute_script("return document.querySelector('globalnav-wrapper-c360').shadowRoot.querySelector('dps-navigation-header').shadowRoot.querySelector('header.dps-navigation-header dps-login').shadowRoot.querySelector('dps-button')")
			SignInButton.click()
			
			WebElement loginIcon = driver.findElementByXPath("//li[@class='utility-icons-items login']");
			action.moveToElement(loginIcon)
				.moveToElement(driver.findElementByXPath("//*[@data-tracking-type='login']")).click();
			System.out.println("Moved to Login Icon");*/
			
			Thread.sleep(15000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			driver.close();
		}
	}

}
