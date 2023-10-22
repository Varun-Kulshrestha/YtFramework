package org.testing.TestScripts;

import java.io.IOException;

import org.testing.Base.Base;
import org.testing.Pages.Homepage;
import org.testing.Pages.Loginpage;
import org.testing.Pages.Logoutpage;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.Test;



public class TC1 extends Base{

	// login + trending+ logout
		
		
	@Test
	public void ClickOnTrending() throws InterruptedException, IOException
	{
		Loginpage login=new Loginpage(driver,pr);                         //login
		login.signin("varunkulshrestha25@gmail.com","I@wedsq123Q"); 
		
		ScreenshotCapture.takeScreenshot(driver, "D://Screenshots//LoginforTc1.png");
		LogsCapture.takeLogs("TC1", "login successfully for TC1");
		
		Homepage home=new Homepage(driver,pr);                          //trending
		home.Trending();
		

		ScreenshotCapture.takeScreenshot(driver, "D://Screenshots//TrendingforTc1.png");
		LogsCapture.takeLogs("TC1", "Click trending successfully for TC1");
		
		Logoutpage logout=new Logoutpage(driver,pr);                    //logout
		logout.signout();
		
    	ScreenshotCapture.takeScreenshot(driver, "D://Screenshots//LogoutforTc1.png");
		LogsCapture.takeLogs("TC1", "logout successfully for TC1");
	}
			
	
}
