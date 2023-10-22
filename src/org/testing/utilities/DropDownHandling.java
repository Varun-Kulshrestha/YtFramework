package org.testing.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {

	public static void dropDownSelectionBasedUponIndex(WebElement element, int indexNo)
	{
		Select s = new Select(element);
		s.selectByIndex(indexNo);
	}
	
	public static void dropDownSelectionBasedUponValue(WebElement element, String value)
	{
		Select s = new Select(element);
		s.selectByValue(value);
		
	}
	
	public static void dropDownSelectionBasedUponVisibleText(WebElement element, String VisibleText)
	{
		Select s = new Select(element);
		s.selectByVisibleText(VisibleText);
	}
}
