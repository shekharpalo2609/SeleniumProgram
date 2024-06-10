package automation_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SauceDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		
		WebElement userName = driver.findElement(By.cssSelector("[id='user-name']"));
		userName.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.cssSelector("[id='password']"));
		password.sendKeys("secret_sauce");
		
		WebElement login = driver.findElement(By.cssSelector("[id='login-button']"));
		login.click();

		WebElement sortingButton = driver.findElement(By.cssSelector(".product_sort_container"));
		Select select= new Select(sortingButton);
		select.selectByIndex(0);
		
		
		
		Thread.sleep(2000);
		driver.close();
		System.out.println("END");
		
	}

}
