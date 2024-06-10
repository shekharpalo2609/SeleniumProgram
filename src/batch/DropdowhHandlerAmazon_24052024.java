package batch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdowhHandlerAmazon_24052024 {

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
