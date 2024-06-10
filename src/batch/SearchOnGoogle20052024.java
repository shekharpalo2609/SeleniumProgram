package batch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchOnGoogle20052024 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement searchBox = driver.findElement(By.id("APjFqb"));
		searchBox.sendKeys("India");
		
		WebElement searchButton = driver.findElement(By.name("btnK"));
		searchButton.click();
		
		Thread.sleep(3000);
		driver.close();
	}

}
