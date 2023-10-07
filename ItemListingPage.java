import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemListingPage {
	
	public void clickItem(WebDriver driver) {
		
        driver.findElement(By.xpath("//*[text()='SAMSUNG Galaxy S23']")).click();
        
	}
    
}
