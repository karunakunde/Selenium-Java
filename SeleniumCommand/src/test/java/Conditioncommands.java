import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditioncommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver webDriver = new ChromeDriver();
		
		webDriver.get("https://omayo.blogspot.com/");
		
		WebElement textArea = webDriver.findElement(By.id("ta1"));
		if(textArea.isDisplayed()) {
			textArea.sendKeys("Yes textarea is displayed on page.");
			System.out.println(" Yes textarea is displayed on page.");

			}
		else
			System.out.println(" Yes textarea is not displayed on page.");

		
		WebElement button1 = webDriver.findElement(By.id("but1"));
		
		if(button1.isEnabled()) {
			button1.click();
			System.out.println(button1.getText()+" enabled");

		}
		else
			System.out.println(button1.getText()+" not enbaled");
		
		WebElement button2 = webDriver.findElement(By.id("but2"));
		
		if(button2.isEnabled()) {
			button2.click();
			System.out.println(button2.getText()+" enabled");

		}
		else
			System.out.println(button2.getText()+" not enbaled");
		
		
		WebElement checkbox2 = webDriver.findElement(By.id("checkbox2"));
		
		if(checkbox2.isSelected()) {
			System.out.println("before click status :"+ checkbox2.isSelected()+ "--Selected");
			checkbox2.click();
			System.out.println("after click status :"+ checkbox2.isSelected()+ "--Not Selected");

		}
		else {
			System.out.println("before click status :"+ checkbox2.isSelected()+ "--Not Selected");
			checkbox2.click();
			System.out.println("after click status :"+ checkbox2.isSelected()+ "--Selected");
		}
		

	}

}
