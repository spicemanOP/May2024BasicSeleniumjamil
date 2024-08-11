package facebookLinks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LinkTest {
	WebDriver driver;
	@BeforeTest
	public void openApplication(){
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@AfterTest
	public void closeApplication() {
		driver.quit();
	}
	
	@Test
	public void espanolLinkTest() {
		driver.findElement(By.linkText("Español")).click();
		
		//title validation==AsserEquals
		String ActualTitle="Facebook - Inicia sesión o regístrate";
		String expectedTitle=driver.getTitle();
		System.out.println(" Developers Title:  "+expectedTitle);
		Assert.assertEquals(ActualTitle, expectedTitle);
		
	}
	
	@Test
	public void hindiLinkTest() {
		driver.findElement(By.linkText("हिन्दी")).click();
		
		String actualTitle="Facebook - लॉग इन या साइन अप करें";
	    String expectedTitle=driver.getTitle();
	    System.out.println(expectedTitle);
	    Assert.assertEquals(actualTitle, expectedTitle);
		
	}

}
