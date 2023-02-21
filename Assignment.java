package Automation_program123;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment {
	  public static void main(String[] args) {
		
	 
	System.setProperty("webdriver.chrome.driver", "\\Users\\Admin\\OneDrive\\Desktop\\Selinium Jar files\\Chrome Exe 104\\chromedriver");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	  WebElement loginBtn = driver.findElement(By.xpath("//div[@class = '_28p97w']"));
	  loginBtn.click();
	  
	  WebElement Closepopus = driver.findElement(By.xpath("//button[@class = '_2KpZ6l _2doB4z']"));
	  Closepopus.click();
	  
	  WebElement frontwindow= driver.findElement(By.xpath("//div[@class = '_1bEAQy _2iN8uD']"));
	  frontwindow.click();
	  
	  WebElement MobileICON= driver.findElement(By.xpath("//span[@class='_2I9KP_ _2WDRax']"));
	  MobileICON.click();
	  
	   List<WebElement> links = driver.findElements(By.xpath(" //a[@class='_3QN6WI']"));
	   
	   for(int i=0; i<10; i++) {
		   WebElement link = links.get(i);
		    Actions action =new Actions(driver);
		    action.moveToElement(link);
		    action.build().perform();
		    System.out.println(link.getText());
		    
		    
		    
	   }	  
}
}
