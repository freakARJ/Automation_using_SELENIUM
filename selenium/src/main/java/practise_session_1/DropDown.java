package practise_session_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
		   
			driver.get("https://trytestingthis.netlify.app/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
			
			WebElement dropdown= driver.findElement(By.id("option"));
			Select selectObj = new Select(dropdown);
			selectObj.selectByValue("option 3");
			Thread.sleep(2000);
			selectObj.selectByVisibleText("Option 2");
}
}