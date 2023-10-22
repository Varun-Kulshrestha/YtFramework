/**
 * 
 */
package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {
	
	ChromeDriver driver;
	Properties pr;
	public Loginpage(ChromeDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}

	public void signin(String user, String pass) throws InterruptedException
	{
		
		driver.findElement(By.linkText("Sign in")).click();   //login
		driver.findElement(By.cssSelector(pr.getProperty("Username"))).sendKeys(user);
		driver.findElement(By.xpath(pr.getProperty("nextpage"))).click();
		Thread.sleep(11000);
		driver.findElement(By.xpath(pr.getProperty("password"))).sendKeys(pass);
		driver.findElement(By.xpath(pr.getProperty("nextpage"))).click();
		Thread.sleep(10000); 
	}
}
