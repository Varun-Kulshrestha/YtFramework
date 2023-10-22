package org.testing.TestScripts;

import java.io.IOException;

import org.testing.Base.Base;
import org.testing.Pages.Homepage;
import org.testing.Pages.Loginpage;
import org.testing.Pages.Logoutpage;
import org.testing.Pages.Videoplaypage;
import org.testing.assertions.Assertt;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.Test;

public class DemoTc extends Base{

	@Test
	public void Demo() throws InterruptedException, IOException
	{
		Loginpage login=new Loginpage(driver,pr);
		login.signin("varunkulshrestha25@gmail.com","I@wedsq123Q");
		
		ScreenshotCapture.takeScreenshot(driver, "D://Screenshots//first.png");
		LogsCapture.takeLogs("DemoTc", "login successfully for DemoTC");
		
		Assertt.assertion(driver.getCurrentUrl(),"https://www.youtube.com/");
		
		Homepage home=new Homepage(driver,pr);
		home.videoplay();
		
		Videoplaypage play=new Videoplaypage(driver, pr);
		play.comment("what a performance");
		
		
		Logoutpage logout=new Logoutpage(driver,pr);
		logout.signout();
	}
	
	 
}

