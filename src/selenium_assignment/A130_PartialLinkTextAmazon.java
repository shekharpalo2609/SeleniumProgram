//Demonstrate a code for Partial linktext locator use amazon application and click bestsellers

package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class A130_PartialLinkTextAmazon {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement bestSeller = driver.findElement(By.partialLinkText("Best"));
		bestSeller.click();
		
	}

}
