package batch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		
		WebElement loginButton = driver.findElement(By.className("login_button"));
		loginButton.click();
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("ABC");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("ABC@123");
		
		WebElement captch = driver.findElement(By.name("loginCaptchaValue"));
		captch.sendKeys("ABC@123");
		
		driver.close();
	}

}
