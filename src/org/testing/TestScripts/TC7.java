package org.testing.TestScripts;

import java.io.IOException;

import org.testing.Base.Base;
import org.testing.Pages.Homepage;
import org.testing.Pages.Loginpage;
import org.testing.Pages.Logoutpage;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.Test;

public class TC7 extends Base
{
	//login+click on watch later +Logout
	
	@Test
	public void ClickOnWatchLater() throws InterruptedException, IOException
	{
		Loginpage login=new Loginpage(driver,pr);                   //login
		login.signin("varunkulshrestha25@gmail.com","I@wedsq123Q");
		
		ScreenshotCapture.takeScreenshot(driver, "D://Screenshots//LoginforTc7.png");
		LogsCapture.takeLogs("TC7", "login successfully for TC7");
		
		Homepage home=new Homepage(driver,pr);              //watchlater
		home.watchlater();
		
		ScreenshotCapture.takeScreenshot(driver, "D://Screenshots//WatchlaterforTc7.png");
		LogsCapture.takeLogs("TC7", "Click on Watch later successfully for TC7");
		
		Logoutpage logout=new Logoutpage(driver,pr);            //logout
		logout.signout();
		
		ScreenshotCapture.takeScreenshot(driver, "D://Screenshots//LogoutforTc7.png");
		LogsCapture.takeLogs("TC7", "logout successfully for TC7");
	}
		
}
