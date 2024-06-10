//Selenium program to get title of browser
package selenium_assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class A122_BrowserTitle {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

	}
}
