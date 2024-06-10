package batch;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		/*
		 * driver.manage().window().maximize(); driver.getw Thread.sleep(2000);
		 */driver.close();
	}

}
