package facebookBase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LinkTest extends BaseTest{

	@BeforeMethod(groups="Smoke")
	public void initializeTest() {
		openApplication();
	
	}
	
	@Test(priority=0, groups="Smoke")
	public void messengerLinkTest() {
		driver.findElement(By.linkText("Messenger")).click();
		
		//title validation==AsserEquals
		String ActualTitle="Messenger";
		String expectedTitle=driver.getTitle();
		System.out.println(" Developers Title:  "+expectedTitle);
		Assert.assertEquals(ActualTitle, expectedTitle);
		
	}
	
	@Test(priority=1)
	public void espanolLinkTest() {
		driver.findElement(By.linkText("Español")).click();
		
		//title validation==AsserEquals
		String ActualTitle="Facebook - Inicia sesión o regístrate";
		String expectedTitle=driver.getTitle();
		System.out.println(" Developers Title:  "+expectedTitle);
		Assert.assertEquals(ActualTitle, expectedTitle);
		
	}
	
   @AfterMethod(groups="Smoke")
	void tearDownTest() {
		closeApplication();
	}

}
