package browseroperationsPractise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentPractise11 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.gsmarena.com/");
		
//Validating Home Page BY title
		String ActualPageTitle=driver.getTitle();
		String ExpectedPageTitle="GSMArena.com";
		if(ActualPageTitle.equals(ExpectedPageTitle)) {
			System.out.println("The Page is Correct");
		}else {
			System.out.println("The Page Is Wrong");
		}
		
		driver.findElement(By.cssSelector(".brandmenu-v2.light.l-box.clearfix>ul>li>a")).click();
		
		List<WebElement> SamMobile=driver.findElements(By.cssSelector(".makers>ul>li>a>strong>span"));
		
		System.out.println("The total number of Samsung Mobiles are = "+SamMobile.size());
		
		for(int i=0;i<=SamMobile.size();i++) {
			WebElement MobileName=SamMobile.get(i);
			String Name=MobileName.getText();
			System.out.println("Mobile Name= "+Name);
			SamMobile=driver.findElements(By.cssSelector(".makers>ul>li>a>strong>span"));
		}
		
		
	}

}
