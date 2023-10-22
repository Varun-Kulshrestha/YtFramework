package org.testing.TestScripts;

import java.io.IOException;

import org.testing.Base.Base;
import org.testing.Pages.Homepage;
import org.testing.Pages.Loginpage;
import org.testing.Pages.Logoutpage;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.Test;

public class TC3 extends Base
{
	//login+click on subscription +Logout
	
	
	@Test
	public void ClickOnSubscription() throws InterruptedException, IOException
	{
		Loginpage login=new Loginpage(driver,pr);                        //login
		login.signin("varunkulshrestha25@gmail.com","I@wedsq123Q");
		
		ScreenshotCapture.takeScreenshot(driver, "D://Screenshots//LoginforTc3.png");
		LogsCapture.takeLogs("TC3", "login successfully for TC3");
		
		Homepage home=new Homepage(driver,pr);                        //subscription
		home.Subscription();
		
		ScreenshotCapture.takeScreenshot(driver, "D://Screenshots//SubscriptionforTc3.png");
		LogsCapture.takeLogs("TC3", "Successfully click on subscription TC3");
		
		Logoutpage logout=new Logoutpage(driver,pr);                  //logout
		logout.signout();
		
		ScreenshotCapture.takeScreenshot(driver, "D://Screenshots//LogoutforTc3.png");
		LogsCapture.takeLogs("TC3", "logout successfully for TC3");
	}
	
	

}
