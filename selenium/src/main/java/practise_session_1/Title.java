package practise_session_1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Title {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expectedTitle = "Log in to Facebook";
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
	   
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		
		
		String actualTitle = driver.getTitle();
		Assert(actualTitle,expectedTitle);
		driver.close();
	
	}

	private static void Assert(String actualTitle, String expectedTitle) {
		// TODO Auto-generated method stub
		
	}
}
