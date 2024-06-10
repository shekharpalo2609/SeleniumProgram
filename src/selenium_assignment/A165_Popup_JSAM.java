//Demonstrate a code for Java script pop up, use JSAM application

package selenium_assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class A165_Popup_JSAM {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/91809/OneDrive/Documents/learningHTML1.html");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.close();
		
	}

}
