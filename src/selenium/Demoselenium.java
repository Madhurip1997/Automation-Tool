package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoselenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swapnil\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
          
	    WebDriver driver=new ChromeDriver();
	    
	    driver.navigate().to("https://www.facebook.com/"); 
	    
	    driver.findElement(By.id("email")).sendKeys("admin");
	    
	    driver.findElement(By.id("pass")).sendKeys("Madhuri");
	    
	    driver.findElement(By.name("login")).click();
	    
	     Thread.sleep(9000);
	    

	    
	      
	}

}
