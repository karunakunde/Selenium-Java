package datadriventesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver webDriver;
    String browser;
    String url;

    @Parameters({"browser", "url"})
    @BeforeMethod
    void initialization(String browser,String url) throws InterruptedException {
         this.browser = browser;
         this.url = url;
       
        System.out.println(browser + "\n" + url);

           }

    @DataProvider(name = "logindata")
    String[][] getLoginData() {
        String[][] a = {
                {"John Doe", "ThisIsNotAPassword"},
                {"admin", "ThisIsNotAPassword"},
                {"John Doe", "123"},
        };
        return a;
    }
    
    @Test(dataProvider = "logindata")
    void testLogin(String username, String password) throws InterruptedException {
       

        switch (browser) {
            case "Chrome":
                webDriver = new ChromeDriver();
                break;
            case "Edge":
                webDriver = new EdgeDriver();
                break;
            default:
                webDriver = new ChromeDriver();
        }

       

        webDriver.get(url);
        webDriver.findElement(By.xpath("//a[contains(text(),'Make')]")).click();
        webDriver.findElement(By.xpath("//input[@name =\"username\"]")).sendKeys(username);
        webDriver.findElement(By.xpath("//input[@name =\"password\"]")).sendKeys(password);
        webDriver.findElement(By.xpath("//button[@id =\"btn-login\"]")).click();
        Thread.sleep(10);
        webDriver.close();
    }
}
