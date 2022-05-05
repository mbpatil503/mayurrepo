package browseroperationsPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssignmentPractise5 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demosite.executeautomation.com/Login.html");
		
		String Pagetitle=driver.getTitle();
		System.out.println("the page title is ="+Pagetitle);
		System.out.println("the page title length is ="+Pagetitle.length());

		String ActualPageURL=driver.getCurrentUrl();
		String ExpectedPageURL="https://demosite.executeautomation.com/Login.html";
		if(ExpectedPageURL.equals(ActualPageURL)) {
			System.out.println("the current page URL is CORRECT");
		}else {
			System.out.println("the current page URL is WRONG");
		}
		
		System.out.println("the page URL is ="+ActualPageURL);
		
		driver.findElement(By.name("UserName")).sendKeys("execution");
		
		driver.findElement(By.name("Password")).sendKeys("admin");
		
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		
//		driver.findElement(By.cssSelector("a[href='Login.html']")).click();
		
//		driver.close();
		
		
	
	}

}










