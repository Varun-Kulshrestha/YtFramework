package org.testing.TestScripts;


import java.io.IOException;

import org.testing.Base.Base;
import org.testing.Pages.Homepage;
import org.testing.Pages.Loginpage;
import org.testing.Pages.Logoutpage;
import org.testing.Pages.Videoplaypage;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.Test;

public class TC5 extends Base{
	//login+ play video + channel subscribe +Logout
	
	@Test
	public void SubscribeChannel() throws InterruptedException, IOException
	{
		Loginpage login=new Loginpage(driver,pr);                         //login
		login.signin("varunkulshrestha25@gmail.com","I@wedsq123Q");
		
		ScreenshotCapture.takeScreenshot(driver, "D://Screenshots//LoginforTc5.png");
		LogsCapture.takeLogs("TC5", "login successfully for TC5");
				
		Homepage home=new Homepage(driver,pr);                
		home.videoplay();
		
		Videoplaypage play=new Videoplaypage(driver, pr);          //subscribe
		play.subscribe();
		
		ScreenshotCapture.takeScreenshot(driver, "D://Screenshots//SubscribeforTc5.png");
		LogsCapture.takeLogs("TC5", "Subscribe successfully for TC5");
		
		Logoutpage logout=new Logoutpage(driver,pr);             //logout
		logout.signout();
		
		ScreenshotCapture.takeScreenshot(driver, "D://Screenshots//LogoutforTc5.png");
		LogsCapture.takeLogs("TC5", "logout successfully for TC5");
	}
	}
