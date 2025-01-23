 package action_n_interaction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormSubmission2 {
	
	/*
	 * Exercise 1: Form Submission
URL:https://katalon-demo-cura.herokuapp.com/
- Create a test script that submits a form with valid and invalid data
- Verify that the form submission is successful and the expected error messages are displayed for invalid data
- Use Selenium WebDriver to interact with the form elements (e.g., text boxes, checkboxes, dropdowns)

	 */

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("https://katalon-demo-cura.herokuapp.com/");
		webDriver.manage().window().maximize();
		WebElement makeAppointment = webDriver.findElement(By.id("btn-make-appointment"));
		makeAppointment.click();
		System.out.println(webDriver.getCurrentUrl());
		WebElement m = webDriver.findElement(By.id("btn-make-appointment"));
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(20));

		
        webDriver.findElement(By.xpath("//button[@id='btn-login']")).click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txt-username']")));
        WebElement username = webDriver.findElement(By.xpath("//input[@id='txt-username']"));
       
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txt-password']")));
		WebElement password = webDriver.findElement(By.xpath("//input[@id='txt-password']"));
        username.sendKeys("John Doe");
        Thread.sleep(1000);
        password.sendKeys("ThisIsAPassword");//invalid password
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("//button[@id='btn-login']")).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txt-username']")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txt-password']")));
		password = webDriver.findElement(By.xpath("//input[@id='txt-password']"));

        username = webDriver.findElement(By.xpath("//input[@id='txt-username']"));
        password.sendKeys("ThisIsNotAPassword");
        username.sendKeys("John Doe");
        Thread.sleep(1000);

        webDriver.findElement(By.xpath("//button[@id='btn-login']")).click();
		System.out.println(webDriver.getCurrentUrl());
	}

}
