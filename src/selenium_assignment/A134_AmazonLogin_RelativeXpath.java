package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Login to  Amazon Application using Relative Xpath.

public class A134_AmazonLogin_RelativeXpath {

	public static void main(String[] args) {
			
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D155259813113%26hvpone%3D%26hvptwo%3D%26hvadid%3D674842289479%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D10941065062317175544%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9301513%26hvtargid%3Dkwd-304880464215%26hydadcr%3D14450_2316420%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("(//input)[7]"));
		email.sendKeys("ShekharPalo@gmail.com");
		
		WebElement continueButton = driver.findElement(By.xpath("(//input)[10]"));
		continueButton.click();
		
		
	}

}
