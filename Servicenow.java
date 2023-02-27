package assigmentselenuium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Servicenow {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	    driver.get("https://dev140572.service-now.com");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("user_name")).sendKeys("admin");
		
		driver.findElement(By.id("user_password")).sendKeys("P-qQ7@umSYz8");
		
		driver.findElement(By.id("sysverb_login")).click();
		
		driver.findElement(By.id("filter")).sendKeys("Service Catalog");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()='Service Catalog']")).click();
	
	    WebElement frame = driver.findElement(By.id("gsft_main"));
		
		driver.switchTo().frame(frame);
	
		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'iPhone 6s offers a multitude of features packaged within cutting edge design. ')]")).click();

	    
		
		WebElement dropdown = driver.findElement(By.xpath("(//select[@class='form-control cat_item_option '])[1]"));
	
        Select dp =new Select(dropdown)	;
        
        dp.selectByVisibleText("Gold");
        
        
        WebElement dropdown2= driver.findElement(By.xpath("(//select[@class='form-control cat_item_option '])[2]"));
    	
        Select drop =new Select(dropdown2)	;
        
        drop.selectByVisibleText("128");
        
        driver.findElement(By.id("oi_order_now_button")).click();
        
        WebElement findElement = driver.findElement(By.id("requesturl"));
        
        String text = findElement.getText();
        
        System.out.println(text);
        
        WebElement findElement2 = driver.findElement(By.xpath("//div[@class='notification notification-success']"));
        
        String text2 = findElement2.getText();
        
        System.out.println(text2);    
	}

}
