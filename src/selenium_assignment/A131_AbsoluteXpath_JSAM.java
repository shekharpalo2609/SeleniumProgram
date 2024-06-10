//locate each component of JSAM application using absolute xpath(excluding dropdown and disable)

package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A131_AbsoluteXpath_JSAM {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/91809/OneDrive/Documents/learningHTML1.html");
		driver.manage().window().maximize();

		WebElement userName = driver.findElement(By.xpath("(/html/body/input)[1]"));
		userName.sendKeys("shekhar");

		WebElement hint = driver.findElement(By.xpath("(/html/body/input)[2]"));
		hint.sendKeys("name");

		WebElement password = driver.findElement(By.xpath("(/html/body/input)[3]"));
		password.sendKeys("pwd");

		WebElement firstName = driver.findElement(By.xpath("(/html/body/form/input)[1]"));
		firstName.sendKeys("shekhar");

		WebElement checkBox1 = driver.findElement(By.xpath("(/html/body/form/input)[4]"));
		checkBox1.click();

		WebElement maleRadioBox = driver.findElement(By.xpath("(/html/body/input)[4]"));
		maleRadioBox.click();

		WebElement relocateCheckbox = driver.findElement(By.xpath("(/html/body/input)[6]"));
		relocateCheckbox.click();

	}

}
