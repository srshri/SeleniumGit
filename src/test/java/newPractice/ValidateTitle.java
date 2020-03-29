package newPractice;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class ValidateTitle extends Base {
	
	public static Logger log=LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=InitializeDriver();
		driver.get("URL");
	}
	
	@Test
	public void HomePageNavigation() throws IOException
	{
		driver=InitializeDriver();
		driver.get("URL");
		
		LandingPage lp = new LandingPage(driver);
		Assert.assertEquals(lp.getTitle().getText(),"Featured Courses");
		
	}
	
	@AfterTest
	public void CloseBrowser()
	{
		driver.close();
	}
	

}
