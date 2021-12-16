package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {
	

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			
			//System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver.exe");
			//WebDriver driver = new FirefoxDriver();
			
			//System.setProperty("webdriver.edge.driver","C:\\Program Files\\msedgedriver.exe");
			//WebDriver driver = new EdgeDriver();
			
			driver.get("https://rahulshettyacademy.com");
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.findElement(By.cssSelector("div[class='login-btn']")).click();
			driver.findElement(By.id("user_name")).sendKeys("Hugo leonardo");
			//driver.close();
			//driver.quit();
	
			
			
			
			
	}

}
