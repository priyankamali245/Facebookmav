package amazoncase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SignUpPage {
	public static void main(String[]args)
	{
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\Master\\Downloads\\automation\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.amazon.in/");
			
			WebElement acclist = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
			WebElement singin = driver.findElement(By.xpath("//span[text()='Sign in']"));
			
			Actions act =new Actions(driver);
			act.moveToElement(acclist).moveToElement(singin).click().build().perform();
			
			WebElement mobno = driver.findElement(By.xpath("//input[@id='ap_email']"));
			mobno.sendKeys("7219166150");

			WebElement conti = driver.findElement(By.xpath("//input[@id='continue']"));
			conti.click();
			
			
		
	}

}
