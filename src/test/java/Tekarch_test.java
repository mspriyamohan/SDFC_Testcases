import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Tekarch_test {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://qa-tekarch.firebaseapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email_field")).sendKeys("admin123@gmail.com");
		driver.findElement(By.id("password_field")).sendKeys("admin123");
		driver.findElement(By.cssSelector("#login_div > button")).click();
		Thread.sleep(5000);
		WebElement we=driver.findElement(By.xpath("/html/body/div[2]/div[2]/h1"));
		String text=we.getText();
		System.out.println(text);
		Thread.sleep(5000);
		String result="Student Registration Form";
		if(text.equals(result)) {
			System.out.println("Text matches");
		}
		else {
			System.out.println("Text does not matches");
		}

		driver.close();
	}
}
