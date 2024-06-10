//Automate https://grotechminds.com/registration/ reach till file upload option

package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A167_Grotechminds_Registration {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();

		WebElement firstName = driver.findElement(By.id("fname"));
		firstName.sendKeys("Shekhar");

		WebElement lastName = driver.findElement(By.id("lname"));
		lastName.sendKeys("Palo");

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("paloskr26@gmail.com");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("skr@123");

		WebElement maleRadioBox = driver.findElement(By.id("male"));
		maleRadioBox.click();

		WebElement skills = driver.findElement(By.id("Skills"));
		Select selectSkills = new Select(skills);
		selectSkills.selectByValue("select1");

		WebElement country = driver.findElement(By.id("Country"));
		Select selectCountry = new Select(country);
		selectCountry.selectByVisibleText("India");

		WebElement presentAddress = driver.findElement(By.id("Present-Address"));
		presentAddress.sendKeys("Mumbai");

		WebElement permanentAddress = driver.findElement(By.id("Permanent-Address"));
		permanentAddress.sendKeys("Mumbai");

		WebElement pincode = driver.findElement(By.name("Pincode"));
		pincode.sendKeys("421555");

		WebElement religion = driver.findElement(By.id("Relegion"));
		Select selectReligion = new Select(religion);
		selectReligion.selectByIndex(1);

		WebElement chooseFile = driver.findElement(By.className("file"));
		chooseFile.sendKeys("C:\\Documents\\Academic documets\\SSC Marksheet.png");

		WebElement relocateCheckBox = driver.findElement(By.name("relocate"));
		relocateCheckBox.click();

		WebElement submit = driver.findElement(By.xpath("//button[@value='Submit']"));
		submit.click();
		// driver.switchTo().alert().accept();

		System.out.println("END");
	}

}
