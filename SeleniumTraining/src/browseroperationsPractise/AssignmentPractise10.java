package browseroperationsPractise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentPractise10 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.gsmarena.com/");
		
		List<WebElement>MobileOptions=driver.findElements(By.cssSelector(".brandmenu-v2.light.l-box.clearfix>ul>li>a"));
		
		System.out.println("the total types of mobile in search field are = "+MobileOptions.size());
		
		for(int i=0;i<=MobileOptions.size();i++) {
			WebElement MobOpt=MobileOptions.get(i);
			String MobName=MobOpt.getText();
			System.out.println("Mobile Name is = "+MobName);
			MobileOptions=driver.findElements(By.cssSelector(".brandmenu-v2.light.l-box.clearfix>ul>li>a"));
		}
		
	}

}
