package day5_class_assignment;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wd {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.get("https://skyscanner.com");
		//driver.quit();
	}

}
