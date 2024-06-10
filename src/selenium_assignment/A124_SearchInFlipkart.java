/*
Automate below scenario
1.launch browser
2.goto other website like amazon/flipcart
3.type "shoes" on search textfield
4.click on search button
 */

package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.chrome.ChromeDriver;

public class A124_SearchInFlipkart {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("shoes");
		searchBox.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		driver.quit();
	}

}
