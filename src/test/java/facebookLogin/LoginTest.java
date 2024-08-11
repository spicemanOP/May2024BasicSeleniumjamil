package facebookLogin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver;
	
	@BeforeMethod
   public void openApplication() {
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	}
	
	@Test
	void validLoginTest(){
		driver.findElement(By.id("email")).sendKeys("u@umail.com");
		//driver.findElement(By.id("email")).sendKeys("jklkjkjl");
		driver.findElement(By.name("pass")).sendKeys("jhjk");
		driver.findElement(By.name("login")).click();
		
		        //validation
		// expected =actual==pass
		// expected !=actual==fail
		
		String actualTitle="Log into Facebook";
		String expectedTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		
		Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle));
		        
		
	}
	
	@Test
	private void invalidLoginTest() {
		
		driver.findElement(By.id("email")).sendKeys("Asma@umail.com");
		driver.findElement(By.name("pass")).sendKeys("jhjk");
		driver.findElement(By.name("login")).click();
		
		// not equal 	
				String actualTitle="Log into Facebook/Asam";
				                  //Log into Facebook
				String expectedTitle=driver.getTitle();
				
		      Assert.assertNotEquals(actualTitle, expectedTitle);
		      Assert.assertFalse(actualTitle.equals(expectedTitle));
		      
	}
	
	@AfterMethod
	protected void closeApplication() {
		driver.quit();
	}
	

}
