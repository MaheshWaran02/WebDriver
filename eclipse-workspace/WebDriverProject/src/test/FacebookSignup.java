package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		
		WebElement Signup = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		
		Signup.click();
		
		WebElement name = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		WebElement password = driver.findElement(By.xpath("//input[@data-type='password']"));
		
		
		
		
	
		
		name.sendKeys("mahesh");
		lastname.sendKeys("earan");
		email.sendKeys("ABC@XYZ.xom");
		password.sendKeys("11212mmma");
		
		
		WebElement selectedday = driver.findElement(By.xpath("//select[@title='Day']/option[@selected='1']"));
		System.out.println("the selected day is " + selectedday.getText() );
		
		
		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		Select ddDay = new Select(day);
		ddDay.selectByVisibleText("2");
		
		
		WebElement selectemonth = driver.findElement(By.xpath("//select[@title='Month']/option[@selected='1']"));
		System.out.println("the select month is " + selectemonth.getText());
		
		
		WebElement Month = driver.findElement(By.xpath("//select[@title='Month']"));
		Select ddMonth = new Select(Month);
		ddMonth.selectByVisibleText("Feb");
		
		WebElement selecteYear = driver.findElement(By.xpath("//select[@title='Year']/option[@selected='1']"));
		System.out.println("the select year is " + selecteYear.getText());

		WebElement Year = driver.findElement(By.xpath("//select[@title='Year']"));
		Select ddYear = new Select(Year);
		ddYear.selectByVisibleText("2000");
		
		List<WebElement> list=driver.findElements(By.xpath("//select[@title='Month']/option"));
		for(WebElement month:list) {
			System.out.println(month.getText());
		}
		
		
		WebElement Female = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
		Female.click();

        
		String Gender = "Male";
        String dummyXpath = "//label[text()='" + Gender + "']";
		WebElement genderElem = driver.findElement(By.xpath(dummyXpath));
		genderElem.click();

		List<WebElement> list1=driver.findElements(By.xpath("//select[@title='Day']/option"));
		for(WebElement gender:list1) {
			System.out.println(gender.getText());
		}


	}

}
