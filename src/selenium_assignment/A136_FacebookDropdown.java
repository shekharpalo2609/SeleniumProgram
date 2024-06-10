package selenium_assignment;

//Demonstrate a program on dropdown, use Facebook.in and select dropdown for date, month and year when creating account

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A136_FacebookDropdown {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();

		WebElement day = driver.findElement(By.id("day"));
		Select selectDay = new Select(day);
		selectDay.selectByVisibleText("10");

		WebElement month = driver.findElement(By.id("month"));
		Select selectMonth = new Select(month);
		selectMonth.selectByIndex(2);

		WebElement year = driver.findElement(By.id("year"));
		Select selectYear = new Select(year);
		selectYear.selectByValue("2006");

		driver.close();

	}

}
