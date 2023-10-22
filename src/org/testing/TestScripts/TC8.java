package org.testing.TestScripts;

import java.io.IOException;

import org.testing.Base.Base;
import org.testing.Pages.Homepage;
import org.testing.Pages.Loginpage;
import org.testing.Pages.Logoutpage;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.Test;

public class TC8 extends Base {
	//login+Click on library +Logout   
	
	@Test
	public void Clickonlibrary() throws InterruptedException, IOException
	{
		Loginpage login=new Loginpage(driver,pr);                  //login
		login.signin("varunkulshrestha25@gmail.com","I@wedsq123Q");
		
		ScreenshotCapture.takeScreenshot(driver, "D://Screenshots//LoginforTc8.png");
		LogsCapture.takeLogs("TC8", "login successfully for TC8");
		
		
		Homepage home=new Homepage(driver,pr);           //library
		home.library();
		
		ScreenshotCapture.takeScreenshot(driver, "D://Screenshots//LibraryforTc8.png");
		LogsCapture.takeLogs("TC8", "Click on library successfully for TC8");
		
		Logoutpage logout=new Logoutpage(driver,pr);             //logout
		logout.signout();
		
		ScreenshotCapture.takeScreenshot(driver, "D://Screenshots//LogoutforTc8.png");
		LogsCapture.takeLogs("TC8", "logout successfully for TC8");
	}
		}
