package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage {
	
	ChromeDriver driver;
	Properties pr ;
	public Homepage(ChromeDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}

	public void Trending() throws InterruptedException
	{
		driver.findElement(By.linkText("Trending")).click(); //click on trending
		Thread.sleep(2000);
	}
	
	public void History() throws InterruptedException
	{
		driver.findElement(By.linkText("History")).click();   //history
		Thread.sleep(2000);

	}
	
	public void Subscription() throws InterruptedException
	{
		driver.findElement(By.linkText("Subscriptions")).click();   //subscription
		Thread.sleep(2000);
		
	}
 
	public void watchlater() throws InterruptedException
	{
		driver.findElement(By.linkText("Watch later")).click();   
		Thread.sleep(2000);
		
	}
	
	public void library() throws InterruptedException
	{
		driver.findElement(By.linkText("Library")).click();   
		Thread.sleep(2000);
	
	}
	
    public void videoplay() throws InterruptedException
    {
    	driver.findElement(By.id("video-title")).click();       //video play
		Thread.sleep(11000); 

    }
	
	
}
