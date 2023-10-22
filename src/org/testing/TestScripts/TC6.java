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

public class TC6 extends Base {
	//login+video play + comment +Logout
	
	@Test
	public void CommentOnVideo() throws InterruptedException, IOException
	{
		Loginpage login=new Loginpage(driver,pr);                           //login
		login.signin("varunkulshrestha25@gmail.com","I@wedsq123Q");
		
		ScreenshotCapture.takeScreenshot(driver, "D://Screenshots//LoginforTc6.png");
		LogsCapture.takeLogs("TC6", "login successfully for TC6");
		
	
		Homepage home=new Homepage(driver,pr);
		home.videoplay();
		
		Videoplaypage play=new Videoplaypage(driver, pr);              //comment
		play.comment("what a performance");     
		
		ScreenshotCapture.takeScreenshot(driver, "D://Screenshots//CommentforTc6.png");
		LogsCapture.takeLogs("TC6", "comment successfully for TC6");
		
		
		Logoutpage logout=new Logoutpage(driver,pr);            //logout
		logout.signout();
		
		ScreenshotCapture.takeScreenshot(driver, "D://Screenshots//LogoutforTc6.png");
		LogsCapture.takeLogs("TC6", "logout successfully for TC6");
	}
	
}
