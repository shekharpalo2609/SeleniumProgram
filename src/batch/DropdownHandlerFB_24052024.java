package batch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandlerFB_24052024 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();

		WebElement day = driver.findElement(By.id("day"));
		Select selectDay = new Select(day);
		selectDay.selectByValue("22");

		WebElement month = driver.findElement(By.id("month"));
		Select selectMonth = new Select(month);
		selectMonth.selectByValue("8");

		WebElement year = driver.findElement(By.id("year"));
		Select selectYear = new Select(year);
		selectYear.selectByValue("2000");

	}

}
