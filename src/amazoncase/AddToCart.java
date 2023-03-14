package amazoncase;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart { 
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\Mojo\\Downloads\\Compressed\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
		
			
			WebElement search = driver.findElement(By.xpath("//input[@type='text'][1]"));
			search.sendKeys("vacuum cleaner for home");
			
	       WebElement submitButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	       submitButton .click();
	        Thread.sleep(5000);
	       
	        WebElement vacuumcleaner = driver.findElement(By.xpath("//span[contains(text(),'AmazonBasics Wet and Dry Vacuum Cleaner with 20 kPa')]"));
	        vacuumcleaner.click();
	        
//	         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		     WebElement addtocart =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='add-to-cart-button']")));		
	        ArrayList<String> urls= new ArrayList<String>(driver.getWindowHandles());
		    driver.switchTo().window(urls.get(1));
		    driver.getCurrentUrl();
		   // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		   // WebElement addtocart =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@title='Add to Shopping Cart']")));		
		    Thread.sleep(5000);
	             
		    WebElement addtocart =driver.findElement(By.xpath("//a[@title='Add to Cart']"));
	       addtocart.click();
	      // WebElement add= driver.findElement(By.xpath("//input[@aria-labelledby='attachSiNoCoverage-announce']"));
	       //String text =addtocart.getText();
	      // System.out.println(text);
	       driver.quit();

	        
	        
			
			
			
			
			

}
}
