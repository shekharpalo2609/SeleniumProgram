//Demonstrate CSS locator with ID program on google.in and search India use id: #ID_value

package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A153_CssSelector_ID {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement searchBox = driver.findElement(By.cssSelector("#APjFqb"));
		searchBox.sendKeys("India");
		
		Thread.sleep(2000);
		driver.close();
	}

}
