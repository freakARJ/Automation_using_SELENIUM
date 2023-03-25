package practise_session_1;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		//Checking out with a product 
		
		//driver.get("httpswww.facebook.com/");
		driver.navigate().to("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		//driver.manage().window().minimize();		
		
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("shopping_cart_container")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("ARIFUR");
		driver.findElement(By.id("last-name")).sendKeys("RAHMAN");
		driver.findElement(By.id("postal-code")).sendKeys("4700");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();
		
		Thread.sleep(7000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		
		driver.close();
		//driver.quit();
		
		
	}

}
