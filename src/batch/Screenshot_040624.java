package batch;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_040624 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		WebElement searchBox = driver.findElement(By.id("APjFqb"));
		searchBox.sendKeys("India");

		TakesScreenshot a = driver;
		a.getScreenshotAs(OutputType.FILE);
		
		
		
	}
}
