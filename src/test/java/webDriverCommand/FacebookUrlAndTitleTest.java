package webDriverCommand;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookUrlAndTitleTest {
	WebDriver driver;
	
	// open application
	@BeforeTest
	public void openApp() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		//driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	//do login tests
	@Test
	public void titleTest() {
		String actualTitle="Facebook - log in or sign up";
		String expectedTitle =driver.getTitle();
		System.out.println("facebook title is:   "+expectedTitle);
		
		//validation/ assertion
		Assert.assertEquals(expectedTitle,actualTitle,"reasons for failing>>>  ");
		Assert.assertNotEquals(expectedTitle, "hkkjjkjkjk");
		
	}
	@Test
	public void urlTest() {
		String actualUrl="https://www.facebook.com/";
		String expectedUrl=driver.getCurrentUrl();
		System.out.println(" facebook url is>>>  "+expectedUrl);
		//validation/ assertion
		Assert.assertEquals(expectedUrl, actualUrl, " reasons for failing >>> ");
		
	}
	
	
	//close the application
	//@AfterTest
	public void closeApp() {
		driver.quit();
		
	}

}
