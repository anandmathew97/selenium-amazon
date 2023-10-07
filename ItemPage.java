import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemPage {
	
	public void clickItem(WebDriver driver) {
		
        driver.findElement(By.xpath("//*[text()='Apple Iphone 12 Mini']")).click();
        
	}
    
}
