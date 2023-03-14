package newsrc;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart1 {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\Mojo\\Downloads\\Compressed\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.amazon.in/");
		
			
			WebElement search = driver.findElement(By.xpath("//input[@type='text'][1]"));
			search.sendKeys("vacuum cleaner for home");
			
	        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	        Thread.sleep(5000);
	       
	        driver.findElement(By.xpath("//span[contains(text(),'AmazonBasics Wet and Dry Vacuum Cleaner with 20 kPa')]")).click();
	        
//	         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		     WebElement addtocart =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='add-to-cart-button']")));		
	        ArrayList<String> urls= new ArrayList<String>(driver.getWindowHandles());
		    driver.switchTo().window(urls.get(1));
		    driver.getCurrentUrl();
	             
	        driver.findElement(By.xpath("//input[@title='Add to Shopping Cart']")).click();
	        driver.findElement(By.xpath("//input[@aria-labelledby='attachSiNoCoverage-announce']")).click();

	        
	        
			
			
			
			
			

}
}



