package browseroperationsPractise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentPractise8A {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement>Options=driver.findElements(By.cssSelector("#nav-xshop>a"));
		System.out.println(Options.size());
		
		
		for(int i=0;i<Options.size();i++) {
			WebElement NewOpt=Options.get(i);
			String Name=NewOpt.getText();
			System.out.println("Name of Field="+Name);
			if(Name.equals(NewOpt.getText())){
				NewOpt.click();
				String PageTitle=driver.getTitle();
				System.out.println("The Page Title Is ="+PageTitle);
				driver.navigate().back();
				Options=driver.findElements(By.cssSelector("#nav-xshop>a"));
			}
			
		}
		
		
		
		
	}

}
