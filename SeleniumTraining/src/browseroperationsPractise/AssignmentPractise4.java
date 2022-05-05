package browseroperationsPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentPractise4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/");
		
		String ActualPageTitle=driver.getTitle();
		String ExpectedPageURL="https://demo.actitime.com/";
		if(ExpectedPageURL.equals(ActualPageTitle)) {
			System.out.println("The Current Page URL is Correct");
		}else {
			System.out.println("The Current Page URL is wrong or it has been changed");
		}
		
		
		System.out.println("the current page Title is ="+ActualPageTitle);
		System.out.println("the current page Title Lenght is ="+ActualPageTitle.length());
		
		String CurrentPageURL=driver.getCurrentUrl();
		System.out.println("the current page URL is ="+CurrentPageURL);
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		
//		driver.findElement(By.id("logoutLink")).click();
	//OR
		
		driver.findElement(By.linkText("Logout")).click();
		
		
		
//		driver.close();
	}

}
