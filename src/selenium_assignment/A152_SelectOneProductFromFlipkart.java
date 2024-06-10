//Without login to flipkart, search for shoe and select first shoe

package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A152_SelectOneProductFromFlipkart {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		searchBox.sendKeys("shoe");
		searchBox.sendKeys(Keys.ENTER);
		
		WebElement firstShoe = driver.findElement(By.xpath("(//div[@class='gqcSqV YGE0gZ'])[1]"));
		firstShoe.click();
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
