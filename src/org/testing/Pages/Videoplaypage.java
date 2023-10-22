package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Videoplaypage {

	ChromeDriver driver;
	Properties pr;
	
	public Videoplaypage(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	public void like() throws InterruptedException
	{
		driver.findElement(By.xpath(pr.getProperty("like"))).click();
		Thread.sleep(2000);
		
	}
	
	public void subscribe() throws InterruptedException
	{
		driver.findElement(By.xpath(pr.getProperty("subscribe"))).click();
		Thread.sleep(2000);   
		
	}
	
	
	public void comment (String entercomment) throws InterruptedException
	{
		Actions ac=new Actions(driver);  //to perform dropdown handling using action class
		   for(int i=0;i<22;i=i+1)
		   {
			   ac.sendKeys(Keys.TAB).perform();   //for non modifiers (sendKeys)
			   Thread.sleep(2000);
			   
		   } 
		driver.findElement(By.xpath(pr.getProperty("comment"))).click();
		driver.findElement(By.xpath(pr.getProperty("givereply"))).sendKeys(entercomment);
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//button[@aria-label='Comment']")).click();
		 Thread.sleep(2000);
		  
	
	}
	

}


