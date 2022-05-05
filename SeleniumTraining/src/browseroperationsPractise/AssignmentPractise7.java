package browseroperationsPractise;							//NOT COMPLETE//

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentPractise7 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.techlistic.com/");
		
		driver.findElement(By.cssSelector("div.overflowable-container.overflowable-3>div>div>ul>li>a")).click();
		
		List<WebElement> techli=driver.findElements(By.cssSelector("div.overflowable-container.overflowable-3>div>div>ul>li>a"));
		
		System.out.println("the total number of fields are = "+techli.size());
		
		for(int i=0;i<=techli.size();i++) {
			
			techli.get(i).click();
			driver.navigate().back();
			driver.findElements(By.cssSelector("div.overflowable-container.overflowable-3>div>div>ul>li>a"));
		}
		
		
		
		

	}

}
