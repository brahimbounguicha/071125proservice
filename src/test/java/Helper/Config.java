package Helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class Config {
	
	// je change le Webdrier 
	
	public static  WebDriver driver2;

	public static WebDriver driver; 
	
	public static void maximize() {
		driver.manage().window().maximize();
		
	}
	
	public static void attente() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}
