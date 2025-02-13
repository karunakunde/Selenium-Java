package seleniumbasicprogram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class RediffSanity {
	
	static int count=0;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://is.rediff.com/signup/register");
			//get the title and verify it
			//Elements on web app
			WebElement rediffLink =driver.findElement(By.xpath("//a[@class='ft11']"));
			isElementPresent(rediffLink);

			WebElement rediffIcon =driver.findElement(By.xpath("//img[@class='halflogo']"));
			isElementPresent(rediffIcon);
			
			WebElement graybar =driver.findElement(By.xpath("//div[@class='greybar']"));
			isElementPresent(graybar);
			
			WebElement startingInfo = driver.findElement(By.xpath("//p[@class='grey1']"));
			isElementPresent(startingInfo);
			
			WebElement newUserLabel =driver.findElement(By.xpath("//b[text()='New User? Register here']"));			
			isElementPresent(newUserLabel);
			WebElement tellUsLabel =driver.findElement(By.xpath("//p[@class='grey1']"));
			isElementPresent(tellUsLabel);
			WebElement yourFullNameLabel =driver.findElement(By.xpath("//div[text()='Your Full name']"));
			isElementPresent(yourFullNameLabel);
			WebElement fullnameField =driver.findElement(By.xpath("//input[@id='fullname']"));
			isElementPresent(fullnameField);
			WebElement yourEmailIdLabel =driver.findElement(By.xpath("//div[text()='Your current email ID']"));
			isElementPresent(yourEmailIdLabel);
			WebElement emailfield = driver.findElement(By.xpath("//input[@id='emailid']"));
			isElementPresent(emailfield);
			WebElement emailTip = driver.findElement(By.xpath("//p[@class='sm1 grey1']"));
			isElementPresent(emailTip);
			
			WebElement paswordLabel = driver.findElement(By.xpath("//div[text()='New password']"));
			isElementPresent(paswordLabel);
			WebElement newPassField = driver.findElement(By.xpath("//input[@id='pass']"));
			isElementPresent(newPassField);
			WebElement retypePassLabel = driver.findElement(By.xpath("//div[text()='Retype password']"));
			isElementPresent(retypePassLabel);
			WebElement retypePassfield = driver.findElement(By.xpath("//input[@id='repass']"));
			isElementPresent(retypePassfield);
			WebElement genderLabel = driver.findElement(By.xpath("//div[text()='Gender:']"));
			isElementPresent(genderLabel);
			WebElement maleRadipBtn = driver.findElement(By.xpath("//input[@type='radio' and @value='m']"));
			isElementPresent(maleRadipBtn);
			WebElement femaleRadipBtn = driver.findElement(By.xpath("//input[@type='radio' and @value='f']"));
			isElementPresent(femaleRadipBtn);
			WebElement dateofBirthLabel = driver.findElement(By.xpath("//div[text()='Date of Birth']"))	;
			isElementPresent(dateofBirthLabel);
			WebElement dayDropdown = driver.findElement(By.xpath("//select[@id='date_day']"))	;
			isElementPresent(dayDropdown);
			WebElement optionDay = driver.findElement(By.xpath("//option[text()='Day']"))	;
			isElementPresent(optionDay);
			
			WebElement option01 = driver.findElement(By.xpath("//option[text()='01']"))	;
			isElementPresent(option01);
			
			WebElement monthDropdown = driver.findElement(By.xpath("//select[@id='date_mon']"))	;
			isElementPresent(monthDropdown);
			WebElement yearDropdown = driver.findElement(By.xpath("//select[@name='Date_Year']"));
			isElementPresent(yearDropdown);
			WebElement locationLabel = driver.findElement(By.xpath("//div[text()='Location']"));
			isElementPresent(locationLabel);
			WebElement locationField = driver.findElement(By.xpath("//input[@id='signup_city']"));
			isElementPresent(locationField);
			WebElement schoolLabel = driver.findElement(By.xpath("//div[text()='School']"));
			isElementPresent(schoolLabel);
			WebElement schoolField = driver.findElement(By.xpath("//input[@id='school']"));
			isElementPresent(schoolField);
			WebElement collegeLabel = driver.findElement(By.xpath("//div[text()='College']"));
			isElementPresent(collegeLabel);
			WebElement collegeField = driver.findElement(By.xpath("//input[@id='college']"));
			isElementPresent(collegeField);
			WebElement captchLabel = driver.findElement(By.xpath("//div[text()='Enter the code given in the above image']"));
			isElementPresent(captchLabel);
			WebElement captchField = driver.findElement(By.xpath("//input[@id='fld_captcha']"));
			isElementPresent(captchField);
			WebElement registerBtn = driver.findElement(By.xpath("//input[@id='btn_register']"));
			isElementPresent(registerBtn);
			WebElement investInfoLink = driver.findElement(By.xpath("//a[text()='Investor Information']"));
			isElementPresent(investInfoLink);
			WebElement advLink = driver.findElement(By.xpath("//a[text()='Advertise with us']"));
			isElementPresent(advLink);
			WebElement disclamairLink = driver.findElement(By.xpath("//a[text()='Disclaimer']"));
			isElementPresent(disclamairLink);
			WebElement privacyLink = driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
			isElementPresent(privacyLink);
			WebElement feedbackLink = driver.findElement(By.xpath("//a[text()='Feedback']"));
			isElementPresent(feedbackLink);
			WebElement termsOfLink = driver.findElement(By.xpath("//a[text()='Terms of Use']"));
			isElementPresent(termsOfLink);
					
			fullnameField.sendKeys("karuna");
			emailfield.sendKeys("karuna@gmail.com");
			newPassField.sendKeys("pass@123");
			retypePassfield.sendKeys("pass@123");
			femaleRadipBtn.click();
			Select day = new Select(dayDropdown);
			day.selectByValue("14");
			Select month = new Select(monthDropdown);
			month.selectByVisibleText("JAN");
			Select year = new Select(yearDropdown);
			year.selectByVisibleText("2025");
			locationField.sendKeys("Nashik");
			schoolField.sendKeys("Karmaveer");
			collegeField.sendKeys("KKWagh");
			captchField.sendKeys("none");
			option01.click();
			
			
			String[] days = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
			String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
			String[] years = {"1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025"};
			
			
			WebElement fullnameTick1 = driver.findElement(By.xpath("//img[@id='tick1']"));
			isElementPresent(fullnameTick1);
						
			WebElement emailfieldTick7 = driver.findElement(By.xpath("//img[@id='tick7']"));
			isElementPresent(emailfieldTick7);
			
			WebElement newPassFieldtick2 = driver.findElement(By.xpath("//img[@id='tick2']"));
			isElementPresent(newPassFieldtick2);
			
			WebElement retypePassfieldtick3 = driver.findElement(By.xpath("//img[@id='tick3']"));
			isElementPresent(retypePassfieldtick3);			
			
			WebElement locationtick4 = driver.findElement(By.xpath("//img[@id='tick4']"));
			isElementPresent(locationtick4);
			
			WebElement schoolTick5 = driver.findElement(By.xpath("//img[@id='tick5']"));
			isElementPresent(schoolTick5);
			
			WebElement collegeFieldTick6 = driver.findElement(By.xpath("//img[@id='tick6']"));
			isElementPresent(collegeFieldTick6);
			
			Thread.sleep(3000);
			//find hidden elements(error messages)
			fullnameField.clear();
			emailfield.click();
			WebElement fullnameError = driver.findElement(By.xpath("//span[@id='msgtip1']"));
			isElementPresent(fullnameError);
			
			fullnameField.sendKeys("Kunde");
			emailfield.clear();
			newPassField.click();
			WebElement emailErr = driver.findElement(By.xpath("//span[@id='msgtip7']"));
			isElementPresent(emailErr);
			
			emailfield.sendKeys("Kunde@gmail.com");
			newPassField.clear();
			retypePassfield.click();
			WebElement passErr = driver.findElement(By.xpath("//span[@id='msgtip2']"));
			isElementPresent(passErr);
			
			newPassField.sendKeys("Kkk");
			retypePassfield.clear();
			femaleRadipBtn.click();
			WebElement repassErr = driver.findElement(By.xpath("//span[@id='msgtip3']"));
			isElementPresent(repassErr);
			
			retypePassfield.sendKeys("Kkk");
			locationField.clear();
			schoolField.click();
			WebElement locErr = driver.findElement(By.xpath("//span[@id='msgtip4']"));
			isElementPresent(locErr);
			
			locationField.sendKeys("KKwagh");
			schoolField.clear();
			collegeField.click();
			WebElement schoolErr = driver.findElement(By.xpath("//span[@id='msgtip5']"));
			isElementPresent(schoolErr);
			
			schoolField.sendKeys("KKwagh");
			collegeField.clear();
			captchField.click();
			WebElement colErr = driver.findElement(By.xpath("//span[@id='msgtip6']"));
			isElementPresent(colErr);
			
			
			registerBtn.click();
			Thread.sleep(3000);
			WebElement inavalidCaptchCode = driver.findElement(By.xpath("//div[@class='red']"));
			isElementPresent(inavalidCaptchCode);
			
			WebElement captchaImg = driver.findElement(By.xpath("//img[@id='img_captcha']"));
			isElementPresent(captchaImg);
			
			System.out.println("No of elements on web app = " + count);
			driver.close();
			}
	
	
		public static boolean isElementPresent(WebElement ele)
		{
			if(ele.isDisplayed())
			{
				count++;
				System.out.println(ele.getTagName()+": "+ele.getText() +" Element is available");
				return true;
			}
			return false;
		}
}