package demo;

public class RemoteWebDriverDemo extends WebDriverDemo implements JavaScriptExecutorDemo,TakeScreenShotDemo {
	
	public void remoteWebDriverDemo()
	{
		System.out.println("Remote Web Driver Demo class");
	}

	@Override
	public void takeScreenshot() {
		// TODO Auto-generated method stub
		System.out.println("takeScreenshot");

	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("execute");

	}
	}
