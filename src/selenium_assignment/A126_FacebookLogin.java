/*
Demonstrate a program for facebool.com launch > 
enter email and pass with help of id locator
 */

package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class A126_FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("shekhar");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("shekhar");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		Thread.sleep(2000);
		driver.close();
	}

}
