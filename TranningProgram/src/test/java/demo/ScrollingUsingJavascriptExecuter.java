package demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingUsingJavascriptExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("https://demo.guru99.com");
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor)webDriver;
		javascriptExecutor.executeScript("window.scrollBy(0,500)","");
		

	}

}
