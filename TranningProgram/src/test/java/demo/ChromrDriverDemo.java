package demo;

public class ChromrDriverDemo extends ChrommiumDriverDemo {
	
	public void showChromeDriverDemo() {
		System.out.println("Chrome WebDriver Demo class");
	}
	public static void main(String[] args) {
		
		WebDriverDemo r =new ChromrDriverDemo();
		r.a=80;
		JavaScriptExecutorDemo j = (JavaScriptExecutorDemo)r;
		j.takeScreenshot();
		
		WebDriverDemo w = (WebDriverDemo)j;
		System.out.println("vlaue of a after downcasting"+w.a);
		
		
	
	
	}

}
