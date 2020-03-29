package newPractice;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class HomePage extends Base {
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=InitializeDriver();
		driver.get("URL");
	}
	
	@Test(dataProvider = "getData")
	public void HomePageNavigation(String uname, String pwd) throws IOException
	{
		
		LandingPage lp = new LandingPage(driver);
		lp.getLogin().click(); 
		
		LoginPage lp1 = new LoginPage(driver);
		lp1.getEmail().sendKeys(uname);
		lp1.getPassword().sendKeys(pwd);
		lp1.getLogin().click();
	}
	
	@AfterTest
	public void CloseBrowser()
	{
		driver.close();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[1][1];
		data[0][0]="nfjfbjf";
		data[0][1]="bcjsc";
		
		data[1][0]="hbvhv";
		data[1][1]="hxbvcv";
		
		return data;
	}

}
