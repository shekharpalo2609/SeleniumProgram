//Find out the number of links in page and get the URL of each one of them. also print its link text value. 

package selenium_assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A162_GetTotalLinksInWebsite {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int count = links.size();
		System.out.println("Total links in google page: " + count);

		// getting the URL of each one of them
		for (int i = 0; i < count; i++) {
			WebElement s1 = links.get(i);
			String linkText = s1.getText();
			String attributeValues = s1.getAttribute("href");
			System.out.println(linkText);
			System.out.println(attributeValues);

		}
	}

}