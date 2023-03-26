package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		WebElement ScrollTo = driver.findElement(By.xpath("//h2[text()='HTML Exercises']"));
		
		JavascriptExecutor obj = (JavascriptExecutor) driver;
		obj.executeScript("arguments[0].scrollIntoView();", ScrollTo);
		
		
		
		 Thread.sleep(3000);
		
       WebElement Scrollup = driver.findElement(By.xpath("//div[@id='pagetop']")); 
		
		JavascriptExecutor obj1 = (JavascriptExecutor) driver;
		obj1.executeScript("arguments[0].scrollIntoView();", Scrollup);

				
	}

}
