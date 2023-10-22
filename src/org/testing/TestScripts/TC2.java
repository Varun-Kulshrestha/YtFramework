package org.testing.TestScripts;

import java.io.IOException;

import org.testing.Base.Base;
import org.testing.Pages.Homepage;
import org.testing.Pages.Loginpage;
import org.testing.Pages.Logoutpage;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.Test;

public class TC2 extends Base{
	
	//login+click on history +Logout
	
	@Test
	public void ClickOnHistory() throws InterruptedException, IOException
	{
		Loginpage login=new Loginpage(driver,pr);                      //login
		login.signin("varunkulshrestha25@gmail.com","I@wedsq123Q");
		
		ScreenshotCapture.takeScreenshot(driver, "D://Screenshots//LoginforTc2.png");
		LogsCapture.takeLogs("TC2", "login successfully for TC2");
		
		
		Homepage home=new Homepage(driver,pr);     //history
		home.History();
		
		ScreenshotCapture.takeScreenshot(driver, "D://Screenshots//HistoryforTc2.png");
		LogsCapture.takeLogs("TC2", "History page successfully click TC2");
		
		Logoutpage logout=new Logoutpage(driver,pr);             //logout
		logout.signout();
		
		ScreenshotCapture.takeScreenshot(driver, "D://Screenshots//LogoutforTc2.png");
		LogsCapture.takeLogs("TC2", "logout successfully for TC2");
	}
}
