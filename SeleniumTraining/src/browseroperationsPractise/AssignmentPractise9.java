package browseroperationsPractise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.SeleniumUtility;

public class AssignmentPractise9 {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.get("https://www.flipkart.com/");
		
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.flipkart.com/");
		
		driver.findElement(By.cssSelector("._2QfC02>button")).click();
		
		
		
		//Validate Search Field
		WebElement SearchField=driver.findElement(By.cssSelector("._3704LK"));
		
		System.out.println(SearchField.isDisplayed());
		
		System.out.println(SearchField.isEnabled());
		
		
			
		List<WebElement> Options=driver.findElements(By.cssSelector("._37M3Pb>div"));
		
		System.out.println("Main menu options count is ="+Options.size());
		
		for(int i=0;i<Options.size();i++) {
			System.out.println(Options.get(i).getText());
			Options=driver.findElements(By.cssSelector("._37M3Pb>div"));
		}
		
		
	}

}
