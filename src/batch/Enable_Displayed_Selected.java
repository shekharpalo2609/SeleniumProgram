package batch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enable_Displayed_Selected {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement search =  driver.findElement(By.name("q"));
		boolean answer1 = search.isDisplayed();
		boolean answer2 = search.isEnabled();
		if(answer1 && answer2) {
			search.sendKeys("India");
		}
		
		
		
	}

}
