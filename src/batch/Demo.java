package batch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.medplusmart.com/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("//input[@class='rbt-input-hint']"));
		search.sendKeys("nexito");
		System.out.println("end");
	}

}
