//Launch google, search Mumbai and take a screenshot with your name and current time

package selenium_assignment;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class A169_Screenshot_Name_CurrentDate {

	public static void main(String[] args) throws IOException, InterruptedException {

		final String name = "Shekhar";

		Date date1 = new Date();
		Date currentDate = new Date(date1.getTime());
		String dateInString = currentDate.toString().replace(":", "_");
		/*
		 * String dateWithUnderscore = dateInString.replace(":", "_");
		 * System.out.println(dateWithUnderscore);
		 */
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		WebElement searchBar = driver.findElement(By.cssSelector("#APjFqb")); // #ID_value
		searchBar.sendKeys("Mumbai");
		searchBar.sendKeys(Keys.ENTER);

		TakesScreenshot screenshot = driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\91809\\OneDrive\\Desktop\\gtm_screenshot\\google_" + name + dateInString + ".png");
		FileHandler.copy(source, destination);
		
		Thread.sleep(2000);
		driver.close();
		System.out.println("END");
	}

}
