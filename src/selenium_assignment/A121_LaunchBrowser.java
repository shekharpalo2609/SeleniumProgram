//Install selenium and demonstrate a basic program to launch empty browser

package selenium_assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class A121_LaunchBrowser {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

	}

}
