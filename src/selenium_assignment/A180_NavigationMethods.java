//Demonstrate a code for Navigate method of driver back(), forward(), refresh() and to()

package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A180_NavigationMethods {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.className("gLFyf"));
		search.sendKeys("India");
		Thread.sleep(2000);

		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
		System.out.println("END");
		
	}

}