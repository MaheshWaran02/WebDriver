package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		

		
		
		
		WebElement Username = driver.findElement(By.name("email"));
		Username.sendKeys("abc@xyz.com");
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("123@Abcd");
		
		
		WebElement LoginbuttonLink = driver.findElement(By.name("login"));
		LoginbuttonLink.click();
		


	}

}
