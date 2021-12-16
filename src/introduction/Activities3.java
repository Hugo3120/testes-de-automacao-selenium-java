package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activities3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.findElement(By.cssSelector("a[href*='loadAjax']")).click();
		WebDriverWait p =new WebDriverWait(driver,15);
		p.until(ExpectedConditions.elementToBeClickable(By.id("results")));
		System.out.println(driver.findElement(By.id("results")).getText());
		
		

	}

}
