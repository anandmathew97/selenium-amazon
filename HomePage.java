import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	public void searchItem(WebDriver driver) {
		
        	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("SAMSUNG Galaxy S23");
        	driver.findElement(By.className("nav-input")).click();
        
	}
    	
}
