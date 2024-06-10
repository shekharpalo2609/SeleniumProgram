package selenium_assignment;
//Launch the Flipkart.com Hover over the fashion and click the men's t-shirts

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class A138_HoveroverFlipkart {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
 		
		WebElement fashionHoverover = driver.findElement(By.xpath("(//div[@class='YBLJE4'])[3]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(fashionHoverover).perform();

		WebElement mensTshirt = driver.findElement(By.linkText("Men's T-Shirts"));
		mensTshirt.click();
		
		Thread.sleep(2000);
		driver.close();
		System.out.println("End");
		
	}

}
