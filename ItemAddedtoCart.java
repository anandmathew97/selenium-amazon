import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemAddedtoCart {
	
	public void addToWishlist(WebDriver driver){
		
        	driver.findElement(By.id("add-to-cart-button")).click();
        	driver.findElement(By.xpath("//*[text()='Go to Cart']")).click();
                	
        }
        	        
}
