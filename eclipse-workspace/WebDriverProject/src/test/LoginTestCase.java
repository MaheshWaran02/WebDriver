package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.simplilearn.com/");

		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		
		
		System.out.println("the title of page is " + driver.getTitle());
		
		
		
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		String location = LoginLink.getAttribute("href");
		System.out.println("The Link will be take you to " + location);
		LoginLink.click();
		
		
		WebElement Remberme = driver.findElement(By.className("rememberMe"));
		Remberme.click();
		
		
		WebElement Username = driver.findElement(By.name("user_login"));   
		Username.sendKeys("abc@xyz.com");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("123@Abcd");
		
		WebElement LoginbuttonLink = driver.findElement(By.name("btn_login"));
		LoginbuttonLink.click();
		
		
		WebElement error = driver.findElement(By.className("error_msg"));
		String errorMsg = error.getText();
		String expErrorMsg = "The email or password you have entered is invalid.";
		
		
		
		if(error.isDisplayed() && errorMsg.equals(expErrorMsg)) {
			
			System.out.println("TC Passed");
			
		}else {
			System.out.println("TC Failed");
			
		}
		
		List <WebElement> Alllinks = driver.findElements(By.tagName("a"));
		
		System.out.println("The total number of links is " + Alllinks.size());
		
		for (WebElement Link : Alllinks)
		{
			
			System.out.println("All validate Link is " + Link.getAttribute("href"));
		}
		
	

	}

}
