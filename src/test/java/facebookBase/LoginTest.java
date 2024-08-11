package facebookBase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	@BeforeMethod(groups="Smoke")
	public void initializeTest() {
		openApplication();
	
	}
	
	@Test(priority=0, groups="Smoke")
	private void validLoginTest() {
		driver.findElement(By.id("email")).sendKeys("u@gmail.com");
		//driver.findElement(By.id("email")).sendKeys("jklkjkjl");
		driver.findElement(By.name("pass")).sendKeys("jhjk");
		driver.findElement(By.name("login")).click();
		String actualTitle="Log into Facebook";
		String expectedTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		
		Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle));
		        
		
	}
	
	@Test(priority=1)
	private void invalidLoginTest() {
		driver.findElement(By.id("email")).sendKeys("b@gmail.com");
		//driver.findElement(By.id("email")).sendKeys("jklkjkjl");
		driver.findElement(By.name("pass")).sendKeys("jhjk");
		driver.findElement(By.name("login")).click();
		String actualTitle="Log into Facebook";
		String expectedTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		
		Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle));
		        
		
	}
	
	
	@AfterMethod(groups="Smoke")
	void tearDownTest() {
		closeApplication();
	}

}
