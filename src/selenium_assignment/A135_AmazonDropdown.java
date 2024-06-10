package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Demonstrate a program on drop down, use Amazon.in, use all three methods of Select class

public class A135_AmazonDropdown {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement allDropdown = driver.findElement(By.id("searchDropdownBox"));
		
		Select s1 = new Select(allDropdown);
		s1.selectByVisibleText("Electronics");
		s1.selectByValue("search-alias=beauty");
		s1.selectByIndex(2);
	}

}
