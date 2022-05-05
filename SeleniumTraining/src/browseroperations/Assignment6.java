package browseroperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		
		driver.findElement(By.id("ap_email")).sendKeys("9890830432");
		
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("ap_password")).sendKeys("mbpatil503@");
		
		driver.findElement(By.id("signInSubmit")).click();
		
		
		
		driver.findElement(By.id("nav-hamburger-menu")).click();
		
	//	driver.findElement(By.id("argonath_loader")).click();
		
	//	driver.findElement(By.cssSelector("a[href='Login.html']")).click();
		
		WebElement logoutLink=driver.findElement(By.cssSelector("a[class='hmenu-item']"));
		
		logoutLink.click();
			
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		
		
		
	//	driver.findElement(By.cssSelector("input[value='SignOut']")).click();
		
		
	//	driver.findElement(By.className("hmenu-item")).click();
		
	//	driver.findElement(By.id("nav-item-signout")).click();
		
	//	driver.close();
		

	}

}