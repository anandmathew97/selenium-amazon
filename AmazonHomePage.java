import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonHomePage {
	
	public void searchItem(WebDriver driver) {
		
        	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
        	driver.findElement(By.className("nav-input")).click();
        
	}
    	
}
