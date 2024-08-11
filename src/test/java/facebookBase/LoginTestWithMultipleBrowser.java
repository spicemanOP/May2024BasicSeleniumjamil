package facebookBase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestWithMultipleBrowser extends BaseTestWithIfandElse{
	
	@BeforeMethod
	public void openTest() {

		openApplication();
	}
	
	@Test
	public void loginTest() {
		driver.findElement(By.id("email")).sendKeys("u@gmail.com");
		//driver.findElement(By.id("email")).sendKeys("jklkjkjl");
		driver.findElement(By.name("pass")).sendKeys("jhjk");
		driver.findElement(By.name("login")).click();
		String actualTitle="Log into Facebook";
		String expectedTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		
		Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle));
	
	}
	
	@AfterMethod
	public void closeTest() {
		closeApplication();
	
	}

}
