package demo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException,UnknownHostException {
		// TODO Auto-generated method stub
		WebDriver webDriver = new ChromeDriver()
;
		webDriver.get("http://www.deadlinkcity.com/");
		
		Thread.sleep(1000);
		List<WebElement> links =webDriver.findElements(By.tagName("a"));
		System.out.println("totla no links:"+ links.size());
	    int brokenlinks=0,notBroken=0;
	    
		for(WebElement link:links)
		{ 
			
		   String  hrefValue = 	link.getDomAttribute("href");
			try{
			{
			if((link.getDomAttribute("href").trim().isEmpty())||(link.getDomAttribute("href").equals("")))
			{
				System.out.println(hrefValue+" Broken link");
				brokenlinks++;
			}
			else
			{
				URL url = new URL(link.getAttribute("href"));
				
				HttpURLConnection urlConnection = 	(HttpURLConnection) url.openConnection();
				urlConnection.connect();
				if(urlConnection.getResponseCode()>=400) {
					brokenlinks++;
					System.out.println(hrefValue+" Broken link");
				}
				else {
					System.out.println(hrefValue+" Not broken link");
					notBroken++;
				}

	
			}}
		}catch(Exception e) {
	    	brokenlinks++;
	    	StackTraceElement[] stackTrace = e.getStackTrace();
            System.err.println(e.getLocalizedMessage());
        	System.out.println("--------------------------------------------");

	        for (StackTraceElement element : stackTrace) {

	        	System.out.println("Line number: " + element.getLineNumber());
	            System.out.println("File name: " + element.getFileName());
	            System.out.println("Method name: " + element.getMethodName());

	        }
        	System.out.println("--------------------------------------------");

	    }
		}
	    
		System.out.println("Number of broken links "+brokenlinks);
	
		System.out.println("Number of not broken links "+notBroken);

		webDriver.close();
	}

}
