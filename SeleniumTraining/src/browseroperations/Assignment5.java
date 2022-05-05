package browseroperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment5 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demosite.executeautomation.com/");
		
		driver.findElement(By.name("UserName")).sendKeys("execution");
		driver.findElement(By.name("Password")).sendKeys("admin");
		
		driver.findElement(By.name("Login")).click();
		
	//	driver.findElement(By.name("LogoutButton")).click();
		
	//	driver.close();

	}

}
