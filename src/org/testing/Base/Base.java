package org.testing.Base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

	
	public ChromeDriver driver;
	public Properties pr;
	
	@BeforeMethod
	public void launch() throws InterruptedException, IOException {
		//browser launch +url hit +maximize    @BeforeMethod
		      
		File f=new File ("../YTFramework/Object.properties");
		FileReader fr=new FileReader(f);
		pr=new Properties();
		pr.load(fr);                         //read a file 
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
				driver.get("https://www.youtube.com");	
				driver.manage().window().maximize();
				Thread.sleep(2000);
	}
	
	
	@AfterMethod
	
	public void close()
		{
					//browser close   @AfterMethod
					driver.close();
		}
}
