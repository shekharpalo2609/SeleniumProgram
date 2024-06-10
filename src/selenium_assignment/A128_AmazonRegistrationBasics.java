//Register yourself on amazon application with use id and name locators

package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A128_AmazonRegistrationBasics {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_ya_signin%26adgrpid%3D155259815513%26hvpone%3D%26hvptwo%3D%26hvadid%3D674842289437%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D18162065601380913058%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9301513%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2316415%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();

		WebElement createAccount = driver.findElement(By.id("createAccountSubmit"));
		createAccount.click();

		WebElement nameField = driver.findElement(By.id("ap_customer_name"));
		nameField.sendKeys("shekhar");

		WebElement mobileNumber = driver.findElement(By.id("ap_phone_number"));
		mobileNumber.sendKeys("1234567890");

		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("1234567890");

		Thread.sleep(2000);
		driver.close();

	}

}
