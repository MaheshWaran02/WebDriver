package test;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		
		
		List<WebElement> Rows = driver.findElements(By.cssSelector("table#customers>tbody>tr"));
		System.out.println("the total number of rows " + Rows.size());
		
		
		List<WebElement> coloums = driver.findElements(By.xpath("//table[@id='customers']//th"));
		System.out.println("the total number of coloums "  + coloums.size());
		
		
		WebElement data = driver.findElement(By.xpath("//table[@id='customers']//tr[4]/td[1]"));
		System.out.println("the data of 3 element " + data.getText());
		
		
		for (int i=2;i<=Rows.size();i++) {
			List<WebElement> coloumsdata = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[" + i + "]/td"));
	        System.out.println(coloumsdata.get(0).getText() + "  " + coloumsdata.get(1).getText() + "  " + coloumsdata.get(2).getText());
	        
	       
			
		}

	}

}
