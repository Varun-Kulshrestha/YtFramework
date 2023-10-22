package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logoutpage {
	
	ChromeDriver driver;
	Properties pr;
	
	public Logoutpage(ChromeDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	public void signout() throws InterruptedException
	{
		driver.findElement(By.xpath(pr.getProperty("logout"))).click();
		Thread.sleep(2000); 
		driver.findElement(By.linkText("Sign out")).click();     //sign out
		Thread.sleep(6000);
	}
}
