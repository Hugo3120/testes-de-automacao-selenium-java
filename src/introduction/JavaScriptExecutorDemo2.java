package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");//comando para rolar barra de tarefa pego no console da pagina
		Thread.sleep(3000);
		List <WebElement>values=driver.findElements(By.cssSelector(".left-align td:nth-child(3)"));
		int sum=0;
		for(int i=0;i<values.size();i++) {
		sum = sum + Integer.parseInt(values.get(i).getText());
		
		}
		System.out.println(sum);

	}

}
