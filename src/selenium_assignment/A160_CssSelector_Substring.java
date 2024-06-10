//Demonstrate CSS locator program on TN[AN^='Sub String of AV']

package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A160_CssSelector_Substring {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement search = driver.findElement(By.cssSelector("input.Pke_EE[title^='Search for Prod']"));
		search.sendKeys("travel");
		
		Thread.sleep(2000);
		driver.close();
	}

}
