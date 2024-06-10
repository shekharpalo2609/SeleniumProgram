//Demonstrate CSS locator program on google.in and search India use TN[AN='AV']

package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A158_CssSelector_TN_AN_AV {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement searchBox = driver.findElement(By.cssSelector("textarea[class='gLFyf']"));
		searchBox.sendKeys("India");
		
		Thread.sleep(2000);
		driver.close();
	}

}
