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

public class TC4 extends Base {
	
	//login+play video + like +Logout
	
	@Test
	public void Likevideo() throws InterruptedException, IOException
	{
		Loginpage login=new Loginpage(driver,pr);                    //login
		login.signin("varunkulshrestha25@gmail.com","I@wedsq123Q");
		
		ScreenshotCapture.takeScreenshot(driver, "D://Screenshots//LoginforTc4.png");
		LogsCapture.takeLogs("TC4", "login successfully for TC4");
		
		
		Homepage home=new Homepage(driver,pr);
		home.videoplay();
		
		Videoplaypage play=new Videoplaypage(driver, pr);          //like    
		play.like();
		
		ScreenshotCapture.takeScreenshot(driver, "D://Screenshots//likevideoforTc4.png");
		LogsCapture.takeLogs("TC4", "Like video successfully for TC4");
		
		Logoutpage logout=new Logoutpage(driver,pr);         //logout
		logout.signout();
		
		ScreenshotCapture.takeScreenshot(driver, "D://Screenshots//LogoutforTc4.png");
		LogsCapture.takeLogs("TC4", "logout successfully for TC4");
	}
		
}
