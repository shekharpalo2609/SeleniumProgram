package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Demonstrate a program on how to double click Launch http://google.com/ and Double click on Gmail


public class A140_DoubleClickGmail {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		actions.doubleClick(gmail).perform();
		
		Thread.sleep(2000);
		driver.close();
		System.out.println("end");
	}

}
