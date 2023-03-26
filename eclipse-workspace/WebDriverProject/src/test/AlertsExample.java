package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		WebElement button = driver.findElement(By.id("alertButton"));
		button.click();
		

		Alert obj = driver.switchTo().alert();
	Thread.sleep(3000);
		obj.accept();
		
		
		WebElement button1 = driver.findElement(By.id("confirmButton"));
		Thread.sleep(3000);
		button1.click();
		
		Alert obj1 = driver.switchTo().alert();
		Thread.sleep(3000);
		obj1.dismiss();
		
		WebElement error = driver.findElement(By.className("text-success"));
		String errorMsg = error.getText();
		String ExperrorMsg = "You selected Cancel";
		
		
		
       if(error.isDisplayed() && errorMsg.equals(ExperrorMsg)) {
			
			System.out.println("TC Passed");
			
		}else {
			System.out.println("TC Failed");
			
		}
       
    
			
			
		
	}

}
