package org.testing.utilities;

import org.apache.log4j.xml.DOMConfigurator;
import org.apache.log4j.Logger;



public class LogsCapture {
public static void takeLogs(String classname, String message)
{
	DOMConfigurator.configure("../YTFramework/layout.xml");   //layout path
    Logger L = Logger.getLogger(classname);	
    L.info(message);

}
}
