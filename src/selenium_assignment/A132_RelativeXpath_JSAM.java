package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
locate each component of JSAM application using relative xpath(excluding dropdown and disable)
*/
public class A132_RelativeXpath_JSAM {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/91809/OneDrive/Documents/learningHTML1.html");
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.xpath("(//input)[1]"));
		userName.sendKeys("shekhar");
		
		WebElement hint = driver.findElement(By.xpath("(//input)[2]"));
		hint.sendKeys("name");
		
		WebElement password = driver.findElement(By.xpath("(//input)[3]"));
		password.sendKeys("pwd");
		
		WebElement firstName = driver.findElement(By.xpath("(//input)[4]"));
		firstName.sendKeys("shekhar");
		
		WebElement checkBox1 = driver.findElement(By.xpath("(//input)[7]"));
		checkBox1.click();
		
		WebElement maleRadioBox = driver.findElement(By.xpath("(//input)[11]"));
		maleRadioBox.click();
		
		WebElement relocateCheckbox = driver.findElement(By.xpath("(//input)[13]"));
		relocateCheckbox.click();
		
		
		
	}

}
